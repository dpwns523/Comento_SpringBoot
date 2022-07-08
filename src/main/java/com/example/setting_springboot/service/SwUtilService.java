package com.example.setting_springboot.service;

import com.example.setting_springboot.dto.swutil.request.DateDto;
import com.example.setting_springboot.dto.swutil.request.RequestDto;
import com.example.setting_springboot.dto.swutil.response.MeanCntResponseDto;
import com.example.setting_springboot.dto.swutil.response.TotCntResponseDto;
import com.example.setting_springboot.exception.MyDateFormatException;

public interface SwUtilService {

    public TotCntResponseDto numOfConDate(DateDto dateDto) throws MyDateFormatException;
    public TotCntResponseDto numOfConYearMonth(DateDto dateDto);
    public MeanCntResponseDto meanOfDays(RequestDto meanConnectDto);

}
