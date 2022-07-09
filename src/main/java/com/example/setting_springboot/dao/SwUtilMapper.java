package com.example.setting_springboot.dao;

import com.example.setting_springboot.dto.swutil.request.YearMonthRequestDto;
import com.example.setting_springboot.dto.swutil.request.YearRequestDto;
import com.example.setting_springboot.dto.swutil.request.RequestDto;
import com.example.setting_springboot.dto.swutil.response.DepTotCntResponseDto;
import com.example.setting_springboot.dto.swutil.response.MeanCntResponseDto;
import com.example.setting_springboot.dto.swutil.response.TotCntResponseDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SwUtilMapper {
    public List<TotCntResponseDto> totCntOnDate(@Param("yearMonthRequestDto") YearMonthRequestDto yearMonthRequestDto);
    public List<TotCntResponseDto> totCntOnYearMonth(@Param("yearRequestDto") YearRequestDto yearRequestDto);
    public MeanCntResponseDto meanCntOnDays(@Param("requestDto") RequestDto requestDto);
    public List<DepTotCntResponseDto> totCntOnDepYearMonth(@Param("yearRequestDto")YearRequestDto yearRequestDto);
}
