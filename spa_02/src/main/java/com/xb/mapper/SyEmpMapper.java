package com.xb.mapper;

import com.xb.model.SyEmp;

public interface SyEmpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SyEmp record);

    int insertSelective(SyEmp record);

    SyEmp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SyEmp record);

    int updateByPrimaryKey(SyEmp record);
}