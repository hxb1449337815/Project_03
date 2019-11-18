package com.bos.model;

import java.util.Date;

public class SorCheckbounddetails {
    private Short ID;

    private String PACKAGEID;

    private Short CARGOCOUNT;

    private Short WEIGHT;

    private Short VOLUME;

    private Short CARGOTYPE;

    private String DIRECTION;

    private Short STORAGEPERSON;

    private Date STORAGEDATE;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getPACKAGEID() {
        return PACKAGEID;
    }

    public void setPACKAGEID(String PACKAGEID) {
        this.PACKAGEID = PACKAGEID == null ? null : PACKAGEID.trim();
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

    public Short getCARGOTYPE() {
        return CARGOTYPE;
    }

    public void setCARGOTYPE(Short CARGOTYPE) {
        this.CARGOTYPE = CARGOTYPE;
    }

    public String getDIRECTION() {
        return DIRECTION;
    }

    public void setDIRECTION(String DIRECTION) {
        this.DIRECTION = DIRECTION == null ? null : DIRECTION.trim();
    }

    public Short getSTORAGEPERSON() {
        return STORAGEPERSON;
    }

    public void setSTORAGEPERSON(Short STORAGEPERSON) {
        this.STORAGEPERSON = STORAGEPERSON;
    }

    public Date getSTORAGEDATE() {
        return STORAGEDATE;
    }

    public void setSTORAGEDATE(Date STORAGEDATE) {
        this.STORAGEDATE = STORAGEDATE;
    }

    @Override
    public String toString() {
        return "SorCheckbounddetails{" +
                "ID=" + ID +
                ", PACKAGEID='" + PACKAGEID + '\'' +
                ", CARGOCOUNT=" + CARGOCOUNT +
                ", WEIGHT=" + WEIGHT +
                ", VOLUME=" + VOLUME +
                ", CARGOTYPE=" + CARGOTYPE +
                ", DIRECTION='" + DIRECTION + '\'' +
                ", STORAGEPERSON=" + STORAGEPERSON +
                ", STORAGEDATE=" + STORAGEDATE +
                '}';
    }
}