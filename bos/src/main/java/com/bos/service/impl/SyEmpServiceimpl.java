package com.bos.service.impl;

import com.bos.mapper.SyEmpMapper;
import com.bos.model.SyEmp;
import com.bos.service.SyEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SyEmpServiceimpl implements SyEmpService {

    @Autowired
    private SyEmpMapper mapper;


    @Override
    public List<SyEmp> getList() {
        return mapper.getList();
    }
}
