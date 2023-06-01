package com.lja.sdn.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lja.sdn.entity.UserInfo;
import com.lja.sdn.mapper.UserInfoMapper;
import com.lja.sdn.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;

/**
 * @author lja
 * @since 2023-06-1
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo login(UserInfo userInfo) {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name",userInfo.getUsername());
        queryWrapper.eq("password", DigestUtils.md5DigestAsHex(userInfo.getPassword().getBytes()));
        return userInfoMapper.selectOne(queryWrapper);
    }

    public static void main(String[] args) {
        System.out.println(DigestUtils.md5DigestAsHex("admin".getBytes()));
    }

}
