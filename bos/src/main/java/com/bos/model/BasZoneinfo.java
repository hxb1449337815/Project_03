package com.bos.model;

public class BasZoneinfo {
    private Short ID;

    private String ZONECODE;

    private String ZONENAME;

    private Short ZONEPEOPLE;

    private String TELPHONE;

    private Short SUBORDINATEUNIT;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getZONECODE() {
        return ZONECODE;
    }

    public void setZONECODE(String ZONECODE) {
        this.ZONECODE = ZONECODE == null ? null : ZONECODE.trim();
    }

    public String getZONENAME() {
        return ZONENAME;
    }

    public void setZONENAME(String ZONENAME) {
        this.ZONENAME = ZONENAME == null ? null : ZONENAME.trim();
    }

    public Short getZONEPEOPLE() {
        return ZONEPEOPLE;
    }

    public void setZONEPEOPLE(Short ZONEPEOPLE) {
        this.ZONEPEOPLE = ZONEPEOPLE;
    }

    public String getTELPHONE() {
        return TELPHONE;
    }

    public void setTELPHONE(String TELPHONE) {
        this.TELPHONE = TELPHONE == null ? null : TELPHONE.trim();
    }

    public Short getSUBORDINATEUNIT() {
        return SUBORDINATEUNIT;
    }

    public void setSUBORDINATEUNIT(Short SUBORDINATEUNIT) {
        this.SUBORDINATEUNIT = SUBORDINATEUNIT;
    }

    @Override
    public String toString() {
        return "BasZoneinfo{" +
                "ID=" + ID +
                ", ZONECODE='" + ZONECODE + '\'' +
                ", ZONENAME='" + ZONENAME + '\'' +
                ", ZONEPEOPLE=" + ZONEPEOPLE +
                ", TELPHONE='" + TELPHONE + '\'' +
                ", SUBORDINATEUNIT=" + SUBORDINATEUNIT +
                '}';
    }
}