package com.bos.model;

import java.util.Date;

public class SorOutbounddetails {
    private Short ID;

    private String PACKAGEID;

    private Short WEIGHT;

    private Short VOLUME;

    private Date SCANDATE;

    private Short ISSCAN;

    private Short ISNEXTSTORAGE;

    private Short ISDOUBLESTORAGE;

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

    public Date getSCANDATE() {
        return SCANDATE;
    }

    public void setSCANDATE(Date SCANDATE) {
        this.SCANDATE = SCANDATE;
    }

    public Short getISSCAN() {
        return ISSCAN;
    }

    public void setISSCAN(Short ISSCAN) {
        this.ISSCAN = ISSCAN;
    }

    public Short getISNEXTSTORAGE() {
        return ISNEXTSTORAGE;
    }

    public void setISNEXTSTORAGE(Short ISNEXTSTORAGE) {
        this.ISNEXTSTORAGE = ISNEXTSTORAGE;
    }

    public Short getISDOUBLESTORAGE() {
        return ISDOUBLESTORAGE;
    }

    public void setISDOUBLESTORAGE(Short ISDOUBLESTORAGE) {
        this.ISDOUBLESTORAGE = ISDOUBLESTORAGE;
    }

    @Override
    public String toString() {
        return "SorOutbounddetails{" +
                "ID=" + ID +
                ", PACKAGEID='" + PACKAGEID + '\'' +
                ", WEIGHT=" + WEIGHT +
                ", VOLUME=" + VOLUME +
                ", SCANDATE=" + SCANDATE +
                ", ISSCAN=" + ISSCAN +
                ", ISNEXTSTORAGE=" + ISNEXTSTORAGE +
                ", ISDOUBLESTORAGE=" + ISDOUBLESTORAGE +
                '}';
    }
}