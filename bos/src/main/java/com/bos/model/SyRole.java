package com.bos.model;

public class SyRole {
    private Short ID;

    private String ROLENAME;

    private String ROLEDESC;

    private Short DISABLED;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getROLENAME() {
        return ROLENAME;
    }

    public void setROLENAME(String ROLENAME) {
        this.ROLENAME = ROLENAME == null ? null : ROLENAME.trim();
    }

    public String getROLEDESC() {
        return ROLEDESC;
    }

    public void setROLEDESC(String ROLEDESC) {
        this.ROLEDESC = ROLEDESC == null ? null : ROLEDESC.trim();
    }

    public Short getDISABLED() {
        return DISABLED;
    }

    public void setDISABLED(Short DISABLED) {
        this.DISABLED = DISABLED;
    }

    @Override
    public String toString() {
        return "SyRole{" +
                "ID=" + ID +
                ", ROLENAME='" + ROLENAME + '\'' +
                ", ROLEDESC='" + ROLEDESC + '\'' +
                ", DISABLED=" + DISABLED +
                '}';
    }
}