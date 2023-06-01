package com.lja.sdn.task;

/**
 * @author lja
 * @since 2023-06-1
 */
//@Component
//@EnableScheduling
public class CheckAttackTask {

//    public boolean res = false;
//
//    // 定时任务，每格5秒执行一次
//    //@Scheduled(cron = "0/5 * * * * ?")
//    public void task() throws IOException, InterruptedException {
//        System.out.println("task---->时间: " + new Date());
//        if (!res) {
//            LinuxUtils.copyFile(LinuxUtils.conn,LinuxUtils.remotePath + LinuxUtils.fileName,LinuxUtils.localPath1);
//            FileUtils.copyFile(new File(LinuxUtils.localPath1 + LinuxUtils.fileName),new File(LinuxUtils.localPath2 + LinuxUtils.checkName));
//            res = true;
//        }else {
//            LinuxUtils.copyFile(LinuxUtils.conn,LinuxUtils.remotePath + LinuxUtils.fileName,LinuxUtils.localPath1);
//            boolean b = FileUtils.contentEquals(new File(LinuxUtils.localPath1 + LinuxUtils.fileName), new File(LinuxUtils.localPath2 + LinuxUtils.checkName));
//            System.out.println(b);
//            if (!b) {
//                FileUtils.copyFile(new File(LinuxUtils.localPath1 + LinuxUtils.fileName),new File(LinuxUtils.localPath2 + LinuxUtils.checkName));
//            }
//        }
//    }

}
