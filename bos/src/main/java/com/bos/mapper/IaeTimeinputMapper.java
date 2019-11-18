package com.bos.mapper;

import com.bos.model.IaeTimeinput;

public interface IaeTimeinputMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(IaeTimeinput record);

    int insertSelective(IaeTimeinput record);

    IaeTimeinput selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(IaeTimeinput record);

    int updateByPrimaryKey(IaeTimeinput record);
}