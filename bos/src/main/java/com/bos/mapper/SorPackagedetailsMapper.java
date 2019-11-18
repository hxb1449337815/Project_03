package com.bos.mapper;

import com.bos.model.SorPackagedetails;

public interface SorPackagedetailsMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(SorPackagedetails record);

    int insertSelective(SorPackagedetails record);

    SorPackagedetails selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(SorPackagedetails record);

    int updateByPrimaryKey(SorPackagedetails record);
}