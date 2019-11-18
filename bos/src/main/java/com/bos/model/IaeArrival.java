package com.bos.model;

import java.util.Date;

public class IaeArrival {
    private String ID;

    private String SENDCOMPANY;

    private String CARGOADDRESS;

    private String ISSUEPERSON;

    private Date ISSUEDATE;

    private String WORKADDRESS;

    private Date STORAGEDATE;

    private Date OUTBOUNDDATE;

    private Date TIMELIMIT;

    private Short BATCH;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getSENDCOMPANY() {
        return SENDCOMPANY;
    }

    public void setSENDCOMPANY(String SENDCOMPANY) {
        this.SENDCOMPANY = SENDCOMPANY == null ? null : SENDCOMPANY.trim();
    }

    public String getCARGOADDRESS() {
        return CARGOADDRESS;
    }

    public void setCARGOADDRESS(String CARGOADDRESS) {
        this.CARGOADDRESS = CARGOADDRESS == null ? null : CARGOADDRESS.trim();
    }

    public String getISSUEPERSON() {
        return ISSUEPERSON;
    }

    public void setISSUEPERSON(String ISSUEPERSON) {
        this.ISSUEPERSON = ISSUEPERSON == null ? null : ISSUEPERSON.trim();
    }

    public Date getISSUEDATE() {
        return ISSUEDATE;
    }

    public void setISSUEDATE(Date ISSUEDATE) {
        this.ISSUEDATE = ISSUEDATE;
    }

    public String getWORKADDRESS() {
        return WORKADDRESS;
    }

    public void setWORKADDRESS(String WORKADDRESS) {
        this.WORKADDRESS = WORKADDRESS == null ? null : WORKADDRESS.trim();
    }

    public Date getSTORAGEDATE() {
        return STORAGEDATE;
    }

    public void setSTORAGEDATE(Date STORAGEDATE) {
        this.STORAGEDATE = STORAGEDATE;
    }

    public Date getOUTBOUNDDATE() {
        return OUTBOUNDDATE;
    }

    public void setOUTBOUNDDATE(Date OUTBOUNDDATE) {
        this.OUTBOUNDDATE = OUTBOUNDDATE;
    }

    public Date getTIMELIMIT() {
        return TIMELIMIT;
    }

    public void setTIMELIMIT(Date TIMELIMIT) {
        this.TIMELIMIT = TIMELIMIT;
    }

    public Short getBATCH() {
        return BATCH;
    }

    public void setBATCH(Short BATCH) {
        this.BATCH = BATCH;
    }

    @Override
    public String toString() {
        return "IaeArrival{" +
                "ID='" + ID + '\'' +
                ", SENDCOMPANY='" + SENDCOMPANY + '\'' +
                ", CARGOADDRESS='" + CARGOADDRESS + '\'' +
                ", ISSUEPERSON='" + ISSUEPERSON + '\'' +
                ", ISSUEDATE=" + ISSUEDATE +
                ", WORKADDRESS='" + WORKADDRESS + '\'' +
                ", STORAGEDATE=" + STORAGEDATE +
                ", OUTBOUNDDATE=" + OUTBOUNDDATE +
                ", TIMELIMIT=" + TIMELIMIT +
                ", BATCH=" + BATCH +
                '}';
    }
}