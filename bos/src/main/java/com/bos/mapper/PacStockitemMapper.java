package com.bos.mapper;

import com.bos.model.PacStockitem;

public interface PacStockitemMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(PacStockitem record);

    int insertSelective(PacStockitem record);

    PacStockitem selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(PacStockitem record);

    int updateByPrimaryKey(PacStockitem record);
}