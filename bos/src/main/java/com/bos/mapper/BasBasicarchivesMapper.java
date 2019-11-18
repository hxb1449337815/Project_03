package com.bos.mapper;

import com.bos.model.BasBasicarchives;

public interface BasBasicarchivesMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(BasBasicarchives record);

    int insertSelective(BasBasicarchives record);

    BasBasicarchives selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(BasBasicarchives record);

    int updateByPrimaryKey(BasBasicarchives record);
}