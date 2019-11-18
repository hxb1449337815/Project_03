package com.bos.mapper;

import com.bos.model.BasArea;

public interface BasAreaMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(BasArea record);

    int insertSelective(BasArea record);

    BasArea selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(BasArea record);

    int updateByPrimaryKey(BasArea record);
}