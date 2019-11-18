package com.bos.mapper;

import com.bos.model.SyMenus;

public interface SyMenusMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(SyMenus record);

    int insertSelective(SyMenus record);

    SyMenus selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(SyMenus record);

    int updateByPrimaryKey(SyMenus record);
}