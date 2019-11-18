package com.bos.model;

public class BasPartition {
    private Short ID;

    private String PROVINCE;

    private String CITY;

    private String COUNTY;

    private String ZONECODE;

    private String KEYWORD;

    private Short STARTINT;

    private Short TERMINATEINT;

    private Short SDINT;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getPROVINCE() {
        return PROVINCE;
    }

    public void setPROVINCE(String PROVINCE) {
        this.PROVINCE = PROVINCE == null ? null : PROVINCE.trim();
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY == null ? null : CITY.trim();
    }

    public String getCOUNTY() {
        return COUNTY;
    }

    public void setCOUNTY(String COUNTY) {
        this.COUNTY = COUNTY == null ? null : COUNTY.trim();
    }

    public String getZONECODE() {
        return ZONECODE;
    }

    public void setZONECODE(String ZONECODE) {
        this.ZONECODE = ZONECODE == null ? null : ZONECODE.trim();
    }

    public String getKEYWORD() {
        return KEYWORD;
    }

    public void setKEYWORD(String KEYWORD) {
        this.KEYWORD = KEYWORD == null ? null : KEYWORD.trim();
    }

    public Short getSTARTINT() {
        return STARTINT;
    }

    public void setSTARTINT(Short STARTINT) {
        this.STARTINT = STARTINT;
    }

    public Short getTERMINATEINT() {
        return TERMINATEINT;
    }

    public void setTERMINATEINT(Short TERMINATEINT) {
        this.TERMINATEINT = TERMINATEINT;
    }

    public Short getSDINT() {
        return SDINT;
    }

    public void setSDINT(Short SDINT) {
        this.SDINT = SDINT;
    }

    @Override
    public String toString() {
        return "BasPartition{" +
                "ID=" + ID +
                ", PROVINCE='" + PROVINCE + '\'' +
                ", CITY='" + CITY + '\'' +
                ", COUNTY='" + COUNTY + '\'' +
                ", ZONECODE='" + ZONECODE + '\'' +
                ", KEYWORD='" + KEYWORD + '\'' +
                ", STARTINT=" + STARTINT +
                ", TERMINATEINT=" + TERMINATEINT +
                ", SDINT=" + SDINT +
                '}';
    }
}