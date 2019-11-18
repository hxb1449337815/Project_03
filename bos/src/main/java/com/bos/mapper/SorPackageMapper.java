package com.bos.mapper;

import com.bos.model.SorPackage;

public interface SorPackageMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(SorPackage record);

    int insertSelective(SorPackage record);

    SorPackage selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(SorPackage record);

    int updateByPrimaryKey(SorPackage record);
}