package com.example.setting_springboot.controller;

import com.example.setting_springboot.dto.swutil.request.YearMonthRequestDto;
import com.example.setting_springboot.dto.swutil.request.YearRequestDto;
import com.example.setting_springboot.dto.swutil.request.RequestDto;
import com.example.setting_springboot.dto.swutil.response.DepTotCntResponseDto;
import com.example.setting_springboot.dto.swutil.response.MeanCntResponseDto;
import com.example.setting_springboot.dto.swutil.response.TotCntResponseDto;
import com.example.setting_springboot.service.SwUtilService;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/connectors")
public class SwUtilApiController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SwUtilService swUtilService;

    @ResponseBody
    @RequestMapping(value = "/year")
    public List<TotCntResponseDto> numOfConYear(String requestCode, String year){
        YearRequestDto yearRequestDto = new YearRequestDto(requestCode, year);
        return swUtilService.numOfConYear(yearRequestDto);

    }

    @ResponseBody
    @RequestMapping(value = "/year-month")
    public List<TotCntResponseDto> numOfConDays(String requestCode, String yearMonth){
        YearMonthRequestDto yearMonthRequestDto = new YearMonthRequestDto(requestCode, yearMonth);
        return swUtilService.numOfConDays(yearMonthRequestDto);

    }

    @ResponseBody
    @RequestMapping(value = "/mean-day")
    public MeanCntResponseDto MeanOfConDays(String requestCode) {
        RequestDto requestDto = new RequestDto(requestCode);
        MeanCntResponseDto meanCntResponseDto = swUtilService.meanOfDays(requestDto);
        return meanCntResponseDto;
    }

    @ResponseBody
    @RequestMapping(value = "/department-year")
    public List<DepTotCntResponseDto> numOfConDepYear(String requestCode, String year) {
        YearRequestDto yearRequestDto = new YearRequestDto(requestCode, year);
        return swUtilService.numOfConDepYear(yearRequestDto);
    }


}
