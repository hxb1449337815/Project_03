package com.xb.mapper;

import com.xb.model.Role;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleMapper {

    @Select("select * from role_menu inner JOIN role on role_menu.rid=role.rid where role_menu.mid=#{mid}")
    List<Role> getRoleById(Integer mid);

}
