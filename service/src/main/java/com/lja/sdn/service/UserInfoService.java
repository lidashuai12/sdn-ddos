package com.lja.sdn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lja.sdn.entity.UserInfo;

/**
 * @author lja
 * @since 2023-06-1
 */
public interface UserInfoService extends IService<UserInfo> {

    UserInfo login(UserInfo userInfo);

}
