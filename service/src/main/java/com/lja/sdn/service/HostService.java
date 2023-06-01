package com.lja.sdn.service;

import com.lja.sdn.entity.Host;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zjh
 * @since 2022-06-15
 */
public interface HostService extends IService<Host> {

    List<Integer> getSwitchHostNum();
}
