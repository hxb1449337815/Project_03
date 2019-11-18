package com.bos.model;

import java.util.Date;

public class LogLogisticsdetails {
    private Short ID;

    private String LOGISTICSINT;

    private String COMPANYNAME;

    private Date EXPECTARRIVALDATE;

    private Date ACTUALARRIVALDATE;

    private Date EXPECTDEPARTUREDATE;

    private Date ACTUALDEPARTUREDATE;

    private String OPERATIONPERSON;

    private String LOGISTICSTYPE;

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

    public String getCOMPANYNAME() {
        return COMPANYNAME;
    }

    public void setCOMPANYNAME(String COMPANYNAME) {
        this.COMPANYNAME = COMPANYNAME == null ? null : COMPANYNAME.trim();
    }

    public Date getEXPECTARRIVALDATE() {
        return EXPECTARRIVALDATE;
    }

    public void setEXPECTARRIVALDATE(Date EXPECTARRIVALDATE) {
        this.EXPECTARRIVALDATE = EXPECTARRIVALDATE;
    }

    public Date getACTUALARRIVALDATE() {
        return ACTUALARRIVALDATE;
    }

    public void setACTUALARRIVALDATE(Date ACTUALARRIVALDATE) {
        this.ACTUALARRIVALDATE = ACTUALARRIVALDATE;
    }

    public Date getEXPECTDEPARTUREDATE() {
        return EXPECTDEPARTUREDATE;
    }

    public void setEXPECTDEPARTUREDATE(Date EXPECTDEPARTUREDATE) {
        this.EXPECTDEPARTUREDATE = EXPECTDEPARTUREDATE;
    }

    public Date getACTUALDEPARTUREDATE() {
        return ACTUALDEPARTUREDATE;
    }

    public void setACTUALDEPARTUREDATE(Date ACTUALDEPARTUREDATE) {
        this.ACTUALDEPARTUREDATE = ACTUALDEPARTUREDATE;
    }

    public String getOPERATIONPERSON() {
        return OPERATIONPERSON;
    }

    public void setOPERATIONPERSON(String OPERATIONPERSON) {
        this.OPERATIONPERSON = OPERATIONPERSON == null ? null : OPERATIONPERSON.trim();
    }

    public String getLOGISTICSTYPE() {
        return LOGISTICSTYPE;
    }

    public void setLOGISTICSTYPE(String LOGISTICSTYPE) {
        this.LOGISTICSTYPE = LOGISTICSTYPE == null ? null : LOGISTICSTYPE.trim();
    }

    @Override
    public String toString() {
        return "LogLogisticsdetails{" +
                "ID=" + ID +
                ", LOGISTICSINT='" + LOGISTICSINT + '\'' +
                ", COMPANYNAME='" + COMPANYNAME + '\'' +
                ", EXPECTARRIVALDATE=" + EXPECTARRIVALDATE +
                ", ACTUALARRIVALDATE=" + ACTUALARRIVALDATE +
                ", EXPECTDEPARTUREDATE=" + EXPECTDEPARTUREDATE +
                ", ACTUALDEPARTUREDATE=" + ACTUALDEPARTUREDATE +
                ", OPERATIONPERSON='" + OPERATIONPERSON + '\'' +
                ", LOGISTICSTYPE='" + LOGISTICSTYPE + '\'' +
                '}';
    }
}