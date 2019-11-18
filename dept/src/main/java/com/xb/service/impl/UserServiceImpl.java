package com.xb.service.impl;

import com.xb.mapper.UserMapper;
import com.xb.model.Users;
import com.xb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public Users login(Users users) {
        return mapper.login(users);
    }
}
