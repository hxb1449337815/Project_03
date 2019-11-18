package com.bos.model;

import java.util.Date;

public class PacPackaging {
    private Short ID;

    private String ITEMCODE;

    private String ITEMNAME;

    private Short PLANNEDPRICE;

    private String SPECIFICATIONS;

    private Short TYPE;

    private String MEASUREMENTUNIT;

    private Short STATUS;

    private Short OPERATORID;

    private Date OPERATIONTIME;

    private Date INVALIDATEJOBINT;

    private Short INVALIDATENAME;

    private Date INVALIDATETIME;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getITEMCODE() {
        return ITEMCODE;
    }

    public void setITEMCODE(String ITEMCODE) {
        this.ITEMCODE = ITEMCODE == null ? null : ITEMCODE.trim();
    }

    public String getITEMNAME() {
        return ITEMNAME;
    }

    public void setITEMNAME(String ITEMNAME) {
        this.ITEMNAME = ITEMNAME == null ? null : ITEMNAME.trim();
    }

    public Short getPLANNEDPRICE() {
        return PLANNEDPRICE;
    }

    public void setPLANNEDPRICE(Short PLANNEDPRICE) {
        this.PLANNEDPRICE = PLANNEDPRICE;
    }

    public String getSPECIFICATIONS() {
        return SPECIFICATIONS;
    }

    public void setSPECIFICATIONS(String SPECIFICATIONS) {
        this.SPECIFICATIONS = SPECIFICATIONS == null ? null : SPECIFICATIONS.trim();
    }

    public Short getTYPE() {
        return TYPE;
    }

    public void setTYPE(Short TYPE) {
        this.TYPE = TYPE;
    }

    public String getMEASUREMENTUNIT() {
        return MEASUREMENTUNIT;
    }

    public void setMEASUREMENTUNIT(String MEASUREMENTUNIT) {
        this.MEASUREMENTUNIT = MEASUREMENTUNIT == null ? null : MEASUREMENTUNIT.trim();
    }

    public Short getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Short STATUS) {
        this.STATUS = STATUS;
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

    public Date getINVALIDATEJOBINT() {
        return INVALIDATEJOBINT;
    }

    public void setINVALIDATEJOBINT(Date INVALIDATEJOBINT) {
        this.INVALIDATEJOBINT = INVALIDATEJOBINT;
    }

    public Short getINVALIDATENAME() {
        return INVALIDATENAME;
    }

    public void setINVALIDATENAME(Short INVALIDATENAME) {
        this.INVALIDATENAME = INVALIDATENAME;
    }

    public Date getINVALIDATETIME() {
        return INVALIDATETIME;
    }

    public void setINVALIDATETIME(Date INVALIDATETIME) {
        this.INVALIDATETIME = INVALIDATETIME;
    }

    @Override
    public String toString() {
        return "PacPackaging{" +
                "ID=" + ID +
                ", ITEMCODE='" + ITEMCODE + '\'' +
                ", ITEMNAME='" + ITEMNAME + '\'' +
                ", PLANNEDPRICE=" + PLANNEDPRICE +
                ", SPECIFICATIONS='" + SPECIFICATIONS + '\'' +
                ", TYPE=" + TYPE +
                ", MEASUREMENTUNIT='" + MEASUREMENTUNIT + '\'' +
                ", STATUS=" + STATUS +
                ", OPERATORID=" + OPERATORID +
                ", OPERATIONTIME=" + OPERATIONTIME +
                ", INVALIDATEJOBINT=" + INVALIDATEJOBINT +
                ", INVALIDATENAME=" + INVALIDATENAME +
                ", INVALIDATETIME=" + INVALIDATETIME +
                '}';
    }
}