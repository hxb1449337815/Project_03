package com.xb.mapper;

import com.xb.model.Users;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface UserMapper {

    @Select("select * from users where usersName=#{usersName} and usersPwd=#{usersPwd}")
    Users login(Users users);

}
