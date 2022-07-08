package com.example.setting_springboot.exception;

import org.springframework.http.HttpStatus;

public class MyDateFormatException extends Exception{

    public MyDateFormatException(String message){
        super("DateFormatException: " + message);
    }
}
