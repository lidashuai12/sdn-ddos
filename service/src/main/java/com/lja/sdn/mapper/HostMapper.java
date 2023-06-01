package com.lja.sdn.mapper;

import com.lja.sdn.entity.Host;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lja
 * @since 2023-06-1
 */
@Mapper
public interface HostMapper extends BaseMapper<Host> {

    List<Integer> getSwitchHostNum();
}
