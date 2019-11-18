package com.bos.model;

import java.util.Date;

public class SorPackage {
    private Short ID;

    private Short PACKAGEPERSON;

    private String SEALINT;

    private String DESTINATION;

    private String RECKONDES;

    private Date TIMELIMIT;

    private Short TICKETSUM;

    private Short CARGOSUM;

    private Short WEIGHTSUM;

    private Short VOLUMESUM;

    private Short STATE;

    private Short ASK;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public Short getPACKAGEPERSON() {
        return PACKAGEPERSON;
    }

    public void setPACKAGEPERSON(Short PACKAGEPERSON) {
        this.PACKAGEPERSON = PACKAGEPERSON;
    }

    public String getSEALINT() {
        return SEALINT;
    }

    public void setSEALINT(String SEALINT) {
        this.SEALINT = SEALINT == null ? null : SEALINT.trim();
    }

    public String getDESTINATION() {
        return DESTINATION;
    }

    public void setDESTINATION(String DESTINATION) {
        this.DESTINATION = DESTINATION == null ? null : DESTINATION.trim();
    }

    public String getRECKONDES() {
        return RECKONDES;
    }

    public void setRECKONDES(String RECKONDES) {
        this.RECKONDES = RECKONDES == null ? null : RECKONDES.trim();
    }

    public Date getTIMELIMIT() {
        return TIMELIMIT;
    }

    public void setTIMELIMIT(Date TIMELIMIT) {
        this.TIMELIMIT = TIMELIMIT;
    }

    public Short getTICKETSUM() {
        return TICKETSUM;
    }

    public void setTICKETSUM(Short TICKETSUM) {
        this.TICKETSUM = TICKETSUM;
    }

    public Short getCARGOSUM() {
        return CARGOSUM;
    }

    public void setCARGOSUM(Short CARGOSUM) {
        this.CARGOSUM = CARGOSUM;
    }

    public Short getWEIGHTSUM() {
        return WEIGHTSUM;
    }

    public void setWEIGHTSUM(Short WEIGHTSUM) {
        this.WEIGHTSUM = WEIGHTSUM;
    }

    public Short getVOLUMESUM() {
        return VOLUMESUM;
    }

    public void setVOLUMESUM(Short VOLUMESUM) {
        this.VOLUMESUM = VOLUMESUM;
    }

    public Short getSTATE() {
        return STATE;
    }

    public void setSTATE(Short STATE) {
        this.STATE = STATE;
    }

    public Short getASK() {
        return ASK;
    }

    public void setASK(Short ASK) {
        this.ASK = ASK;
    }

    @Override
    public String toString() {
        return "SorPackage{" +
                "ID=" + ID +
                ", PACKAGEPERSON=" + PACKAGEPERSON +
                ", SEALINT='" + SEALINT + '\'' +
                ", DESTINATION='" + DESTINATION + '\'' +
                ", RECKONDES='" + RECKONDES + '\'' +
                ", TIMELIMIT=" + TIMELIMIT +
                ", TICKETSUM=" + TICKETSUM +
                ", CARGOSUM=" + CARGOSUM +
                ", WEIGHTSUM=" + WEIGHTSUM +
                ", VOLUMESUM=" + VOLUMESUM +
                ", STATE=" + STATE +
                ", ASK=" + ASK +
                '}';
    }
}