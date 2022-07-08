package com.example.setting_springboot.dto.swutil.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MeanCntResponseDto {
    private int meanCnt;
    private String requestCode;
}
