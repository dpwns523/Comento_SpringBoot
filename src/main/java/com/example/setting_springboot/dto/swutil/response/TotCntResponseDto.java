package com.example.setting_springboot.dto.swutil.response;


import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class TotCntResponseDto {
    private String date;
    private int totCnt;
    private String requestCode;

}
