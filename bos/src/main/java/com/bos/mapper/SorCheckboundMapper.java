package com.bos.mapper;

import com.bos.model.SorCheckbound;

public interface SorCheckboundMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(SorCheckbound record);

    int insertSelective(SorCheckbound record);

    SorCheckbound selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(SorCheckbound record);

    int updateByPrimaryKey(SorCheckbound record);
}