package com.example.setting_springboot.service.impl;

import com.example.setting_springboot.dao.SwUtilMapper;
import com.example.setting_springboot.dto.swutil.request.DateDto;
import com.example.setting_springboot.dto.swutil.request.RequestDto;
import com.example.setting_springboot.dto.swutil.response.MeanCntResponseDto;
import com.example.setting_springboot.dto.swutil.response.TotCntResponseDto;
import com.example.setting_springboot.exception.MyDateFormatException;
import com.example.setting_springboot.service.SwUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class SwUtilServiceImpl implements SwUtilService{

    @Autowired
    private SwUtilMapper swUtilMapper;

    @Override
    public TotCntResponseDto numOfConYearMonth(DateDto dateDto){
        return swUtilMapper.totCntOnYearMonth(dateDto);
    }

    @Override
    public TotCntResponseDto numOfConDate(DateDto dateDto) throws MyDateFormatException {
        String date = dateDto.getDate();
        // Todo : Validation으로 처리하는 것으로 변경
        if(date != null){
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMdd");
                LocalDate check = LocalDate.parse(date, formatter);
            }catch (Exception e){
                throw new MyDateFormatException("형식이 올바르지 않습니다. Ex: yyMMdd");
            }
        }
        return swUtilMapper.totCntOnDate(dateDto);
    }

    @Override
    public MeanCntResponseDto meanOfDays(RequestDto requestDto) {
        return swUtilMapper.meanCntOnDays(requestDto);
    }
}
