package com.lja.sdn.Interceptor;

import com.lja.sdn.entity.UserInfo;
import com.lja.sdn.mapper.UserInfoMapper;
import com.lja.sdn.service.UserInfoService;
import com.lja.sdn.util.JwtUtils;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        //String id = JwtUtils.getMemberIdByJwtToken(request);
        //UserInfo user = userInfoMapper.selectById(Integer.parseInt(id));
        //throw new Exception("用户未登录！");
        boolean b = JwtUtils.checkToken(request);
        if (!b){
            throw new Exception("用户未登录！");
        }
        return b;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
