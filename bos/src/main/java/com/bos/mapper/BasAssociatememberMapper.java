package com.bos.mapper;

import com.bos.model.BasAssociatemember;

public interface BasAssociatememberMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(BasAssociatemember record);

    int insertSelective(BasAssociatemember record);

    BasAssociatemember selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(BasAssociatemember record);

    int updateByPrimaryKey(BasAssociatemember record);
}