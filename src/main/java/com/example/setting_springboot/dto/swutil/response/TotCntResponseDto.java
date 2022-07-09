package com.example.setting_springboot.dto.swutil.response;



import lombok.Data;


@Data
public class TotCntResponseDto {
    private String date;
    private int totCnt;
    private Boolean is_success;

}
