package com.bos.mapper;

import com.bos.model.SyRolesmenus;

public interface SyRolesmenusMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(SyRolesmenus record);

    int insertSelective(SyRolesmenus record);

    SyRolesmenus selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(SyRolesmenus record);

    int updateByPrimaryKey(SyRolesmenus record);
}