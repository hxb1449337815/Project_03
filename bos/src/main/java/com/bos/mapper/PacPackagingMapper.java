package com.bos.mapper;

import com.bos.model.PacPackaging;

public interface PacPackagingMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(PacPackaging record);

    int insertSelective(PacPackaging record);

    PacPackaging selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(PacPackaging record);

    int updateByPrimaryKey(PacPackaging record);
}