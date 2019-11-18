package com.bos.mapper;

import com.bos.model.SyRole;

public interface SyRoleMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(SyRole record);

    int insertSelective(SyRole record);

    SyRole selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(SyRole record);

    int updateByPrimaryKey(SyRole record);
}