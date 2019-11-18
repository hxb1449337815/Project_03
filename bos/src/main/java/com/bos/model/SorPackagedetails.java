package com.bos.model;

public class SorPackagedetails {
    private Short ID;

    private Short WARENAME;

    private String DESTINATION;

    private Short TICKET;

    private Short ACTUALCARGOINT;

    private Short CARGOINT;

    private Short WEIGHT;

    private Short VOLUME;

    private Short SERVICE;

    private String IMPORTANTHINTS;

    private String ASK;

    private String INPUTTYPE;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public Short getWARENAME() {
        return WARENAME;
    }

    public void setWARENAME(Short WARENAME) {
        this.WARENAME = WARENAME;
    }

    public String getDESTINATION() {
        return DESTINATION;
    }

    public void setDESTINATION(String DESTINATION) {
        this.DESTINATION = DESTINATION == null ? null : DESTINATION.trim();
    }

    public Short getTICKET() {
        return TICKET;
    }

    public void setTICKET(Short TICKET) {
        this.TICKET = TICKET;
    }

    public Short getACTUALCARGOINT() {
        return ACTUALCARGOINT;
    }

    public void setACTUALCARGOINT(Short ACTUALCARGOINT) {
        this.ACTUALCARGOINT = ACTUALCARGOINT;
    }

    public Short getCARGOINT() {
        return CARGOINT;
    }

    public void setCARGOINT(Short CARGOINT) {
        this.CARGOINT = CARGOINT;
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

    public Short getSERVICE() {
        return SERVICE;
    }

    public void setSERVICE(Short SERVICE) {
        this.SERVICE = SERVICE;
    }

    public String getIMPORTANTHINTS() {
        return IMPORTANTHINTS;
    }

    public void setIMPORTANTHINTS(String IMPORTANTHINTS) {
        this.IMPORTANTHINTS = IMPORTANTHINTS == null ? null : IMPORTANTHINTS.trim();
    }

    public String getASK() {
        return ASK;
    }

    public void setASK(String ASK) {
        this.ASK = ASK == null ? null : ASK.trim();
    }

    public String getINPUTTYPE() {
        return INPUTTYPE;
    }

    public void setINPUTTYPE(String INPUTTYPE) {
        this.INPUTTYPE = INPUTTYPE == null ? null : INPUTTYPE.trim();
    }

    @Override
    public String toString() {
        return "SorPackagedetails{" +
                "ID=" + ID +
                ", WARENAME=" + WARENAME +
                ", DESTINATION='" + DESTINATION + '\'' +
                ", TICKET=" + TICKET +
                ", ACTUALCARGOINT=" + ACTUALCARGOINT +
                ", CARGOINT=" + CARGOINT +
                ", WEIGHT=" + WEIGHT +
                ", VOLUME=" + VOLUME +
                ", SERVICE=" + SERVICE +
                ", IMPORTANTHINTS='" + IMPORTANTHINTS + '\'' +
                ", ASK='" + ASK + '\'' +
                ", INPUTTYPE='" + INPUTTYPE + '\'' +
                '}';
    }
}