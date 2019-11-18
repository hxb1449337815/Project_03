package com.bos.mapper;

import com.bos.model.SorCheckbounddetails;

public interface SorCheckbounddetailsMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(SorCheckbounddetails record);

    int insertSelective(SorCheckbounddetails record);

    SorCheckbounddetails selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(SorCheckbounddetails record);

    int updateByPrimaryKey(SorCheckbounddetails record);
}