package com.bos.mapper;

import com.bos.model.DisPropagandatask;

public interface DisPropagandataskMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(DisPropagandatask record);

    int insertSelective(DisPropagandatask record);

    DisPropagandatask selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(DisPropagandatask record);

    int updateByPrimaryKey(DisPropagandatask record);
}