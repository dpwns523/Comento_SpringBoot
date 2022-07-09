package com.example.setting_springboot.dto.swutil.response;

import lombok.Data;
import lombok.NonNull;

@Data
public class DepTotCntResponseDto {
    private String department;
    private String date;
    private int totCnt;
    private Boolean is_success;
}
