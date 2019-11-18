package com.xb.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentsMapper {

    @Select("select dname from departments where did=#{did}")
    String getDept(Integer did);

}
