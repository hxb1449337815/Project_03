package com.bos.mapper;

import com.bos.model.RetReturnlist;

public interface RetReturnlistMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(RetReturnlist record);

    int insertSelective(RetReturnlist record);

    RetReturnlist selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(RetReturnlist record);

    int updateByPrimaryKey(RetReturnlist record);
}