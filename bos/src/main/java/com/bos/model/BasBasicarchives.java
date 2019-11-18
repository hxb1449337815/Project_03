package com.bos.model;

import java.util.Date;

public class BasBasicarchives {
    private Short ID;

    private String NAME;

    private Short GRADE;

    private String REMARKS;

    private Short OPERATORID;

    private Short OPERATIONUNITID;

    private Date OPERATIONTIME;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public Short getGRADE() {
        return GRADE;
    }

    public void setGRADE(Short GRADE) {
        this.GRADE = GRADE;
    }

    public String getREMARKS() {
        return REMARKS;
    }

    public void setREMARKS(String REMARKS) {
        this.REMARKS = REMARKS == null ? null : REMARKS.trim();
    }

    public Short getOPERATORID() {
        return OPERATORID;
    }

    public void setOPERATORID(Short OPERATORID) {
        this.OPERATORID = OPERATORID;
    }

    public Short getOPERATIONUNITID() {
        return OPERATIONUNITID;
    }

    public void setOPERATIONUNITID(Short OPERATIONUNITID) {
        this.OPERATIONUNITID = OPERATIONUNITID;
    }

    public Date getOPERATIONTIME() {
        return OPERATIONTIME;
    }

    public void setOPERATIONTIME(Date OPERATIONTIME) {
        this.OPERATIONTIME = OPERATIONTIME;
    }

    @Override
    public String toString() {
        return "BasBasicarchives{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", GRADE=" + GRADE +
                ", REMARKS='" + REMARKS + '\'' +
                ", OPERATORID=" + OPERATORID +
                ", OPERATIONUNITID=" + OPERATIONUNITID +
                ", OPERATIONTIME=" + OPERATIONTIME +
                '}';
    }
}