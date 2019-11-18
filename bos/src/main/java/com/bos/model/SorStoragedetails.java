package com.bos.model;

public class SorStoragedetails {
    private Short ID;

    private String PACKAGEID;

    private Short WEIGHT;

    private String OUTBOUNDID;

    private Short STATE;

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

    public String getOUTBOUNDID() {
        return OUTBOUNDID;
    }

    public void setOUTBOUNDID(String OUTBOUNDID) {
        this.OUTBOUNDID = OUTBOUNDID == null ? null : OUTBOUNDID.trim();
    }

    public Short getSTATE() {
        return STATE;
    }

    public void setSTATE(Short STATE) {
        this.STATE = STATE;
    }

    @Override
    public String toString() {
        return "SorStoragedetails{" +
                "ID=" + ID +
                ", PACKAGEID='" + PACKAGEID + '\'' +
                ", WEIGHT=" + WEIGHT +
                ", OUTBOUNDID='" + OUTBOUNDID + '\'' +
                ", STATE=" + STATE +
                '}';
    }
}