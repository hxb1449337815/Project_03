package com.bos.model;

import java.util.Date;

public class BasDeliverystandard {
    private Short ID;

    private String NAME;

    private Short MINWEIGHT;

    private Short MAXWEIGHT;

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

    public Short getMINWEIGHT() {
        return MINWEIGHT;
    }

    public void setMINWEIGHT(Short MINWEIGHT) {
        this.MINWEIGHT = MINWEIGHT;
    }

    public Short getMAXWEIGHT() {
        return MAXWEIGHT;
    }

    public void setMAXWEIGHT(Short MAXWEIGHT) {
        this.MAXWEIGHT = MAXWEIGHT;
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
        return "BasDeliverystandard{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", MINWEIGHT=" + MINWEIGHT +
                ", MAXWEIGHT=" + MAXWEIGHT +
                ", OPERATORID=" + OPERATORID +
                ", OPERATIONUNITID=" + OPERATIONUNITID +
                ", OPERATIONTIME=" + OPERATIONTIME +
                '}';
    }
}