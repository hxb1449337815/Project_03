package com.xb.mapper;

import com.xb.model.Employees;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeesMapper {

    @Select("select * from employees")
    @Results(
            @Result(property = "dept",column = "deptId",one = @One(select = "com.xb.mapper.DepartmentsMapper.getDept"))
    )
    List<Employees> empList();

    @Insert("insert into employees values(null,#{empName},#{empSal},#{deptId},#{empSex},now())")
    Integer addEmp(Employees employees);

    @Select("select * from employees where empId=#{empId}")
    Employees getEmpById(Integer empId);

    @Update("update employees set empName=#{empName},empSal=#{empSal},deptId=#{deptId},empSex=#{empSex} where empId=#{empId}")
    Integer updateEmp(Employees employees);

    @Delete("delete from employees where empId=#{empId}")
    Integer deleteEmp(Integer empId);

}
