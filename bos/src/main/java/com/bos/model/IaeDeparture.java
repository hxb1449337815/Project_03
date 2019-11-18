package com.bos.model;

import java.util.Date;

public class IaeDeparture {
    private String ID;

    private String PACKINGID;

    private Short TRANSFER;

    private Short ACTUALCOUNT;

    private String DESTINATION;

    private Short WARENAME;

    private Short CARGOCOUNT;

    private Short WEIGHT;

    private Short VOLUME;

    private Short ACTUALVOLUME;

    private Date TIMELIMIT;

    private String ASK;

    private String TAKECARGOPERSON;

    private String TACKCARGOADDRESS;

    private Short PAYMENT;

    private String IMPORTANTHINTS;

    private Date SURPLUSTIME;

    private String ENTRUSTCOMPANY;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getPACKINGID() {
        return PACKINGID;
    }

    public void setPACKINGID(String PACKINGID) {
        this.PACKINGID = PACKINGID == null ? null : PACKINGID.trim();
    }

    public Short getTRANSFER() {
        return TRANSFER;
    }

    public void setTRANSFER(Short TRANSFER) {
        this.TRANSFER = TRANSFER;
    }

    public Short getACTUALCOUNT() {
        return ACTUALCOUNT;
    }

    public void setACTUALCOUNT(Short ACTUALCOUNT) {
        this.ACTUALCOUNT = ACTUALCOUNT;
    }

    public String getDESTINATION() {
        return DESTINATION;
    }

    public void setDESTINATION(String DESTINATION) {
        this.DESTINATION = DESTINATION == null ? null : DESTINATION.trim();
    }

    public Short getWARENAME() {
        return WARENAME;
    }

    public void setWARENAME(Short WARENAME) {
        this.WARENAME = WARENAME;
    }

    public Short getCARGOCOUNT() {
        return CARGOCOUNT;
    }

    public void setCARGOCOUNT(Short CARGOCOUNT) {
        this.CARGOCOUNT = CARGOCOUNT;
    }

    public Short getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(Short WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public Short getVOLUME() {
        return VOLUME;
    }

    public void setVOLUME(Short VOLUME) {
        this.VOLUME = VOLUME;
    }

    public Short getACTUALVOLUME() {
        return ACTUALVOLUME;
    }

    public void setACTUALVOLUME(Short ACTUALVOLUME) {
        this.ACTUALVOLUME = ACTUALVOLUME;
    }

    public Date getTIMELIMIT() {
        return TIMELIMIT;
    }

    public void setTIMELIMIT(Date TIMELIMIT) {
        this.TIMELIMIT = TIMELIMIT;
    }

    public String getASK() {
        return ASK;
    }

    public void setASK(String ASK) {
        this.ASK = ASK == null ? null : ASK.trim();
    }

    public String getTAKECARGOPERSON() {
        return TAKECARGOPERSON;
    }

    public void setTAKECARGOPERSON(String TAKECARGOPERSON) {
        this.TAKECARGOPERSON = TAKECARGOPERSON == null ? null : TAKECARGOPERSON.trim();
    }

    public String getTACKCARGOADDRESS() {
        return TACKCARGOADDRESS;
    }

    public void setTACKCARGOADDRESS(String TACKCARGOADDRESS) {
        this.TACKCARGOADDRESS = TACKCARGOADDRESS == null ? null : TACKCARGOADDRESS.trim();
    }

    public Short getPAYMENT() {
        return PAYMENT;
    }

    public void setPAYMENT(Short PAYMENT) {
        this.PAYMENT = PAYMENT;
    }

    public String getIMPORTANTHINTS() {
        return IMPORTANTHINTS;
    }

    public void setIMPORTANTHINTS(String IMPORTANTHINTS) {
        this.IMPORTANTHINTS = IMPORTANTHINTS == null ? null : IMPORTANTHINTS.trim();
    }

    public Date getSURPLUSTIME() {
        return SURPLUSTIME;
    }

    public void setSURPLUSTIME(Date SURPLUSTIME) {
        this.SURPLUSTIME = SURPLUSTIME;
    }

    public String getENTRUSTCOMPANY() {
        return ENTRUSTCOMPANY;
    }

    public void setENTRUSTCOMPANY(String ENTRUSTCOMPANY) {
        this.ENTRUSTCOMPANY = ENTRUSTCOMPANY == null ? null : ENTRUSTCOMPANY.trim();
    }

    @Override
    public String toString() {
        return "IaeDeparture{" +
                "ID='" + ID + '\'' +
                ", PACKINGID='" + PACKINGID + '\'' +
                ", TRANSFER=" + TRANSFER +
                ", ACTUALCOUNT=" + ACTUALCOUNT +
                ", DESTINATION='" + DESTINATION + '\'' +
                ", WARENAME=" + WARENAME +
                ", CARGOCOUNT=" + CARGOCOUNT +
                ", WEIGHT=" + WEIGHT +
                ", VOLUME=" + VOLUME +
                ", ACTUALVOLUME=" + ACTUALVOLUME +
                ", TIMELIMIT=" + TIMELIMIT +
                ", ASK='" + ASK + '\'' +
                ", TAKECARGOPERSON='" + TAKECARGOPERSON + '\'' +
                ", TACKCARGOADDRESS='" + TACKCARGOADDRESS + '\'' +
                ", PAYMENT=" + PAYMENT +
                ", IMPORTANTHINTS='" + IMPORTANTHINTS + '\'' +
                ", SURPLUSTIME=" + SURPLUSTIME +
                ", ENTRUSTCOMPANY='" + ENTRUSTCOMPANY + '\'' +
                '}';
    }
}