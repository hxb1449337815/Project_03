package com.bos.mapper;

import com.bos.model.IaeArrival;

public interface IaeArrivalMapper {
    int deleteByPrimaryKey(String ID);

    int insert(IaeArrival record);

    int insertSelective(IaeArrival record);

    IaeArrival selectByPrimaryKey(String ID);

    int updateByPrimaryKeySelective(IaeArrival record);

    int updateByPrimaryKey(IaeArrival record);
}