package com.bos.mapper;

import com.bos.model.SorOutbound;

public interface SorOutboundMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(SorOutbound record);

    int insertSelective(SorOutbound record);

    SorOutbound selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(SorOutbound record);

    int updateByPrimaryKey(SorOutbound record);
}