package com.bos.mapper;

import com.bos.model.LogLogistics;

public interface LogLogisticsMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(LogLogistics record);

    int insertSelective(LogLogistics record);

    LogLogistics selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(LogLogistics record);

    int updateByPrimaryKey(LogLogistics record);
}