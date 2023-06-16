package com.lja.sdn.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lja.sdn.entity.Port;
import com.lja.sdn.service.AttackService;
import com.lja.sdn.entity.Attack;
import com.lja.sdn.entity.Host;
import com.lja.sdn.mapper.AttackMapper;
import com.lja.sdn.mapper.HostMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Service
public class AttackServiceImpl extends ServiceImpl<AttackMapper, Attack> implements AttackService {

    @Resource
    private AttackMapper attackMapper;

    @Resource
    private HostMapper hostMapper;

    @Override
    public Map<String, Object> get200Times() {
        Map<Integer,Integer> port_mapOfsw1 = new HashMap<>();
        Map<Integer,Integer> port_mapOfsw2 = new HashMap<>();
        Map<Integer,Integer> port_mapOfsw3 = new HashMap<>();
        Map<Integer,Integer> port_mapOfsw4 = new HashMap<>();

        List<String> timeList = new ArrayList<>();
        List<String> hostList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        List<Port> inPortList = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        Map<String,Map<Integer,Integer>> hostmap = new HashMap<>();


        List<Attack> attackList = attackMapper.get200Times();
        if (attackList != null) {
            for (Attack attack : attackList) {
                Integer inPort = attack.getInPort(); //获取攻击端口号
                String attackTime = attack.getAttackTime();//获取攻击时间
                String[] split = attack.getSwitchId().split(":");
                String switchId = split[split.length - 1]; //获取所在交换机并取交换机id末尾

                Host host = hostMapper.selectOne(new QueryWrapper<Host>()
                        .eq("linkSwitch", attack.getSwitchId())
                        .eq("linkPort", inPort)
                );  //对于每一条攻击记录，根据每个主机所连接的交换机和端口定位主机

                timeList.add(attackTime);
                //numList.add(attack.getNum());
                //获取每个交换机各个端口受攻击的情况
                switch (switchId) {
                    case "01": {
                        //inPortCount1[inPort]++;
                        port_mapOfsw1.put(inPort,port_mapOfsw1.getOrDefault(inPort,0)+1);
                        break;
                    }
                    case "02": {
                        port_mapOfsw2.put(inPort,port_mapOfsw1.getOrDefault(inPort,0)+1);
                        break;
                    }
                    case "03": {
                        port_mapOfsw3.put(inPort,port_mapOfsw1.getOrDefault(inPort,0)+1);
                        break;
                    }
                    default: {
                        port_mapOfsw4.put(inPort,port_mapOfsw1.getOrDefault(inPort,0)+1);
                        break;
                    }
                }
                if (host != null) {
                    //hostList.add("attacked:" + host.getName() + "--" + "times:" + attack.getNum());
                    hostList.add("attacked:" + host.getName());
                }
            }
        }
//        for (int i = 1; i < inPortCount.length; i++) {
//            Port port = new Port();
//            port.setPort(i);
//            port.setTimes(inPortCount[i]);
//            inPortList.add(port);
//        }


        System.out.println(inPortList);
        map.put("sw1port",port_mapOfsw1);
        map.put("sw2port",port_mapOfsw2);
        map.put("sw3port",port_mapOfsw3);
        map.put("sw4port",port_mapOfsw4);

        map.put("timeList",timeList);
        map.put("hostList",hostList);
        map.put("numList",numList);
        map.put("inPortList",inPortList); //请求入端口信息

        log.info("map:{}",map);
        return map;
    }

    /**
     *
     * @return
     */
//    @Override
//    public Map<String, Object> getTimeHosts() {
//        List<String> timeList = new ArrayList<>();
//        List<String> hostList = new ArrayList<>();
//        List<Integer> numList = new ArrayList<>();
//        Map<String, Object> map = new HashMap<>();
//        List<Attack> attackList = attackMapper.getTimeHosts();
//        if (attackList != null) {
//            for (Attack attack : attackList) {
//                Host host = hostMapper.selectOne(new QueryWrapper<Host>()
//                        .eq("linkSwitch", attack.getSwitchId())
//                        .eq("linkPort", attack.getInPort())
//                );  //对于每一条攻击记录，根据每个主机所连接的交换机和端口定位主机
//                timeList.add(attack.getAttackTime());
//                numList.add(attack.getNum());
//                if (host != null) {
//                    hostList.add("attacked:" + host.getName() + "--" + "times:" + attack.getNum());
//                }
//            }
//        }
//        map.put("timeList",timeList);
//        map.put("hostList",hostList);
//        map.put("numList",numList);
//
//        log.info("map:{}",map);
//        return map;
//    }
//    @Override
//    public Map<String, Object> getTimeHosts() {
//        int[] inPortCount = new int[6];  //每个交换机端口个数，统计每个端口受攻击次数
//        List<String> timeList = new ArrayList<>();
//        List<String> hostList = new ArrayList<>();
//        List<Integer> numList = new ArrayList<>();
//        List<Port> inPortList = new ArrayList<>();
//        Map<String, Object> map = new HashMap<>();
//
//        List<Attack> attackList = attackMapper.getTimeHosts();
//        if (attackList != null) {
//            for (Attack attack : attackList) {
//                Host host = hostMapper.selectOne(new QueryWrapper<Host>()
//                        .eq("linkSwitch", attack.getSwitchId())
//                        .eq("linkPort", attack.getInPort())
//                );  //对于每一条攻击记录，根据每个主机所连接的交换机和端口定位主机
//                timeList.add(attack.getAttackTime());
//                numList.add(attack.getNum());
//                inPortCount[attack.getInPort()]++;
//                if (host != null) {
//                    hostList.add("attacked:" + host.getName() + "--" + "times:" + attack.getNum());
//                }
//            }
//        }
//        for (int i = 1; i < inPortCount.length; i++) {
//            Port port = new Port();
//            port.setPort(i);
//            port.setTimes(inPortCount[i]);
//            inPortList.add(port);
//        }
//        System.out.println(inPortList);
//        map.put("timeList",timeList);
//        map.put("hostList",hostList);
//        map.put("numList",numList);
//        map.put("inPortList",inPortList); //请求入端口信息
//
//        log.info("map:{}",map);
//        return map;
//    }


    @Override
    public Map<String, Object> getTimeHosts() {
        Map<Integer,Integer> port_mapOfsw1 = new HashMap<>();
        Map<Integer,Integer> port_mapOfsw2 = new HashMap<>();
        Map<Integer,Integer> port_mapOfsw3 = new HashMap<>();
        Map<Integer,Integer> port_mapOfsw4 = new HashMap<>();

        List<String> timeList = new ArrayList<>();
        List<String> hostList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        List<Port> inPortList = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        Map<String,Map<Integer,Integer>> hostmap = new HashMap<>();


        List<Attack> attackList = attackMapper.getTimeHosts();
        if (attackList != null) {
            for (Attack attack : attackList) {
                Integer inPort = attack.getInPort(); //获取攻击端口号
                String attackTime = attack.getAttackTime();//获取攻击时间
                String[] split = attack.getSwitchId().split(":");
                String switchId = split[split.length - 1]; //获取所在交换机并取交换机id末尾

                Host host = hostMapper.selectOne(new QueryWrapper<Host>()
                        .eq("linkSwitch", attack.getSwitchId())
                        .eq("linkPort", inPort)
                );  //对于每一条攻击记录，根据每个主机所连接的交换机和端口定位主机

                timeList.add(attackTime);
                //numList.add(attack.getNum());
                //获取每个交换机各个端口受攻击的情况
                switch (switchId) {
                    case "01": {
                        //inPortCount1[inPort]++;
                        port_mapOfsw1.put(inPort,port_mapOfsw1.getOrDefault(inPort,0)+1);
                        break;
                    }
                    case "02": {
                        port_mapOfsw2.put(inPort,port_mapOfsw2.getOrDefault(inPort,0)+1);
                        break;
                    }
                    case "03": {
                        port_mapOfsw3.put(inPort,port_mapOfsw3.getOrDefault(inPort,0)+1);
                        break;
                    }
                    default: {
                        port_mapOfsw4.put(inPort,port_mapOfsw4.getOrDefault(inPort,0)+1);
                        break;
                    }
                }
                if (host != null) {
                    //hostList.add("attacked:" + host.getName() + "--" + "times:" + attack.getNum());
                    hostList.add("attacked:" + host.getName());
                }
            }
        }
//        for (int i = 1; i < inPortCount.length; i++) {
//            Port port = new Port();
//            port.setPort(i);
//            port.setTimes(inPortCount[i]);
//            inPortList.add(port);
//        }


        System.out.println(inPortList);
        map.put("sw1port",port_mapOfsw1);
        map.put("sw2port",port_mapOfsw2);
        map.put("sw3port",port_mapOfsw3);
        map.put("sw4port",port_mapOfsw4);

        map.put("timeList",timeList);
        map.put("hostList",hostList);
        map.put("numList",numList);
        map.put("inPortList",inPortList); //请求入端口信息

        log.info("map:{}",map);
        return map;
    }

    @Override
    public Map<Integer,Integer> getMonthAttack() {
        Map<Integer,Integer> map = new HashMap<>();
        List<Attack> monthAttack = attackMapper.getMonthAttack();
        log.info("monthattack:{}",monthAttack);
        for (Attack attack : monthAttack) {
            String split = attack.getMday().substring(8);
            log.info("day:{}",split);
            map.put(Integer.parseInt(split),attack.getMcount());
        }
        return map;
    }
}
