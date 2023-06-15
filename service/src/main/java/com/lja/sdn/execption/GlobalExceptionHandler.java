package com.lja.sdn.execption;

import com.lja.sdn.result.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public R handleException(Exception e) {
        String message = e.getMessage();
        if (message == null || message.equals("")) {
            message = "服务器出错！";
        }
        return R.error().data("msg", message);
    }
}
