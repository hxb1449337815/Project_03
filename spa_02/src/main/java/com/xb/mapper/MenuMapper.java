package com.xb.mapper;

import com.xb.model.Menu;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MenuMapper {

    @Select("select * from menu where pid=0")
    List<Menu> findMenu();


    @Select("select * from menu where pid=#{pid}")
    List<Menu> findChildren(Integer pid);

}
