package com.xb.service;

import com.xb.model.Employees;

import java.util.List;

public interface EmployeesService {
    List<Employees> empList();
    Integer addEmp(Employees employees);
    Employees getEmpById(Integer empId);
    Integer updateEmp(Employees employees);
    Integer deleteEmp(Integer empId);
}
