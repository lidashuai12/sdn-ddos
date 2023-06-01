package com.lja.sdn.service.impl;

import com.lja.sdn.service.IndexService;
import com.lja.sdn.entity.Switch;
import com.lja.sdn.mapper.HostMapper;
import com.lja.sdn.mapper.SwitchMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lja
 * @since 2023-06-1
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Resource
    private HostMapper hostMapper;

    @Resource
    private SwitchMapper switchMapper;

    @Override
    public Map<String, Object> getBarChartData() {
        Map<String,Object> map = new HashMap<>();
        List<Integer> hostNumList = hostMapper.getSwitchHostNum();
        List<Integer> portNumList = new ArrayList<>();
        List<Integer> flowNumList = new ArrayList<>();
        List<Switch> switchList = switchMapper.selectList(null);
        for (Switch sw : switchList) {
            portNumList.add(sw.getPorts());
            flowNumList.add(sw.getFlows());
        }
        map.put("hostNumList",hostNumList);
        map.put("portNumList",portNumList);
        map.put("flowNumList",flowNumList);
        return map;
    }
}
