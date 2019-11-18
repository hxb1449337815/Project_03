package com.bos.mapper;

import com.bos.model.BasShuttlebus;

public interface BasShuttlebusMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(BasShuttlebus record);

    int insertSelective(BasShuttlebus record);

    BasShuttlebus selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(BasShuttlebus record);

    int updateByPrimaryKey(BasShuttlebus record);
}