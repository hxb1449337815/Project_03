package com.xb.mapper;

import com.xb.model.Stu;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StuMapper {

    @Select("select * from STU")
    List<Stu> getStu();
}
