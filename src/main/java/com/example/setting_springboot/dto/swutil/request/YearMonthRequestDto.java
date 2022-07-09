package com.example.setting_springboot.dto.swutil.request;

import lombok.Data;
import lombok.NonNull;

@Data
public class YearMonthRequestDto {
    @NonNull
    private String requestCode;

    @NonNull
    private String yearMonth;

    public YearMonthRequestDto(String requestCode, String yearMonth){
        this.requestCode =requestCode;
        this.yearMonth = yearMonth;
    }
}
