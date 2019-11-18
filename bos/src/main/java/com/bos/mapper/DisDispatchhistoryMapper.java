package com.bos.mapper;

import com.bos.model.DisDispatchhistory;

public interface DisDispatchhistoryMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(DisDispatchhistory record);

    int insertSelective(DisDispatchhistory record);

    DisDispatchhistory selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(DisDispatchhistory record);

    int updateByPrimaryKey(DisDispatchhistory record);
}