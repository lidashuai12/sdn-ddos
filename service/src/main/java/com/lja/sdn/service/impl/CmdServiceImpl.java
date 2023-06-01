package com.lja.sdn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lja.sdn.result.ExecCmdResult;
import com.lja.sdn.entity.Cmd;
import com.lja.sdn.mapper.CmdMapper;
import com.lja.sdn.service.CmdService;
import com.lja.sdn.util.LinuxUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 * @author lja
 * @since 2023-06-1
 */
@Slf4j
@Service
public class CmdServiceImpl extends ServiceImpl<CmdMapper, Cmd> implements CmdService {
    @Override
    public ExecCmdResult executeCmd(String command) {
        ExecCmdResult execCmdResult;
        boolean login = LinuxUtils.login();
        if (!login){
            return null;
        }else {
            execCmdResult = LinuxUtils.execCommand(LinuxUtils.conn, command);
        }
        return execCmdResult;
    }

//    @Override
//    public ExecCmdResult executeCmd(String command) {
//        ExecCmdResult execCmdResult = null;
//        if (LinuxUtils.conn == null){
//            log.info("尚未登录！");
//            LinuxUtils.login();
//            execCmdResult = LinuxUtils.execCommand(LinuxUtils.conn, command);
//        }else {
//            execCmdResult = LinuxUtils.execCommand(LinuxUtils.conn, command);
//        }
//        return execCmdResult;
//    }
}
