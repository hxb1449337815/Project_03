package com.bos.model;

public class LogLogistics {
    private Short ID;

    private String LOGISTICSINT;

    private String LINENAME;

    private String STARTCOMPANY;

    private String GENERATEPERSON;

    private String CARINT;

    private String DRIVER;

    private String DRIVERPHONE;

    private String CARTYPE;

    private String LOGISTICSSTATE;

    private Short ISCANCEL;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getLOGISTICSINT() {
        return LOGISTICSINT;
    }

    public void setLOGISTICSINT(String LOGISTICSINT) {
        this.LOGISTICSINT = LOGISTICSINT == null ? null : LOGISTICSINT.trim();
    }

    public String getLINENAME() {
        return LINENAME;
    }

    public void setLINENAME(String LINENAME) {
        this.LINENAME = LINENAME == null ? null : LINENAME.trim();
    }

    public String getSTARTCOMPANY() {
        return STARTCOMPANY;
    }

    public void setSTARTCOMPANY(String STARTCOMPANY) {
        this.STARTCOMPANY = STARTCOMPANY == null ? null : STARTCOMPANY.trim();
    }

    public String getGENERATEPERSON() {
        return GENERATEPERSON;
    }

    public void setGENERATEPERSON(String GENERATEPERSON) {
        this.GENERATEPERSON = GENERATEPERSON == null ? null : GENERATEPERSON.trim();
    }

    public String getCARINT() {
        return CARINT;
    }

    public void setCARINT(String CARINT) {
        this.CARINT = CARINT == null ? null : CARINT.trim();
    }

    public String getDRIVER() {
        return DRIVER;
    }

    public void setDRIVER(String DRIVER) {
        this.DRIVER = DRIVER == null ? null : DRIVER.trim();
    }

    public String getDRIVERPHONE() {
        return DRIVERPHONE;
    }

    public void setDRIVERPHONE(String DRIVERPHONE) {
        this.DRIVERPHONE = DRIVERPHONE == null ? null : DRIVERPHONE.trim();
    }

    public String getCARTYPE() {
        return CARTYPE;
    }

    public void setCARTYPE(String CARTYPE) {
        this.CARTYPE = CARTYPE == null ? null : CARTYPE.trim();
    }

    public String getLOGISTICSSTATE() {
        return LOGISTICSSTATE;
    }

    public void setLOGISTICSSTATE(String LOGISTICSSTATE) {
        this.LOGISTICSSTATE = LOGISTICSSTATE == null ? null : LOGISTICSSTATE.trim();
    }

    public Short getISCANCEL() {
        return ISCANCEL;
    }

    public void setISCANCEL(Short ISCANCEL) {
        this.ISCANCEL = ISCANCEL;
    }

    @Override
    public String toString() {
        return "LogLogistics{" +
                "ID=" + ID +
                ", LOGISTICSINT='" + LOGISTICSINT + '\'' +
                ", LINENAME='" + LINENAME + '\'' +
                ", STARTCOMPANY='" + STARTCOMPANY + '\'' +
                ", GENERATEPERSON='" + GENERATEPERSON + '\'' +
                ", CARINT='" + CARINT + '\'' +
                ", DRIVER='" + DRIVER + '\'' +
                ", DRIVERPHONE='" + DRIVERPHONE + '\'' +
                ", CARTYPE='" + CARTYPE + '\'' +
                ", LOGISTICSSTATE='" + LOGISTICSSTATE + '\'' +
                ", ISCANCEL=" + ISCANCEL +
                '}';
    }
}