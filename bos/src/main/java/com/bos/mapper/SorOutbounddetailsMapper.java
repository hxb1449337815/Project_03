package com.bos.mapper;

import com.bos.model.SorOutbounddetails;

public interface SorOutbounddetailsMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(SorOutbounddetails record);

    int insertSelective(SorOutbounddetails record);

    SorOutbounddetails selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(SorOutbounddetails record);

    int updateByPrimaryKey(SorOutbounddetails record);
}