package com.bos.model;

import java.util.Date;


public class AccBusinessadmissibility {
    private Short ID;

    private String BUSINESSNOTICENO;

    private Date RESERVATIONTIME;

    private String CUSTOMNAME;

    private String PICKUPADDRESS;

    private String CUSTOMCODE;

    private String LINKMAN;

    private String TELPHONE;

    private Short WEIGHT;

    private Short VOLUME;

    private String IMPORTANTHINTS;

    private String ARRIVECITY;

    private Short PICKERINFO;

    private String SENDADDRESS;

    private Short PROCESSINGUNIT;

    private Short NOTIFICATIONSOURCE;

    private Short CUSTOMNOMODIFYFLAG;

    private String SINGLETYPE;

    private Short PACKAGESNUM;

    private Short ACTUALWEIGHT;

    private Short BILLINGWEIGHT;

    private Short PACKINGFEE;

    private Short ACTUALPACKING;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getBUSINESSNOTICENO() {
        return BUSINESSNOTICENO;
    }

    public void setBUSINESSNOTICENO(String BUSINESSNOTICENO) {
        this.BUSINESSNOTICENO = BUSINESSNOTICENO == null ? null : BUSINESSNOTICENO.trim();
    }

    public Date getRESERVATIONTIME() {
        return RESERVATIONTIME;
    }

    public void setRESERVATIONTIME(Date RESERVATIONTIME) {
        this.RESERVATIONTIME = RESERVATIONTIME;
    }

    public String getCUSTOMNAME() {
        return CUSTOMNAME;
    }

    public void setCUSTOMNAME(String CUSTOMNAME) {
        this.CUSTOMNAME = CUSTOMNAME == null ? null : CUSTOMNAME.trim();
    }

    public String getPICKUPADDRESS() {
        return PICKUPADDRESS;
    }

    public void setPICKUPADDRESS(String PICKUPADDRESS) {
        this.PICKUPADDRESS = PICKUPADDRESS == null ? null : PICKUPADDRESS.trim();
    }

    public String getCUSTOMCODE() {
        return CUSTOMCODE;
    }

    public void setCUSTOMCODE(String CUSTOMCODE) {
        this.CUSTOMCODE = CUSTOMCODE == null ? null : CUSTOMCODE.trim();
    }

    public String getLINKMAN() {
        return LINKMAN;
    }

    public void setLINKMAN(String LINKMAN) {
        this.LINKMAN = LINKMAN == null ? null : LINKMAN.trim();
    }

    public String getTELPHONE() {
        return TELPHONE;
    }

    public void setTELPHONE(String TELPHONE) {
        this.TELPHONE = TELPHONE == null ? null : TELPHONE.trim();
    }

    public Short getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(Short WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public Short getVOLUME() {
        return VOLUME;
    }

    public void setVOLUME(Short VOLUME) {
        this.VOLUME = VOLUME;
    }

    public String getIMPORTANTHINTS() {
        return IMPORTANTHINTS;
    }

    public void setIMPORTANTHINTS(String IMPORTANTHINTS) {
        this.IMPORTANTHINTS = IMPORTANTHINTS == null ? null : IMPORTANTHINTS.trim();
    }

    public String getARRIVECITY() {
        return ARRIVECITY;
    }

    public void setARRIVECITY(String ARRIVECITY) {
        this.ARRIVECITY = ARRIVECITY == null ? null : ARRIVECITY.trim();
    }

    public Short getPICKERINFO() {
        return PICKERINFO;
    }

    public void setPICKERINFO(Short PICKERINFO) {
        this.PICKERINFO = PICKERINFO;
    }

    public String getSENDADDRESS() {
        return SENDADDRESS;
    }

    public void setSENDADDRESS(String SENDADDRESS) {
        this.SENDADDRESS = SENDADDRESS == null ? null : SENDADDRESS.trim();
    }

    public Short getPROCESSINGUNIT() {
        return PROCESSINGUNIT;
    }

    public void setPROCESSINGUNIT(Short PROCESSINGUNIT) {
        this.PROCESSINGUNIT = PROCESSINGUNIT;
    }

    public Short getNOTIFICATIONSOURCE() {
        return NOTIFICATIONSOURCE;
    }

    public void setNOTIFICATIONSOURCE(Short NOTIFICATIONSOURCE) {
        this.NOTIFICATIONSOURCE = NOTIFICATIONSOURCE;
    }

    public Short getCUSTOMNOMODIFYFLAG() {
        return CUSTOMNOMODIFYFLAG;
    }

    public void setCUSTOMNOMODIFYFLAG(Short CUSTOMNOMODIFYFLAG) {
        this.CUSTOMNOMODIFYFLAG = CUSTOMNOMODIFYFLAG;
    }

    public String getSINGLETYPE() {
        return SINGLETYPE;
    }

    public void setSINGLETYPE(String SINGLETYPE) {
        this.SINGLETYPE = SINGLETYPE == null ? null : SINGLETYPE.trim();
    }

    public Short getPACKAGESNUM() {
        return PACKAGESNUM;
    }

    public void setPACKAGESNUM(Short PACKAGESNUM) {
        this.PACKAGESNUM = PACKAGESNUM;
    }

    public Short getACTUALWEIGHT() {
        return ACTUALWEIGHT;
    }

    public void setACTUALWEIGHT(Short ACTUALWEIGHT) {
        this.ACTUALWEIGHT = ACTUALWEIGHT;
    }

    public Short getBILLINGWEIGHT() {
        return BILLINGWEIGHT;
    }

    public void setBILLINGWEIGHT(Short BILLINGWEIGHT) {
        this.BILLINGWEIGHT = BILLINGWEIGHT;
    }

    public Short getPACKINGFEE() {
        return PACKINGFEE;
    }

    public void setPACKINGFEE(Short PACKINGFEE) {
        this.PACKINGFEE = PACKINGFEE;
    }

    public Short getACTUALPACKING() {
        return ACTUALPACKING;
    }

    public void setACTUALPACKING(Short ACTUALPACKING) {
        this.ACTUALPACKING = ACTUALPACKING;
    }

    @Override
    public String toString() {
        return "AccBusinessadmissibility{" +
                "ID=" + ID +
                ", BUSINESSNOTICENO='" + BUSINESSNOTICENO + '\'' +
                ", RESERVATIONTIME=" + RESERVATIONTIME +
                ", CUSTOMNAME='" + CUSTOMNAME + '\'' +
                ", PICKUPADDRESS='" + PICKUPADDRESS + '\'' +
                ", CUSTOMCODE='" + CUSTOMCODE + '\'' +
                ", LINKMAN='" + LINKMAN + '\'' +
                ", TELPHONE='" + TELPHONE + '\'' +
                ", WEIGHT=" + WEIGHT +
                ", VOLUME=" + VOLUME +
                ", IMPORTANTHINTS='" + IMPORTANTHINTS + '\'' +
                ", ARRIVECITY='" + ARRIVECITY + '\'' +
                ", PICKERINFO=" + PICKERINFO +
                ", SENDADDRESS='" + SENDADDRESS + '\'' +
                ", PROCESSINGUNIT=" + PROCESSINGUNIT +
                ", NOTIFICATIONSOURCE=" + NOTIFICATIONSOURCE +
                ", CUSTOMNOMODIFYFLAG=" + CUSTOMNOMODIFYFLAG +
                ", SINGLETYPE='" + SINGLETYPE + '\'' +
                ", PACKAGESNUM=" + PACKAGESNUM +
                ", ACTUALWEIGHT=" + ACTUALWEIGHT +
                ", BILLINGWEIGHT=" + BILLINGWEIGHT +
                ", PACKINGFEE=" + PACKINGFEE +
                ", ACTUALPACKING=" + ACTUALPACKING +
                '}';
    }
}