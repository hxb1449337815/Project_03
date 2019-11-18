package com.bos.model;

import java.util.Date;

public class SorOutbound {
    private Short ID;

    private Short HANDOVERTYPE;

    private String LINE;

    private Short DIRECTION;

    private Short ACCEPTPERSON;

    private Short CARRIERS;

    private Short DELIVERYPERSON;

    private Date DELIVERYDATE;

    private String DELIVERYCOMPANY;

    private Short ENTERPERSON;

    private Date ENTERDATE;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public Short getHANDOVERTYPE() {
        return HANDOVERTYPE;
    }

    public void setHANDOVERTYPE(Short HANDOVERTYPE) {
        this.HANDOVERTYPE = HANDOVERTYPE;
    }

    public String getLINE() {
        return LINE;
    }

    public void setLINE(String LINE) {
        this.LINE = LINE == null ? null : LINE.trim();
    }

    public Short getDIRECTION() {
        return DIRECTION;
    }

    public void setDIRECTION(Short DIRECTION) {
        this.DIRECTION = DIRECTION;
    }

    public Short getACCEPTPERSON() {
        return ACCEPTPERSON;
    }

    public void setACCEPTPERSON(Short ACCEPTPERSON) {
        this.ACCEPTPERSON = ACCEPTPERSON;
    }

    public Short getCARRIERS() {
        return CARRIERS;
    }

    public void setCARRIERS(Short CARRIERS) {
        this.CARRIERS = CARRIERS;
    }

    public Short getDELIVERYPERSON() {
        return DELIVERYPERSON;
    }

    public void setDELIVERYPERSON(Short DELIVERYPERSON) {
        this.DELIVERYPERSON = DELIVERYPERSON;
    }

    public Date getDELIVERYDATE() {
        return DELIVERYDATE;
    }

    public void setDELIVERYDATE(Date DELIVERYDATE) {
        this.DELIVERYDATE = DELIVERYDATE;
    }

    public String getDELIVERYCOMPANY() {
        return DELIVERYCOMPANY;
    }

    public void setDELIVERYCOMPANY(String DELIVERYCOMPANY) {
        this.DELIVERYCOMPANY = DELIVERYCOMPANY == null ? null : DELIVERYCOMPANY.trim();
    }

    public Short getENTERPERSON() {
        return ENTERPERSON;
    }

    public void setENTERPERSON(Short ENTERPERSON) {
        this.ENTERPERSON = ENTERPERSON;
    }

    public Date getENTERDATE() {
        return ENTERDATE;
    }

    public void setENTERDATE(Date ENTERDATE) {
        this.ENTERDATE = ENTERDATE;
    }

    @Override
    public String toString() {
        return "SorOutbound{" +
                "ID=" + ID +
                ", HANDOVERTYPE=" + HANDOVERTYPE +
                ", LINE='" + LINE + '\'' +
                ", DIRECTION=" + DIRECTION +
                ", ACCEPTPERSON=" + ACCEPTPERSON +
                ", CARRIERS=" + CARRIERS +
                ", DELIVERYPERSON=" + DELIVERYPERSON +
                ", DELIVERYDATE=" + DELIVERYDATE +
                ", DELIVERYCOMPANY='" + DELIVERYCOMPANY + '\'' +
                ", ENTERPERSON=" + ENTERPERSON +
                ", ENTERDATE=" + ENTERDATE +
                '}';
    }
}