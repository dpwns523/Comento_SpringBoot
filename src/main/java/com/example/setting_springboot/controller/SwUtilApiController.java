package com.example.setting_springboot.controller;

import com.example.setting_springboot.dto.swutil.request.DateDto;
import com.example.setting_springboot.dto.swutil.request.RequestDto;
import com.example.setting_springboot.dto.swutil.response.MeanCntResponseDto;
import com.example.setting_springboot.dto.swutil.response.TotCntResponseDto;
import com.example.setting_springboot.exception.MyDateFormatException;
import com.example.setting_springboot.service.SwUtilService;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/connectors")
public class SwUtilApiController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SwUtilService swUtilService;

    @ResponseBody
    @RequestMapping(value = "/year-month")
    public TotCntResponseDto numOfConYearMonth(String requestCode, String yearMonth){
        DateDto dateDto = new DateDto(requestCode, yearMonth);
        TotCntResponseDto totCntResponseDto = swUtilService.numOfConYearMonth(dateDto);
        return totCntResponseDto;
    }

    @ResponseBody
    @RequestMapping(value = "/year-month-day")
    public TotCntResponseDto numOfConDate(String requestCode, String date) throws MyDateFormatException {
        DateDto dateDto = new DateDto(requestCode, date);
        TotCntResponseDto totCntResponseDto = swUtilService.numOfConDate(dateDto);
        return totCntResponseDto;
    }

    @ResponseBody
    @RequestMapping(value = "/mean-day")
    public MeanCntResponseDto numOfConDate(String requestCode) {
        RequestDto requestDto = new RequestDto(requestCode);
        MeanCntResponseDto meanCntResponseDto = swUtilService.meanOfDays(requestDto);
        return meanCntResponseDto;
    }


}
