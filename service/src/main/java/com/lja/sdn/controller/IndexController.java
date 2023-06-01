package com.lja.sdn.controller;

import com.lja.sdn.result.R;
import com.lja.sdn.service.HostService;
import com.lja.sdn.service.IndexService;
import com.lja.sdn.service.SwitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author lja
 * @date 2023/6/21 16:36
 */
@CrossOrigin
@RestController
@RequestMapping("sdn/index")
public class IndexController {

    @Autowired
    private HostService hostService;

    @Autowired
    private SwitchService switchService;

    @Autowired
    private IndexService indexService;

    /**
     * 获取主机数量
     * @return 返回主机数量
     */
    @GetMapping("getHostNum")
    public R getHostNum() {
        int hostNum = hostService.count(null);
        return R.ok().data("hostNum", hostNum);
    }

    /**
     * 获取交换机数量
     * @return 返回交换机数量
     */
    @GetMapping("getSwitchNum")
    public R getSwitchNum() {
        int switchNum = switchService.count(null);
        return R.ok().data("switchNum", switchNum);
    }

//    @GetMapping("getSwitchHostNum")
//    public R getSwitchHostNum() {
//        List<Integer> hostNumList = hostService.getSwitchHostNum();
//        return R.ok().data("hostNumList", hostNumList);
//    }
//
//    @GetMapping("getPortFlowNumList")
//    public R getPortFlowNumList() {
//        Map<String, List<Integer>> portFlowNumMap = switchService.getPortFlowNumList();
//        return R.ok().data("portFlowNum",portFlowNumMap);
//    }

    /**
     * 获取
     * @return
     */
    @GetMapping("getBarChartData")
    public R getBarChartData() {
        Map<String,Object> barChartData = indexService.getBarChartData();
        return R.ok().data(barChartData);
    }

}
