package com.bos.mapper;

import com.bos.model.SyUnits;

public interface SyUnitsMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(SyUnits record);

    int insertSelective(SyUnits record);

    SyUnits selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(SyUnits record);

    int updateByPrimaryKey(SyUnits record);
}