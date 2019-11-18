package com.bos.mapper;

import com.bos.model.BasPartition;

public interface BasPartitionMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(BasPartition record);

    int insertSelective(BasPartition record);

    BasPartition selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(BasPartition record);

    int updateByPrimaryKey(BasPartition record);
}