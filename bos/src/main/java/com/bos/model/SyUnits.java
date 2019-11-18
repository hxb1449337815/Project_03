package com.bos.model;

import java.util.Date;

public class SyUnits {
    private Short ID;

    private String NAME;

    private String REMARKS;

    private Short OPERATORID;

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

    public Date getOPERATIONTIME() {
        return OPERATIONTIME;
    }

    public void setOPERATIONTIME(Date OPERATIONTIME) {
        this.OPERATIONTIME = OPERATIONTIME;
    }

    @Override
    public String toString() {
        return "SyUnits{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", REMARKS='" + REMARKS + '\'' +
                ", OPERATORID=" + OPERATORID +
                ", OPERATIONTIME=" + OPERATIONTIME +
                '}';
    }
}