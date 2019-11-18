package com.bos.mapper;

import com.bos.model.BasZoneinfo;

public interface BasZoneinfoMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(BasZoneinfo record);

    int insertSelective(BasZoneinfo record);

    BasZoneinfo selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(BasZoneinfo record);

    int updateByPrimaryKey(BasZoneinfo record);
}