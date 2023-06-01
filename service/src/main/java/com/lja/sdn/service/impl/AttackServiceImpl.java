package com.lja.sdn.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lja.sdn.service.AttackService;
import com.lja.sdn.entity.Attack;
import com.lja.sdn.entity.Host;
import com.lja.sdn.mapper.AttackMapper;
import com.lja.sdn.mapper.HostMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lja
 * @since 2023-06-1
 */
@Service
public class AttackServiceImpl extends ServiceImpl<AttackMapper, Attack> implements AttackService {

    @Resource
    private AttackMapper attackMapper;

    @Resource
    private HostMapper hostMapper;

    /**
     *
     * @return
     */
    @Override
    public Map<String, Object> getTimeHosts() {
        List<String> timeList = new ArrayList<>();
        List<String> hostList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        List<Attack> attackList = attackMapper.getTimeHosts();
        if (attackList != null) {
            for (Attack attack : attackList) {
                Host host = hostMapper.selectOne(new QueryWrapper<Host>()
                        .eq("linkSwitch", attack.getSwitchId())
                        .eq("linkPort", attack.getInPort())
                );
                timeList.add(attack.getAttackTime());
                numList.add(attack.getNum());
                if (host != null) {
                    hostList.add("attacked:" + host.getName() + "--" + "times:" + attack.getNum());
                }
            }
        }
        map.put("timeList",timeList);
        map.put("hostList",hostList);
        map.put("numList",numList);
        return map;
    }
}
