package com.bos.mapper;

import com.bos.model.LogTrack;

public interface LogTrackMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(LogTrack record);

    int insertSelective(LogTrack record);

    LogTrack selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(LogTrack record);

    int updateByPrimaryKey(LogTrack record);
}