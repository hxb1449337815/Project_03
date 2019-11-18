package com.xb.service.impl;

import com.xb.mapper.UserMapper;
import com.xb.model.User;
import com.xb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> getList() {
        return mapper.getList();
    }
}
