package com.lja.sdn;

import com.lja.sdn.entity.Attack;
import com.lja.sdn.result.ExecCmdResult;
import com.lja.sdn.service.CmdService;
import com.lja.sdn.util.LinuxUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Slf4j
public class Test1 {
    private static List<Attack> attackList1 = new ArrayList<>();
    private static int count;
    private final String remotePath = "/home/mao/Mao/";
    @Autowired
    private CmdService cmdService;
    @Test
    public void TestCmd() throws Exception{
        LinuxUtils.cpFile(LinuxUtils.conn,"D:\\IDEA\\WorkSpace\\sdn_management\\service\\src\\main\\resources\\scripts\\start.sh",remotePath);
        //String cmds = "cd Mao/Documents/Mininet_packets/&&sudo python2 mininetTest.py&&xterm h1";
        ExecCmdResult execCmdResult = cmdService.executeCmd("sh "+remotePath+"start.sh");

        log.info(execCmdResult.toString());
    }

    @Test
    public void testList(){

        if (count < 1){
            LinuxUtils.copyFile(LinuxUtils.conn,LinuxUtils.remotePath + LinuxUtils.fileName,LinuxUtils.localPath1);
            try {
                FileUtils.copyFile(new File(LinuxUtils.localPath1 + LinuxUtils.fileName),new File(LinuxUtils.localPath2 + LinuxUtils.checkName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            attackList1 = LinuxUtils.getAttackList(LinuxUtils.localPath2 + LinuxUtils.checkName);
            count++;
        }else {
            LinuxUtils.copyFile(LinuxUtils.conn,LinuxUtils.remotePath + LinuxUtils.fileName,LinuxUtils.localPath1);
            try {
                boolean b = FileUtils.contentEquals(new File(LinuxUtils.localPath1 + LinuxUtils.fileName), new File(LinuxUtils.localPath2 + LinuxUtils.checkName));
                System.out.println(b);
                if (!b) {
                    FileUtils.copyFile(new File(LinuxUtils.localPath1 + LinuxUtils.fileName),new File(LinuxUtils.localPath2 + LinuxUtils.checkName));
                    attackList1 = LinuxUtils.getAttackList(LinuxUtils.localPath2 + LinuxUtils.checkName);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        log.info("attacklist:{}",attackList1);
    }
}
