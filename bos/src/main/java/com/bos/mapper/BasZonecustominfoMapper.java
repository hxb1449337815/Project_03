package com.bos.mapper;

import com.bos.model.BasZonecustominfo;

public interface BasZonecustominfoMapper {
    int deleteByPrimaryKey(Short CUSTOMCODE);

    int insert(BasZonecustominfo record);

    int insertSelective(BasZonecustominfo record);

    BasZonecustominfo selectByPrimaryKey(Short CUSTOMCODE);

    int updateByPrimaryKeySelective(BasZonecustominfo record);

    int updateByPrimaryKey(BasZonecustominfo record);
}