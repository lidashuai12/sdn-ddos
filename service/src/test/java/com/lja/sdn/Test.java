package com.lja.sdn;

import com.lja.sdn.result.ExecCmdResult;
import com.lja.sdn.service.CmdService;
import com.lja.sdn.util.LinuxUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Test {
    private final String remotePath = "/home/mao/Mao/";
    @Autowired
    private CmdService cmdService;
    @org.junit.Test
    public void TestCmd() throws Exception{
        LinuxUtils.cpFile(LinuxUtils.conn,"D:\\IDEA\\WorkSpace\\sdn_management\\service\\src\\main\\resources\\scripts\\start.sh",remotePath);
        //String cmds = "cd Mao/Documents/Mininet_packets/&&sudo python2 mininetTest.py&&xterm h1";
        ExecCmdResult execCmdResult = cmdService.executeCmd("sh "+remotePath+"start.sh");

        log.info(execCmdResult.toString());
    }
}
