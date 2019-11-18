package com.xb.mapper;

import com.xb.model.Users;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface UsersMapper {

    @Select("select * from users where name=#{name} and password=#{password}")
    Users getUser(Users u);

}
