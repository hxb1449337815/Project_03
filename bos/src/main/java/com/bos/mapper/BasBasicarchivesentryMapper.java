package com.bos.mapper;

import com.bos.model.BasBasicarchivesentry;

public interface BasBasicarchivesentryMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(BasBasicarchivesentry record);

    int insertSelective(BasBasicarchivesentry record);

    BasBasicarchivesentry selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(BasBasicarchivesentry record);

    int updateByPrimaryKey(BasBasicarchivesentry record);
}