package com.bos.mapper;

import com.bos.model.LogLogisticsdetails;

public interface LogLogisticsdetailsMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(LogLogisticsdetails record);

    int insertSelective(LogLogisticsdetails record);

    LogLogisticsdetails selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(LogLogisticsdetails record);

    int updateByPrimaryKey(LogLogisticsdetails record);
}