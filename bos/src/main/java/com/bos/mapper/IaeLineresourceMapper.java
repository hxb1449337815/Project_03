package com.bos.mapper;

import com.bos.model.IaeLineresource;

public interface IaeLineresourceMapper {
    int deleteByPrimaryKey(String ID);

    int insert(IaeLineresource record);

    int insertSelective(IaeLineresource record);

    IaeLineresource selectByPrimaryKey(String ID);

    int updateByPrimaryKeySelective(IaeLineresource record);

    int updateByPrimaryKey(IaeLineresource record);
}