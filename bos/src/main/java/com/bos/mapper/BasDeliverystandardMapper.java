package com.bos.mapper;

import com.bos.model.BasDeliverystandard;

public interface BasDeliverystandardMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(BasDeliverystandard record);

    int insertSelective(BasDeliverystandard record);

    BasDeliverystandard selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(BasDeliverystandard record);

    int updateByPrimaryKey(BasDeliverystandard record);
}