package com.bos.mapper;

import com.bos.model.LogLogisticstransfer;

public interface LogLogisticstransferMapper {
    int deleteByPrimaryKey(Short ID);

    int insert(LogLogisticstransfer record);

    int insertSelective(LogLogisticstransfer record);

    LogLogisticstransfer selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(LogLogisticstransfer record);

    int updateByPrimaryKey(LogLogisticstransfer record);
}