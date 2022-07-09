package com.example.setting_springboot.dto.swutil.request;

import lombok.*;


@Data
public class YearRequestDto {
    @NonNull
    private String requestCode;

    @NonNull
    private String year;

    public YearRequestDto(String requestCode, String year){
        this.requestCode =requestCode;
        this.year = year;
    }
}
