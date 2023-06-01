package com.lja.sdn.util;

import ch.ethz.ssh2.*;
import com.lja.sdn.result.ExecCmdResult;
import com.lja.sdn.entity.Attack;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.servlet.ServletOutputStream;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author lja
 * @date 2023/5/23 22:10
 */
@Slf4j
@Repository
public class LinuxUtils {

    private static String DEFAULT_CHARSET = "UTF-8";
    public static Connection conn = null;
    public static final String fileName = "check1.txt";
    public static final String checkName = "check2.txt";
    public static final String remotePath = "/home/mao/Mao/Documents/";
    public static final String localPath1 = "D:\\IDEA\\WorkSpace\\sdn_management\\service\\src\\main\\resources\\check1\\";
    public static final String localPath2 = "D:\\IDEA\\WorkSpace\\sdn_management\\service\\src\\main\\resources\\check2\\";
    public static final String hostname = "192.168.127.4";
    public static final String user = "mao";
    public static final String password = "mao";
    public static boolean flag = login();
    public static boolean res = false;

    public static boolean login(){
        //创建远程连接，默认连接端口为22，如果不使用默认，可以使用方法
        //new Connection(ip, port)创建对象
        conn = new Connection(hostname);
        try {
            //连接远程服务器
            conn.connect();
            //使用用户名和密码登录
            log.info("登陆成功！");
            return conn.authenticateWithPassword(user, password);
        } catch (IOException e) {
            System.err.printf("用户%s密码%s登录服务器%s失败！", user, password, hostname);
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 复制到JAVA所在服务器
     * @param conn
     * @param fileName 服务器文件
     * @param localPath 本地目录
     */
    public static void copyFile(Connection conn, String fileName,String localPath){
        SCPClient sc = new SCPClient(conn);
        try {
            sc.get(fileName, localPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 流式输出，用于浏览器下载
     * @param conn
     * @param fileName
     * @param outputStream
     */
    public static void copyFile(Connection conn, String fileName, ServletOutputStream outputStream){
        SCPClient sc = new SCPClient(conn);
        try {
            sc.get(fileName, outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     */
    public static List<Attack> getAttackList(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        List<Attack> attackList = new ArrayList<>();
        try {
            //System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                //System.out.println("line " + line + ": " + tempString);
                String attackString = tempString.split("#####")[0];
                String[] split = attackString.split(",");
                Attack attack = new Attack();
                attack.setSwitchId("00:00:00:00:00:00:00:0" + split[0]);
                attack.setInPort(Integer.parseInt(split[1]));
                attack.setSrcMac(split[2]);
                attack.setDstMac(split[3]);
                attack.setSrcIp(split[4]);
                attack.setDstIp(split[5]);
                String date = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm").format(new Date());
                attack.setAttackTime(date);
                attackList.add(attack);
                line++;
            }
            reader.close();
            return attackList;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return null;
    }

    /**
     * 执行命令
     * @param connection ssh2连接对象
     * @param command 命令语句
     * @return 执行结果, 封装执行状态和执行结果
     */
    public static ExecCmdResult execCommand(Connection connection, String command){
        ExecCmdResult execCmdResult = new ExecCmdResult();
        Session session = null;
        try{
            session = connection.openSession();
            //执行命令
            session.execCommand(command);
            //解析结果
            String result = parseResult(session.getStdout());
            //解析结果为空，则表示执行命令发生了错误，尝试解析错误出输出
            if (result == null||result.length()==0){
                result = parseResult(session.getStderr());

            }else {
                execCmdResult.setFlag(true);
            }
            //设置响应结果
            execCmdResult.setResult(result);
            log.info(connection.getHostname() + ": "+command + " ==>> " +execCmdResult.getResult());
            return execCmdResult;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static String parseResult(InputStream inputStream) throws IOException{
        //读取输出流内容
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream,DEFAULT_CHARSET));
        StringBuffer resultSB = new StringBuffer();
        String line;
        while((line = br.readLine()) != null){
            resultSB.append(line).append("\n");
        }
        //替换换行符
        String result = resultSB.toString().replaceAll("[\\t\\n\\r]", "");
        return result;

    }


    /**
     * 复制到Linux所在服务器
     * @param conn
     * @param fileName 项目文件
     * @param remotePath linux目录
     */
    public static void cpFile(Connection conn, String fileName,String remotePath){
        SCPClient sc = new SCPClient(conn);
        try {
            sc.put(fileName,remotePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public static void main(String[] args) throws IOException {
        boolean flag = LinuxUtils.login();
        if (flag) System.out.println("连接192.168.127.4成功");
//        if (!res) {
//            copyFile(conn,remotePath + fileName,localPath1);
//            FileUtils.copyFile(new File(localPath1 + fileName),new File(localPath2 + checkName));
//            res = true;
//        }else {
//            copyFile(conn,remotePath + fileName,localPath1);
//            boolean b = FileUtils.contentEquals(new File(localPath1 + fileName), new File(localPath2 + checkName));
//            System.out.println(b);
//            if (!b) {
//                FileUtils.copyFile(new File(localPath1 + fileName),new File(localPath2 + checkName));
//            }
//        }
    }

}