package com.xb.model;

public class SyEmp {
    private Integer id;

    private String empname;

    private String empno;

    private String pwd;

    private String querypwd;

    private Integer roleid;

    private Integer empunit;

    private String remark;

    private Integer disabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno == null ? null : empno.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getQuerypwd() {
        return querypwd;
    }

    public void setQuerypwd(String querypwd) {
        this.querypwd = querypwd == null ? null : querypwd.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getEmpunit() {
        return empunit;
    }

    public void setEmpunit(Integer empunit) {
        this.empunit = empunit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }
}