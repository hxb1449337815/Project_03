package com.xb.mapper;

import com.xb.model.Menu;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuMapper {

    @Select("select * from menu")
    @Results(
            @Result(property = "role",column = "mid",many = @Many(select = "com.xb.mapper.RoleMapper.getRoleById"))
    )
    List<Menu> getMenu();

}
