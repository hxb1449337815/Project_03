package com.bos.model;

import java.util.Date;

public class BasStandartime {
    private Short ID;

    private String TIMENAME;

    private Short SUBORDINATEUNIT;

    private Date WORKINGTIME;

    private Date CLOSINGTIME;

    private Date SATURDAYWORKINGTIME;

    private Date SATURDAYCLOSINGTIME;

    private Date SUNDAYWORKINGTIME;

    private Date SUNDAYCLOSINGTIME;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getTIMENAME() {
        return TIMENAME;
    }

    public void setTIMENAME(String TIMENAME) {
        this.TIMENAME = TIMENAME == null ? null : TIMENAME.trim();
    }

    public Short getSUBORDINATEUNIT() {
        return SUBORDINATEUNIT;
    }

    public void setSUBORDINATEUNIT(Short SUBORDINATEUNIT) {
        this.SUBORDINATEUNIT = SUBORDINATEUNIT;
    }

    public Date getWORKINGTIME() {
        return WORKINGTIME;
    }

    public void setWORKINGTIME(Date WORKINGTIME) {
        this.WORKINGTIME = WORKINGTIME;
    }

    public Date getCLOSINGTIME() {
        return CLOSINGTIME;
    }

    public void setCLOSINGTIME(Date CLOSINGTIME) {
        this.CLOSINGTIME = CLOSINGTIME;
    }

    public Date getSATURDAYWORKINGTIME() {
        return SATURDAYWORKINGTIME;
    }

    public void setSATURDAYWORKINGTIME(Date SATURDAYWORKINGTIME) {
        this.SATURDAYWORKINGTIME = SATURDAYWORKINGTIME;
    }

    public Date getSATURDAYCLOSINGTIME() {
        return SATURDAYCLOSINGTIME;
    }

    public void setSATURDAYCLOSINGTIME(Date SATURDAYCLOSINGTIME) {
        this.SATURDAYCLOSINGTIME = SATURDAYCLOSINGTIME;
    }

    public Date getSUNDAYWORKINGTIME() {
        return SUNDAYWORKINGTIME;
    }

    public void setSUNDAYWORKINGTIME(Date SUNDAYWORKINGTIME) {
        this.SUNDAYWORKINGTIME = SUNDAYWORKINGTIME;
    }

    public Date getSUNDAYCLOSINGTIME() {
        return SUNDAYCLOSINGTIME;
    }

    public void setSUNDAYCLOSINGTIME(Date SUNDAYCLOSINGTIME) {
        this.SUNDAYCLOSINGTIME = SUNDAYCLOSINGTIME;
    }

    @Override
    public String toString() {
        return "BasStandartime{" +
                "ID=" + ID +
                ", TIMENAME='" + TIMENAME + '\'' +
                ", SUBORDINATEUNIT=" + SUBORDINATEUNIT +
                ", WORKINGTIME=" + WORKINGTIME +
                ", CLOSINGTIME=" + CLOSINGTIME +
                ", SATURDAYWORKINGTIME=" + SATURDAYWORKINGTIME +
                ", SATURDAYCLOSINGTIME=" + SATURDAYCLOSINGTIME +
                ", SUNDAYWORKINGTIME=" + SUNDAYWORKINGTIME +
                ", SUNDAYCLOSINGTIME=" + SUNDAYCLOSINGTIME +
                '}';
    }
}