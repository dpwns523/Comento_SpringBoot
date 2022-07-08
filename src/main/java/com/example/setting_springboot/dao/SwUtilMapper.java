package com.example.setting_springboot.dao;

import com.example.setting_springboot.dto.swutil.request.DateDto;
import com.example.setting_springboot.dto.swutil.request.RequestDto;
import com.example.setting_springboot.dto.swutil.response.MeanCntResponseDto;
import com.example.setting_springboot.dto.swutil.response.TotCntResponseDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SwUtilMapper {
    public TotCntResponseDto totCntOnDate(@Param("dateDto")DateDto dateDto);
    public TotCntResponseDto totCntOnYearMonth(@Param("dateDto")DateDto dateDto);
    public MeanCntResponseDto meanCntOnDays(@Param("requestDto") RequestDto requestDto);
}
