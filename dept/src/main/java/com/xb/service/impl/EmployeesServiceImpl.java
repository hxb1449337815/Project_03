package com.xb.service.impl;

import com.xb.mapper.EmployeesMapper;
import com.xb.model.Employees;
import com.xb.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeesMapper mapper;

    @Override
    public List<Employees> empList() {
        return mapper.empList();
    }

    @Override
    public Integer addEmp(Employees employees) {
        return mapper.addEmp(employees);
    }

    @Override
    public Employees getEmpById(Integer empId) {
        return mapper.getEmpById(empId);
    }

    @Override
    public Integer updateEmp(Employees employees) {
        return mapper.updateEmp(employees);
    }

    @Override
    public Integer deleteEmp(Integer empId) {
        return mapper.deleteEmp(empId);
    }
}
