package com.bos.mapper;

import com.bos.model.BasStandartime;

public interface BasStandartimeMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(BasStandartime record);

    int insertSelective(BasStandartime record);

    BasStandartime selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(BasStandartime record);

    int updateByPrimaryKey(BasStandartime record);
}