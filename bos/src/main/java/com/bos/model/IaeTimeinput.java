package com.bos.model;

import java.util.Date;

public class IaeTimeinput {
    private Short ID;

    private String INPUTTYPE;

    private String PORT;

    private Short DEMAND;

    private String VEHICLEINT;

    private String WAYBILLID;

    private Date EXPECTARRIVALDATE;

    private Date EXPECTDEPARTUREDATE;

    private Date ACTUALARRIVALDATE;

    private Date ACTUALDEPARTUREDATE;

    private String START;

    private Short CARRIERS;

    private String REMARKS;

    private Short INPUTPERSON;

    private Date INPUTDATE;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getINPUTTYPE() {
        return INPUTTYPE;
    }

    public void setINPUTTYPE(String INPUTTYPE) {
        this.INPUTTYPE = INPUTTYPE == null ? null : INPUTTYPE.trim();
    }

    public String getPORT() {
        return PORT;
    }

    public void setPORT(String PORT) {
        this.PORT = PORT == null ? null : PORT.trim();
    }

    public Short getDEMAND() {
        return DEMAND;
    }

    public void setDEMAND(Short DEMAND) {
        this.DEMAND = DEMAND;
    }

    public String getVEHICLEINT() {
        return VEHICLEINT;
    }

    public void setVEHICLEINT(String VEHICLEINT) {
        this.VEHICLEINT = VEHICLEINT == null ? null : VEHICLEINT.trim();
    }

    public String getWAYBILLID() {
        return WAYBILLID;
    }

    public void setWAYBILLID(String WAYBILLID) {
        this.WAYBILLID = WAYBILLID == null ? null : WAYBILLID.trim();
    }

    public Date getEXPECTARRIVALDATE() {
        return EXPECTARRIVALDATE;
    }

    public void setEXPECTARRIVALDATE(Date EXPECTARRIVALDATE) {
        this.EXPECTARRIVALDATE = EXPECTARRIVALDATE;
    }

    public Date getEXPECTDEPARTUREDATE() {
        return EXPECTDEPARTUREDATE;
    }

    public void setEXPECTDEPARTUREDATE(Date EXPECTDEPARTUREDATE) {
        this.EXPECTDEPARTUREDATE = EXPECTDEPARTUREDATE;
    }

    public Date getACTUALARRIVALDATE() {
        return ACTUALARRIVALDATE;
    }

    public void setACTUALARRIVALDATE(Date ACTUALARRIVALDATE) {
        this.ACTUALARRIVALDATE = ACTUALARRIVALDATE;
    }

    public Date getACTUALDEPARTUREDATE() {
        return ACTUALDEPARTUREDATE;
    }

    public void setACTUALDEPARTUREDATE(Date ACTUALDEPARTUREDATE) {
        this.ACTUALDEPARTUREDATE = ACTUALDEPARTUREDATE;
    }

    public String getSTART() {
        return START;
    }

    public void setSTART(String START) {
        this.START = START == null ? null : START.trim();
    }

    public Short getCARRIERS() {
        return CARRIERS;
    }

    public void setCARRIERS(Short CARRIERS) {
        this.CARRIERS = CARRIERS;
    }

    public String getREMARKS() {
        return REMARKS;
    }

    public void setREMARKS(String REMARKS) {
        this.REMARKS = REMARKS == null ? null : REMARKS.trim();
    }

    public Short getINPUTPERSON() {
        return INPUTPERSON;
    }

    public void setINPUTPERSON(Short INPUTPERSON) {
        this.INPUTPERSON = INPUTPERSON;
    }

    public Date getINPUTDATE() {
        return INPUTDATE;
    }

    public void setINPUTDATE(Date INPUTDATE) {
        this.INPUTDATE = INPUTDATE;
    }

    @Override
    public String toString() {
        return "IaeTimeinput{" +
                "ID=" + ID +
                ", INPUTTYPE='" + INPUTTYPE + '\'' +
                ", PORT='" + PORT + '\'' +
                ", DEMAND=" + DEMAND +
                ", VEHICLEINT='" + VEHICLEINT + '\'' +
                ", WAYBILLID='" + WAYBILLID + '\'' +
                ", EXPECTARRIVALDATE=" + EXPECTARRIVALDATE +
                ", EXPECTDEPARTUREDATE=" + EXPECTDEPARTUREDATE +
                ", ACTUALARRIVALDATE=" + ACTUALARRIVALDATE +
                ", ACTUALDEPARTUREDATE=" + ACTUALDEPARTUREDATE +
                ", START='" + START + '\'' +
                ", CARRIERS=" + CARRIERS +
                ", REMARKS='" + REMARKS + '\'' +
                ", INPUTPERSON=" + INPUTPERSON +
                ", INPUTDATE=" + INPUTDATE +
                '}';
    }
}