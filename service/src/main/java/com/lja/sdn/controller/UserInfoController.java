package com.lja.sdn.controller;

import com.lja.sdn.entity.UserInfo;
import com.lja.sdn.result.R;
import com.lja.sdn.service.UserInfoService;
import com.lja.sdn.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * vue-admin自定义用户登录
 * @author lja
 * @date 2023/6/1 16:32
 */
@CrossOrigin
@RestController
@RequestMapping("/userinfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 添加用户
     * @param userInfo 用户信息对象实体
     * @return 返回添加结果
     */
    @PostMapping("addUser")
    public R addUser(@RequestBody UserInfo userInfo) {
        userInfo.setPassword(DigestUtils.md5DigestAsHex(userInfo.getPassword().getBytes()));
        userInfo.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        userInfoService.save(userInfo);
        return R.ok();
    }

    /**
     * 登录
     * @param userInfo 封装用户信息实体
     * @return
     */
    @PostMapping("login")
    public R login(@RequestBody UserInfo userInfo) {
        UserInfo user = userInfoService.login(userInfo);
        String token = JwtUtils.getJwtToken(user.getId().toString(), user.getUsername());
        return R.ok().data("token",token);
    }

    /**
     * 返回登录用户信息
     * @param token 携带用户token
     * @return 返回模型中携带map，包含用户名和头像
     */
    @GetMapping("info")
    public R getInfo(String token) {
        String userId = JwtUtils.getUserIdByJwtToken(token);
        UserInfo userInfo = userInfoService.getById(userId);
        Map<String,Object> map = new HashMap<>();
        map.put("name",userInfo.getUsername());
        map.put("avatar",userInfo.getAvatar());
        return R.ok().data(map);
    }
}
