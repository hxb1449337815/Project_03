package com.bos.model;

import java.util.Date;

public class BasAssociatemember {
    private Short ID;

    private String ZONECODE;

    private String EMPNO;

    private String EMPNAME;

    private Short STANDARDKG;

    private Short STANDARDLENGTH;

    private Date STANDARDTIME;

    private Short SUBORDINATEUNIT;

    private String TYPE;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getZONECODE() {
        return ZONECODE;
    }

    public void setZONECODE(String ZONECODE) {
        this.ZONECODE = ZONECODE == null ? null : ZONECODE.trim();
    }

    public String getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(String EMPNO) {
        this.EMPNO = EMPNO == null ? null : EMPNO.trim();
    }

    public String getEMPNAME() {
        return EMPNAME;
    }

    public void setEMPNAME(String EMPNAME) {
        this.EMPNAME = EMPNAME == null ? null : EMPNAME.trim();
    }

    public Short getSTANDARDKG() {
        return STANDARDKG;
    }

    public void setSTANDARDKG(Short STANDARDKG) {
        this.STANDARDKG = STANDARDKG;
    }

    public Short getSTANDARDLENGTH() {
        return STANDARDLENGTH;
    }

    public void setSTANDARDLENGTH(Short STANDARDLENGTH) {
        this.STANDARDLENGTH = STANDARDLENGTH;
    }

    public Date getSTANDARDTIME() {
        return STANDARDTIME;
    }

    public void setSTANDARDTIME(Date STANDARDTIME) {
        this.STANDARDTIME = STANDARDTIME;
    }

    public Short getSUBORDINATEUNIT() {
        return SUBORDINATEUNIT;
    }

    public void setSUBORDINATEUNIT(Short SUBORDINATEUNIT) {
        this.SUBORDINATEUNIT = SUBORDINATEUNIT;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE == null ? null : TYPE.trim();
    }

    @Override
    public String toString() {
        return "BasAssociatemember{" +
                "ID=" + ID +
                ", ZONECODE='" + ZONECODE + '\'' +
                ", EMPNO='" + EMPNO + '\'' +
                ", EMPNAME='" + EMPNAME + '\'' +
                ", STANDARDKG=" + STANDARDKG +
                ", STANDARDLENGTH=" + STANDARDLENGTH +
                ", STANDARDTIME=" + STANDARDTIME +
                ", SUBORDINATEUNIT=" + SUBORDINATEUNIT +
                ", TYPE='" + TYPE + '\'' +
                '}';
    }
}