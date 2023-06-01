package com.lja.sdn.service.impl;

import com.lja.sdn.entity.Switch;
import com.lja.sdn.mapper.SwitchMapper;
import com.lja.sdn.service.SwitchService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lja
 * @since 2023-06-1
 */
@Service
public class SwitchServiceImpl extends ServiceImpl<SwitchMapper, Switch> implements SwitchService {

//    @Autowired
//    private SwitchMapper switchMapper;
//
//    @Override
//    public Map<String, List<Integer>> getPortFlowNumList() {
//        Map<String, List<Integer>> map = new HashMap<>();
//        List<Integer> portNumList = new ArrayList<>();
//        List<Integer> flowNumList = new ArrayList<>();
//        List<Switch> switchList = switchMapper.selectList(null);
//        for (Switch sw : switchList) {
//            portNumList.add(sw.getPorts());
//            flowNumList.add(sw.getFlows());
//        }
//        map.put("portNumList",portNumList);
//        map.put("flowNumList",flowNumList);
//        return map;
//    }

}
