package com.lja.sdn.controller;

import com.lja.sdn.result.R;
import com.lja.sdn.result.ExecCmdResult;
import com.lja.sdn.service.CmdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * ssh执行命令
 * @author lja
 * @since 2023-05-23
 */
@RestController
@RequestMapping("/sdn/cmd")
public class CmdController {
    @Autowired
    private CmdService cmdService;

    @PostMapping("/addFlows/{command}")
    public R addFlows(@PathVariable String command){
        ExecCmdResult execCmdResult = cmdService.executeCmd(command);
        Map<String,Object> map = new HashMap<>();
        map.put("cmdResult",execCmdResult);
        return R.ok().data(map);
    }
}
