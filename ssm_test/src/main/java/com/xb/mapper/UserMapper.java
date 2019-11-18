package com.xb.mapper;

import com.xb.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserMapper {

    @Select("select * from user")
    List<User> getList();

}
