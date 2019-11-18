package com.bos.mapper;

import com.bos.model.PacStock;

public interface PacStockMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(PacStock record);

    int insertSelective(PacStock record);

    PacStock selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(PacStock record);

    int updateByPrimaryKey(PacStock record);
}