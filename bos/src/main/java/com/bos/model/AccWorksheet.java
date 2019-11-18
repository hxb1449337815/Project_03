package com.bos.model;

public class AccWorksheet {
    private Short ID;

    private String WORKSHEETNO;

    private String DESTINATION;

    private String PRODUCTTIME;

    private Short TOTAL;

    private Short WEIGHT;

    private String STOWAGEREQUIREMENTS;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getWORKSHEETNO() {
        return WORKSHEETNO;
    }

    public void setWORKSHEETNO(String WORKSHEETNO) {
        this.WORKSHEETNO = WORKSHEETNO == null ? null : WORKSHEETNO.trim();
    }

    public String getDESTINATION() {
        return DESTINATION;
    }

    public void setDESTINATION(String DESTINATION) {
        this.DESTINATION = DESTINATION == null ? null : DESTINATION.trim();
    }

    public String getPRODUCTTIME() {
        return PRODUCTTIME;
    }

    public void setPRODUCTTIME(String PRODUCTTIME) {
        this.PRODUCTTIME = PRODUCTTIME == null ? null : PRODUCTTIME.trim();
    }

    public Short getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(Short TOTAL) {
        this.TOTAL = TOTAL;
    }

    public Short getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(Short WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public String getSTOWAGEREQUIREMENTS() {
        return STOWAGEREQUIREMENTS;
    }

    public void setSTOWAGEREQUIREMENTS(String STOWAGEREQUIREMENTS) {
        this.STOWAGEREQUIREMENTS = STOWAGEREQUIREMENTS == null ? null : STOWAGEREQUIREMENTS.trim();
    }

    @Override
    public String toString() {
        return "AccWorksheet{" +
                "ID=" + ID +
                ", WORKSHEETNO='" + WORKSHEETNO + '\'' +
                ", DESTINATION='" + DESTINATION + '\'' +
                ", PRODUCTTIME='" + PRODUCTTIME + '\'' +
                ", TOTAL=" + TOTAL +
                ", WEIGHT=" + WEIGHT +
                ", STOWAGEREQUIREMENTS='" + STOWAGEREQUIREMENTS + '\'' +
                '}';
    }
}