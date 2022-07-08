package com.example.setting_springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Mapper
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);

}
