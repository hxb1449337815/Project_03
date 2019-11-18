package com.bos.mapper;

import com.bos.model.IaeExtract;

public interface IaeExtractMapper {
    int deleteByPrimaryKey(String ID);

    int insert(IaeExtract record);

    int insertSelective(IaeExtract record);

    IaeExtract selectByPrimaryKey(String ID);

    int updateByPrimaryKeySelective(IaeExtract record);

    int updateByPrimaryKey(IaeExtract record);
}