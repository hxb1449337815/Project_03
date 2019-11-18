package com.bos.mapper;

import com.bos.model.SorAbnormal;

public interface SorAbnormalMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(SorAbnormal record);

    int insertSelective(SorAbnormal record);

    SorAbnormal selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(SorAbnormal record);

    int updateByPrimaryKey(SorAbnormal record);
}