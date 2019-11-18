package com.bos.mapper;

import com.bos.model.BiglogLogisticscontroltable;

public interface BiglogLogisticscontroltableMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(BiglogLogisticscontroltable record);

    int insertSelective(BiglogLogisticscontroltable record);

    BiglogLogisticscontroltable selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(BiglogLogisticscontroltable record);

    int updateByPrimaryKey(BiglogLogisticscontroltable record);
}