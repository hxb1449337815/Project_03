package com.bos.model;

import java.util.Date;

public class BasBasicarchivesentry {
    private Short ID;

    private String NAME;

    private Short PARENTID;

    private String MNEMONICCODE;

    private Short AVAILABLE;

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

    public Short getPARENTID() {
        return PARENTID;
    }

    public void setPARENTID(Short PARENTID) {
        this.PARENTID = PARENTID;
    }

    public String getMNEMONICCODE() {
        return MNEMONICCODE;
    }

    public void setMNEMONICCODE(String MNEMONICCODE) {
        this.MNEMONICCODE = MNEMONICCODE == null ? null : MNEMONICCODE.trim();
    }

    public Short getAVAILABLE() {
        return AVAILABLE;
    }

    public void setAVAILABLE(Short AVAILABLE) {
        this.AVAILABLE = AVAILABLE;
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
        return "BasBasicarchivesentry{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", PARENTID=" + PARENTID +
                ", MNEMONICCODE='" + MNEMONICCODE + '\'' +
                ", AVAILABLE=" + AVAILABLE +
                ", REMARKS='" + REMARKS + '\'' +
                ", OPERATORID=" + OPERATORID +
                ", OPERATIONUNITID=" + OPERATIONUNITID +
                ", OPERATIONTIME=" + OPERATIONTIME +
                '}';
    }
}