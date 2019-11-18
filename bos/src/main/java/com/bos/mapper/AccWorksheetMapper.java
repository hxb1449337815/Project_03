package com.bos.mapper;

import com.bos.model.AccWorksheet;

public interface AccWorksheetMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(AccWorksheet record);

    int insertSelective(AccWorksheet record);

    AccWorksheet selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(AccWorksheet record);

    int updateByPrimaryKey(AccWorksheet record);
}