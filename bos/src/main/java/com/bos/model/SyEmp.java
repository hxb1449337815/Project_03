package com.bos.model;

public class SyEmp {
    private Short ID;

    private String EMPNAME;

    private String EMPNO;

    private String PWD;

    private String QUERYPWD;

    private Short ROLEID;

    private Short EMPUNIT;

    private String REMARK;

    private Short DISABLED;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getEMPNAME() {
        return EMPNAME;
    }

    public void setEMPNAME(String EMPNAME) {
        this.EMPNAME = EMPNAME == null ? null : EMPNAME.trim();
    }

    public String getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(String EMPNO) {
        this.EMPNO = EMPNO == null ? null : EMPNO.trim();
    }

    public String getPWD() {
        return PWD;
    }

    public void setPWD(String PWD) {
        this.PWD = PWD == null ? null : PWD.trim();
    }

    public String getQUERYPWD() {
        return QUERYPWD;
    }

    public void setQUERYPWD(String QUERYPWD) {
        this.QUERYPWD = QUERYPWD == null ? null : QUERYPWD.trim();
    }

    public Short getROLEID() {
        return ROLEID;
    }

    public void setROLEID(Short ROLEID) {
        this.ROLEID = ROLEID;
    }

    public Short getEMPUNIT() {
        return EMPUNIT;
    }

    public void setEMPUNIT(Short EMPUNIT) {
        this.EMPUNIT = EMPUNIT;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK == null ? null : REMARK.trim();
    }

    public Short getDISABLED() {
        return DISABLED;
    }

    public void setDISABLED(Short DISABLED) {
        this.DISABLED = DISABLED;
    }

    @Override
    public String toString() {
        return "SyEmp{" +
                "ID=" + ID +
                ", EMPNAME='" + EMPNAME + '\'' +
                ", EMPNO='" + EMPNO + '\'' +
                ", PWD='" + PWD + '\'' +
                ", QUERYPWD='" + QUERYPWD + '\'' +
                ", ROLEID=" + ROLEID +
                ", EMPUNIT=" + EMPUNIT +
                ", REMARK='" + REMARK + '\'' +
                ", DISABLED=" + DISABLED +
                '}';
    }
}