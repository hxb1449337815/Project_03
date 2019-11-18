package com.bos.service.impl;

import com.bos.mapper.AccBusinessadmissibilityMapper;
import com.bos.model.AccBusinessadmissibility;
import com.bos.service.AccBusinessadmissibilityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccBusinessadmissibilityServiceImpl implements AccBusinessadmissibilityService {


    @Autowired
    private AccBusinessadmissibilityMapper mapper;


    //业务受理信息
    @Override
    public List<AccBusinessadmissibility> getList() {
        return mapper.getList();
    }
}
