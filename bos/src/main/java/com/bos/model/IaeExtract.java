package com.bos.model;

import java.util.Date;

public class IaeExtract {
    private String ID;

    private String VEHICLEINT;

    private String TRANSPORTWAY;

    private String WAYBILLID;

    private Date ESTIMATEDATE;

    private Short CARGON;

    private String IMPORTANTHINTS;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getVEHICLEINT() {
        return VEHICLEINT;
    }

    public void setVEHICLEINT(String VEHICLEINT) {
        this.VEHICLEINT = VEHICLEINT == null ? null : VEHICLEINT.trim();
    }

    public String getTRANSPORTWAY() {
        return TRANSPORTWAY;
    }

    public void setTRANSPORTWAY(String TRANSPORTWAY) {
        this.TRANSPORTWAY = TRANSPORTWAY == null ? null : TRANSPORTWAY.trim();
    }

    public String getWAYBILLID() {
        return WAYBILLID;
    }

    public void setWAYBILLID(String WAYBILLID) {
        this.WAYBILLID = WAYBILLID == null ? null : WAYBILLID.trim();
    }

    public Date getESTIMATEDATE() {
        return ESTIMATEDATE;
    }

    public void setESTIMATEDATE(Date ESTIMATEDATE) {
        this.ESTIMATEDATE = ESTIMATEDATE;
    }

    public Short getCARGON() {
        return CARGON;
    }

    public void setCARGON(Short CARGON) {
        this.CARGON = CARGON;
    }

    public String getIMPORTANTHINTS() {
        return IMPORTANTHINTS;
    }

    public void setIMPORTANTHINTS(String IMPORTANTHINTS) {
        this.IMPORTANTHINTS = IMPORTANTHINTS == null ? null : IMPORTANTHINTS.trim();
    }

    @Override
    public String toString() {
        return "IaeExtract{" +
                "ID='" + ID + '\'' +
                ", VEHICLEINT='" + VEHICLEINT + '\'' +
                ", TRANSPORTWAY='" + TRANSPORTWAY + '\'' +
                ", WAYBILLID='" + WAYBILLID + '\'' +
                ", ESTIMATEDATE=" + ESTIMATEDATE +
                ", CARGON=" + CARGON +
                ", IMPORTANTHINTS='" + IMPORTANTHINTS + '\'' +
                '}';
    }
}