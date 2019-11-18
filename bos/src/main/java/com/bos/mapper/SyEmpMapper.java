package com.bos.mapper;

import com.bos.model.SyEmp;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SyEmpMapper {

    int deleteByPrimaryKey(Short ID);

    int insert(SyEmp record);

    int insertSelective(SyEmp record);

    SyEmp selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(SyEmp record);

    int updateByPrimaryKey(SyEmp record);

    @Select("select * from SY_EMP")
    List<SyEmp> getList();
}