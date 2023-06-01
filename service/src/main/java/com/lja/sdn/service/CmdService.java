package com.lja.sdn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lja.sdn.result.ExecCmdResult;
import com.lja.sdn.entity.Cmd;

public interface CmdService extends IService<Cmd> {
    ExecCmdResult executeCmd(String command);
}
