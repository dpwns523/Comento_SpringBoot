package com.example.setting_springboot.service.impl;

import com.example.setting_springboot.dao.SwUtilMapper;
import com.example.setting_springboot.dto.swutil.request.YearMonthRequestDto;
import com.example.setting_springboot.dto.swutil.request.YearRequestDto;
import com.example.setting_springboot.dto.swutil.request.RequestDto;
import com.example.setting_springboot.dto.swutil.response.DepTotCntResponseDto;
import com.example.setting_springboot.dto.swutil.response.MeanCntResponseDto;
import com.example.setting_springboot.dto.swutil.response.TotCntResponseDto;
import com.example.setting_springboot.service.SwUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SwUtilServiceImpl implements SwUtilService{

    @Autowired
    private SwUtilMapper swUtilMapper;

    @Override
    public List<TotCntResponseDto> numOfConYear(YearRequestDto yearRequestDto){
        List<TotCntResponseDto> totCntResponseDtoList = swUtilMapper.totCntOnYearMonth(yearRequestDto);
        for(TotCntResponseDto c: totCntResponseDtoList){
            if(c != null){
                c.setIs_success(true);
            }
            else c.setIs_success(false);
        }
        return totCntResponseDtoList;
    }

    @Override
    public List<TotCntResponseDto> numOfConDays(YearMonthRequestDto yearMonthRequestDto) {
        List<TotCntResponseDto> totCntResponseDtoList = swUtilMapper.totCntOnDate(yearMonthRequestDto);
        for(TotCntResponseDto c: totCntResponseDtoList){
            if(c != null){
                c.setIs_success(true);
            }
            else c.setIs_success(false);
        }
        return totCntResponseDtoList;
    }

    @Override
    public MeanCntResponseDto meanOfDays(RequestDto requestDto) {
        MeanCntResponseDto meanCntResponseDto = swUtilMapper.meanCntOnDays(requestDto);
        if(meanCntResponseDto != null){
            meanCntResponseDto.setIs_success(true);
        }
        else meanCntResponseDto.setIs_success(false);
        return meanCntResponseDto;
    }

    @Override
    public List<DepTotCntResponseDto> numOfConDepYear(YearRequestDto yearRequestDto) {
        List<DepTotCntResponseDto> depTotCntResponseDtoList = swUtilMapper.totCntOnDepYearMonth(yearRequestDto);
        for(DepTotCntResponseDto d: depTotCntResponseDtoList){
            if(d != null){
                d.setIs_success(true);
            }
            else d.setIs_success(false);
        }
        return depTotCntResponseDtoList;
    }

}
