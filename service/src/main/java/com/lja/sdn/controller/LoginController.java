package com.lja.sdn.controller;

import com.lja.sdn.result.R;
import org.springframework.web.bind.annotation.*;

/**
 * 模拟登录
 * @author lja
 * @date 2023/6/1 17:02
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
public class LoginController {

    // 前端mock/user.js中
    /*
     admin: {
        token: 'admin-token'
      }
      'admin-token': {
        roles: ['admin'],
        introduction: 'I am a super administrator',
        avatar: 'https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif',
        name: 'Super Admin'
      }
     */

    @PostMapping("login")
    //{"code":20000,"data":{"token":"admin-token"}}
    public R login(){
        return R.ok().data("token","admin-token");
    }

    @GetMapping("info")
    //{"code":20000,"data":{"roles":["admin"],"name":"admin","avatar":"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif"}}
    public R info(){
        return R.ok().data("roles","admin")
                .data("name","admin")
                .data("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }

}
