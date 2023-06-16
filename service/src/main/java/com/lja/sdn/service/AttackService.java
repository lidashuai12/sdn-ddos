package com.lja.sdn.service;

import com.lja.sdn.entity.Attack;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lja
 * @since 2023-06-1
 */
public interface AttackService extends IService<Attack> {

    // 最近七次被攻击主机及时间集合
    //Map<String, Object> getTimeHosts();

    //最近200次被攻击主机及时间集合
    Map<String,Object> get200Times();

    //最近一个月每天被攻击的次数
    Map<Integer,Integer> getMonthAttack();
}
