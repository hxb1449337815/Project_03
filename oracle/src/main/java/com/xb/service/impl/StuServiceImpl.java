package com.xb.service.impl;

import com.xb.mapper.StuMapper;
import com.xb.model.Stu;
import com.xb.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements StuService {


    @Autowired
    private StuMapper mapper;

    @Override
    public List<Stu> getStu() {
        return mapper.getStu();
    }
}
