package com.xb.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Employees {
    private Integer empId;
    private String empName;
    private double empSal;
    private Integer deptId;
    private String empSex;
    private String dept;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createDate;

    @Override
    public String toString() {
        return "Employees{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                ", deptId=" + deptId +
                ", empSex='" + empSex + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Employees() {
    }

    public Employees(String empName, double empSal, Integer deptId, String empSex, Date createDate) {
        this.empName = empName;
        this.empSal = empSal;
        this.deptId = deptId;
        this.empSex = empSex;
        this.createDate = createDate;
    }
}
