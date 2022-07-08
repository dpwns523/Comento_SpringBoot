package com.example.setting_springboot.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = MyDateFormatException.class)
    public Map<String, String> ExceptionHandler(MyDateFormatException e){

        Map<String, String> map = new HashMap<>();
        map.put("message", e.getMessage());

        return map;
    }
}
