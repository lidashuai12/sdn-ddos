package com.lja.sdn.service.impl;

import com.lja.sdn.entity.Host;
import com.lja.sdn.mapper.HostMapper;
import com.lja.sdn.service.HostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lja
 * @since 2023-06-1
 */
@Service
public class HostServiceImpl extends ServiceImpl<HostMapper, Host> implements HostService {

    @Resource
    private HostMapper hostMapper;

    @Override
    public List<Integer> getSwitchHostNum() {
        return hostMapper.getSwitchHostNum();
    }
}
