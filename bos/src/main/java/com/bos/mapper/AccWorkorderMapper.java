package com.bos.mapper;

import com.bos.model.AccWorkorder;

public interface AccWorkorderMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(AccWorkorder record);

    int insertSelective(AccWorkorder record);

    AccWorkorder selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(AccWorkorder record);

    int updateByPrimaryKey(AccWorkorder record);
}