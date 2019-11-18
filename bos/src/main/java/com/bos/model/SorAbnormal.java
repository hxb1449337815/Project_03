package com.bos.model;

import java.util.Date;

public class SorAbnormal {
    private Short ID;

    private Date LAUNCHDATE;

    private String LAUNCHPERSON;

    private String LAUNCHCOMPANY;

    private Short ABNORMALTYPE;

    private String TRANSFERINT;

    private String CARGOINT;

    private String PACKAGEINT;

    private Short HEDGEABNINT;

    private Short ABOSTATE;

    private Date HANDLEDATE;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public Date getLAUNCHDATE() {
        return LAUNCHDATE;
    }

    public void setLAUNCHDATE(Date LAUNCHDATE) {
        this.LAUNCHDATE = LAUNCHDATE;
    }

    public String getLAUNCHPERSON() {
        return LAUNCHPERSON;
    }

    public void setLAUNCHPERSON(String LAUNCHPERSON) {
        this.LAUNCHPERSON = LAUNCHPERSON == null ? null : LAUNCHPERSON.trim();
    }

    public String getLAUNCHCOMPANY() {
        return LAUNCHCOMPANY;
    }

    public void setLAUNCHCOMPANY(String LAUNCHCOMPANY) {
        this.LAUNCHCOMPANY = LAUNCHCOMPANY == null ? null : LAUNCHCOMPANY.trim();
    }

    public Short getABNORMALTYPE() {
        return ABNORMALTYPE;
    }

    public void setABNORMALTYPE(Short ABNORMALTYPE) {
        this.ABNORMALTYPE = ABNORMALTYPE;
    }

    public String getTRANSFERINT() {
        return TRANSFERINT;
    }

    public void setTRANSFERINT(String TRANSFERINT) {
        this.TRANSFERINT = TRANSFERINT == null ? null : TRANSFERINT.trim();
    }

    public String getCARGOINT() {
        return CARGOINT;
    }

    public void setCARGOINT(String CARGOINT) {
        this.CARGOINT = CARGOINT == null ? null : CARGOINT.trim();
    }

    public String getPACKAGEINT() {
        return PACKAGEINT;
    }

    public void setPACKAGEINT(String PACKAGEINT) {
        this.PACKAGEINT = PACKAGEINT == null ? null : PACKAGEINT.trim();
    }

    public Short getHEDGEABNINT() {
        return HEDGEABNINT;
    }

    public void setHEDGEABNINT(Short HEDGEABNINT) {
        this.HEDGEABNINT = HEDGEABNINT;
    }

    public Short getABOSTATE() {
        return ABOSTATE;
    }

    public void setABOSTATE(Short ABOSTATE) {
        this.ABOSTATE = ABOSTATE;
    }

    public Date getHANDLEDATE() {
        return HANDLEDATE;
    }

    public void setHANDLEDATE(Date HANDLEDATE) {
        this.HANDLEDATE = HANDLEDATE;
    }

    @Override
    public String toString() {
        return "SorAbnormal{" +
                "ID=" + ID +
                ", LAUNCHDATE=" + LAUNCHDATE +
                ", LAUNCHPERSON='" + LAUNCHPERSON + '\'' +
                ", LAUNCHCOMPANY='" + LAUNCHCOMPANY + '\'' +
                ", ABNORMALTYPE=" + ABNORMALTYPE +
                ", TRANSFERINT='" + TRANSFERINT + '\'' +
                ", CARGOINT='" + CARGOINT + '\'' +
                ", PACKAGEINT='" + PACKAGEINT + '\'' +
                ", HEDGEABNINT=" + HEDGEABNINT +
                ", ABOSTATE=" + ABOSTATE +
                ", HANDLEDATE=" + HANDLEDATE +
                '}';
    }
}