package com.example.setting_springboot.dto.swutil.request;

import lombok.*;


@Data
public class DateDto {
    @NonNull
    private String requestCode;

    @NonNull
    private String date;

    public DateDto(String requestCode, String date){
        this.requestCode =requestCode;
        this.date = date;
    }
}
