package com.xb.service.impl;

import com.xb.mapper.UsersMapper;
import com.xb.model.Users;
import com.xb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UsersMapper mapper;

    @Override
    public Users getUser(Users u) {
        return mapper.getUser(u);
    }
}
