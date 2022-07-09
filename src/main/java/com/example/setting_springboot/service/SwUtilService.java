package com.example.setting_springboot.service;

import com.example.setting_springboot.dto.swutil.request.YearMonthRequestDto;
import com.example.setting_springboot.dto.swutil.request.YearRequestDto;
import com.example.setting_springboot.dto.swutil.request.RequestDto;
import com.example.setting_springboot.dto.swutil.response.DepTotCntResponseDto;
import com.example.setting_springboot.dto.swutil.response.MeanCntResponseDto;
import com.example.setting_springboot.dto.swutil.response.TotCntResponseDto;

import java.util.List;

public interface SwUtilService {

    public List<TotCntResponseDto> numOfConDays(YearMonthRequestDto yearMonthRequestDto);
    public List<TotCntResponseDto> numOfConYear(YearRequestDto yearRequestDto);
    public MeanCntResponseDto meanOfDays(RequestDto meanConnectDto);
    public List<DepTotCntResponseDto> numOfConDepYear(YearRequestDto yearRequestDto);

}
