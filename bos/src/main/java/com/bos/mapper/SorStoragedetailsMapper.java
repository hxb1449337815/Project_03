package com.bos.mapper;

import com.bos.model.SorStoragedetails;

public interface SorStoragedetailsMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(SorStoragedetails record);

    int insertSelective(SorStoragedetails record);

    SorStoragedetails selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(SorStoragedetails record);

    int updateByPrimaryKey(SorStoragedetails record);
}