package com.bos.mapper;

import com.bos.model.BasSubstitute;

public interface BasSubstituteMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(BasSubstitute record);

    int insertSelective(BasSubstitute record);

    BasSubstitute selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(BasSubstitute record);

    int updateByPrimaryKey(BasSubstitute record);
}