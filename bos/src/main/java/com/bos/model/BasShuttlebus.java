package com.bos.model;

import java.util.Date;

public class BasShuttlebus {
    private Short ID;

    private Short LINETYPE;

    private Short LINEID;

    private String LICENSEPLATEINT;

    private String CARRIER;

    private String MODELS;

    private String DRIVER;

    private String TELEPHONE;

    private Short TON;

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

    public Short getLINETYPE() {
        return LINETYPE;
    }

    public void setLINETYPE(Short LINETYPE) {
        this.LINETYPE = LINETYPE;
    }

    public Short getLINEID() {
        return LINEID;
    }

    public void setLINEID(Short LINEID) {
        this.LINEID = LINEID;
    }

    public String getLICENSEPLATEINT() {
        return LICENSEPLATEINT;
    }

    public void setLICENSEPLATEINT(String LICENSEPLATEINT) {
        this.LICENSEPLATEINT = LICENSEPLATEINT == null ? null : LICENSEPLATEINT.trim();
    }

    public String getCARRIER() {
        return CARRIER;
    }

    public void setCARRIER(String CARRIER) {
        this.CARRIER = CARRIER == null ? null : CARRIER.trim();
    }

    public String getMODELS() {
        return MODELS;
    }

    public void setMODELS(String MODELS) {
        this.MODELS = MODELS == null ? null : MODELS.trim();
    }

    public String getDRIVER() {
        return DRIVER;
    }

    public void setDRIVER(String DRIVER) {
        this.DRIVER = DRIVER == null ? null : DRIVER.trim();
    }

    public String getTELEPHONE() {
        return TELEPHONE;
    }

    public void setTELEPHONE(String TELEPHONE) {
        this.TELEPHONE = TELEPHONE == null ? null : TELEPHONE.trim();
    }

    public Short getTON() {
        return TON;
    }

    public void setTON(Short TON) {
        this.TON = TON;
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
        return "BasShuttlebus{" +
                "ID=" + ID +
                ", LINETYPE=" + LINETYPE +
                ", LINEID=" + LINEID +
                ", LICENSEPLATEINT='" + LICENSEPLATEINT + '\'' +
                ", CARRIER='" + CARRIER + '\'' +
                ", MODELS='" + MODELS + '\'' +
                ", DRIVER='" + DRIVER + '\'' +
                ", TELEPHONE='" + TELEPHONE + '\'' +
                ", TON=" + TON +
                ", REMARKS='" + REMARKS + '\'' +
                ", OPERATORID=" + OPERATORID +
                ", OPERATIONUNITID=" + OPERATIONUNITID +
                ", OPERATIONTIME=" + OPERATIONTIME +
                '}';
    }
}