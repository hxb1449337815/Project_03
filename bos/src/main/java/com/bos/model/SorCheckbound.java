package com.bos.model;

import java.util.Date;

public class SorCheckbound {
    private Short ID;

    private Short SCANID;

    private Short CARGOSUM;

    private Short CHECKPERSON;

    private Date CHECKDATE;

    private String CHECKCOMPANY;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public Short getSCANID() {
        return SCANID;
    }

    public void setSCANID(Short SCANID) {
        this.SCANID = SCANID;
    }

    public Short getCARGOSUM() {
        return CARGOSUM;
    }

    public void setCARGOSUM(Short CARGOSUM) {
        this.CARGOSUM = CARGOSUM;
    }

    public Short getCHECKPERSON() {
        return CHECKPERSON;
    }

    public void setCHECKPERSON(Short CHECKPERSON) {
        this.CHECKPERSON = CHECKPERSON;
    }

    public Date getCHECKDATE() {
        return CHECKDATE;
    }

    public void setCHECKDATE(Date CHECKDATE) {
        this.CHECKDATE = CHECKDATE;
    }

    public String getCHECKCOMPANY() {
        return CHECKCOMPANY;
    }

    public void setCHECKCOMPANY(String CHECKCOMPANY) {
        this.CHECKCOMPANY = CHECKCOMPANY == null ? null : CHECKCOMPANY.trim();
    }

    @Override
    public String toString() {
        return "SorCheckbound{" +
                "ID=" + ID +
                ", SCANID=" + SCANID +
                ", CARGOSUM=" + CARGOSUM +
                ", CHECKPERSON=" + CHECKPERSON +
                ", CHECKDATE=" + CHECKDATE +
                ", CHECKCOMPANY='" + CHECKCOMPANY + '\'' +
                '}';
    }
}