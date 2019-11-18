package com.parkingpass.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object defaultExceptionHandler(Exception e){
        e.printStackTrace();
        return "页面正忙，请稍后访问";
    }

}
