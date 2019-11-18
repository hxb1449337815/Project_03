package com.bos.mapper;

import com.bos.model.SorStorage;

public interface SorStorageMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(SorStorage record);

    int insertSelective(SorStorage record);

    SorStorage selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(SorStorage record);

    int updateByPrimaryKey(SorStorage record);
}