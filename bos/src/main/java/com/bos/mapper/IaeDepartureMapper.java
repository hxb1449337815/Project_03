package com.bos.mapper;

import com.bos.model.IaeDeparture;

public interface IaeDepartureMapper {
    int deleteByPrimaryKey(String ID);

    int insert(IaeDeparture record);

    int insertSelective(IaeDeparture record);

    IaeDeparture selectByPrimaryKey(String ID);

    int updateByPrimaryKeySelective(IaeDeparture record);

    int updateByPrimaryKey(IaeDeparture record);
}