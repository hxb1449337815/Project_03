package com.bos.model;

import java.util.Date;

public class IaeLineresource {
    private String ID;

    private String RESOURCETYPE;

    private String PORT;

    private Short DEMAND;

    private String VEHICLEINT;

    private String CAPACITY;

    private Short WAYBILLID;

    private String CARRIER;

    private Date EXPECTARRIVALDATE;

    private Date EXPECTDEPARTUREDATE;

    private Short TICKET;

    private Short CARGO;

    private Short WEIGHT;

    private Short VOLUME;

    private String HANDLEPERSON;

    private Date HANDLEDATE;

    private Short ENTERPERSON;

    private Date ENTERDATE;

    private String ENTERCOMPANY;

    private Short ACCEPTPERSON;

    private Date ACCEPTDATE;

    private String ACCEPTCOMPANY;

    private String ABNORMALREMARKS;

    private String WORKINT;

    private Short ACTUALCOUNT;

    private String DESTINATION;

    private String WARENAME;

    private Short ACTUALVOLUME;

    private Date TIMELIMIT;

    private String ASK;

    private String TAKECARGOPERSON;

    private String TACKCARGOADDRESS;

    private Short PAYMENT;

    private String SPECIALENSURE;

    private Short DELIVERYTYPE;

    private String IMPORTANTHINTS;

    private Date SURPLUSTIME;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getRESOURCETYPE() {
        return RESOURCETYPE;
    }

    public void setRESOURCETYPE(String RESOURCETYPE) {
        this.RESOURCETYPE = RESOURCETYPE == null ? null : RESOURCETYPE.trim();
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

    public String getCAPACITY() {
        return CAPACITY;
    }

    public void setCAPACITY(String CAPACITY) {
        this.CAPACITY = CAPACITY == null ? null : CAPACITY.trim();
    }

    public Short getWAYBILLID() {
        return WAYBILLID;
    }

    public void setWAYBILLID(Short WAYBILLID) {
        this.WAYBILLID = WAYBILLID;
    }

    public String getCARRIER() {
        return CARRIER;
    }

    public void setCARRIER(String CARRIER) {
        this.CARRIER = CARRIER == null ? null : CARRIER.trim();
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

    public Short getTICKET() {
        return TICKET;
    }

    public void setTICKET(Short TICKET) {
        this.TICKET = TICKET;
    }

    public Short getCARGO() {
        return CARGO;
    }

    public void setCARGO(Short CARGO) {
        this.CARGO = CARGO;
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

    public String getHANDLEPERSON() {
        return HANDLEPERSON;
    }

    public void setHANDLEPERSON(String HANDLEPERSON) {
        this.HANDLEPERSON = HANDLEPERSON == null ? null : HANDLEPERSON.trim();
    }

    public Date getHANDLEDATE() {
        return HANDLEDATE;
    }

    public void setHANDLEDATE(Date HANDLEDATE) {
        this.HANDLEDATE = HANDLEDATE;
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

    public String getENTERCOMPANY() {
        return ENTERCOMPANY;
    }

    public void setENTERCOMPANY(String ENTERCOMPANY) {
        this.ENTERCOMPANY = ENTERCOMPANY == null ? null : ENTERCOMPANY.trim();
    }

    public Short getACCEPTPERSON() {
        return ACCEPTPERSON;
    }

    public void setACCEPTPERSON(Short ACCEPTPERSON) {
        this.ACCEPTPERSON = ACCEPTPERSON;
    }

    public Date getACCEPTDATE() {
        return ACCEPTDATE;
    }

    public void setACCEPTDATE(Date ACCEPTDATE) {
        this.ACCEPTDATE = ACCEPTDATE;
    }

    public String getACCEPTCOMPANY() {
        return ACCEPTCOMPANY;
    }

    public void setACCEPTCOMPANY(String ACCEPTCOMPANY) {
        this.ACCEPTCOMPANY = ACCEPTCOMPANY == null ? null : ACCEPTCOMPANY.trim();
    }

    public String getABNORMALREMARKS() {
        return ABNORMALREMARKS;
    }

    public void setABNORMALREMARKS(String ABNORMALREMARKS) {
        this.ABNORMALREMARKS = ABNORMALREMARKS == null ? null : ABNORMALREMARKS.trim();
    }

    public String getWORKINT() {
        return WORKINT;
    }

    public void setWORKINT(String WORKINT) {
        this.WORKINT = WORKINT == null ? null : WORKINT.trim();
    }

    public Short getACTUALCOUNT() {
        return ACTUALCOUNT;
    }

    public void setACTUALCOUNT(Short ACTUALCOUNT) {
        this.ACTUALCOUNT = ACTUALCOUNT;
    }

    public String getDESTINATION() {
        return DESTINATION;
    }

    public void setDESTINATION(String DESTINATION) {
        this.DESTINATION = DESTINATION == null ? null : DESTINATION.trim();
    }

    public String getWARENAME() {
        return WARENAME;
    }

    public void setWARENAME(String WARENAME) {
        this.WARENAME = WARENAME == null ? null : WARENAME.trim();
    }

    public Short getACTUALVOLUME() {
        return ACTUALVOLUME;
    }

    public void setACTUALVOLUME(Short ACTUALVOLUME) {
        this.ACTUALVOLUME = ACTUALVOLUME;
    }

    public Date getTIMELIMIT() {
        return TIMELIMIT;
    }

    public void setTIMELIMIT(Date TIMELIMIT) {
        this.TIMELIMIT = TIMELIMIT;
    }

    public String getASK() {
        return ASK;
    }

    public void setASK(String ASK) {
        this.ASK = ASK == null ? null : ASK.trim();
    }

    public String getTAKECARGOPERSON() {
        return TAKECARGOPERSON;
    }

    public void setTAKECARGOPERSON(String TAKECARGOPERSON) {
        this.TAKECARGOPERSON = TAKECARGOPERSON == null ? null : TAKECARGOPERSON.trim();
    }

    public String getTACKCARGOADDRESS() {
        return TACKCARGOADDRESS;
    }

    public void setTACKCARGOADDRESS(String TACKCARGOADDRESS) {
        this.TACKCARGOADDRESS = TACKCARGOADDRESS == null ? null : TACKCARGOADDRESS.trim();
    }

    public Short getPAYMENT() {
        return PAYMENT;
    }

    public void setPAYMENT(Short PAYMENT) {
        this.PAYMENT = PAYMENT;
    }

    public String getSPECIALENSURE() {
        return SPECIALENSURE;
    }

    public void setSPECIALENSURE(String SPECIALENSURE) {
        this.SPECIALENSURE = SPECIALENSURE == null ? null : SPECIALENSURE.trim();
    }

    public Short getDELIVERYTYPE() {
        return DELIVERYTYPE;
    }

    public void setDELIVERYTYPE(Short DELIVERYTYPE) {
        this.DELIVERYTYPE = DELIVERYTYPE;
    }

    public String getIMPORTANTHINTS() {
        return IMPORTANTHINTS;
    }

    public void setIMPORTANTHINTS(String IMPORTANTHINTS) {
        this.IMPORTANTHINTS = IMPORTANTHINTS == null ? null : IMPORTANTHINTS.trim();
    }

    public Date getSURPLUSTIME() {
        return SURPLUSTIME;
    }

    public void setSURPLUSTIME(Date SURPLUSTIME) {
        this.SURPLUSTIME = SURPLUSTIME;
    }

    @Override
    public String toString() {
        return "IaeLineresource{" +
                "ID='" + ID + '\'' +
                ", RESOURCETYPE='" + RESOURCETYPE + '\'' +
                ", PORT='" + PORT + '\'' +
                ", DEMAND=" + DEMAND +
                ", VEHICLEINT='" + VEHICLEINT + '\'' +
                ", CAPACITY='" + CAPACITY + '\'' +
                ", WAYBILLID=" + WAYBILLID +
                ", CARRIER='" + CARRIER + '\'' +
                ", EXPECTARRIVALDATE=" + EXPECTARRIVALDATE +
                ", EXPECTDEPARTUREDATE=" + EXPECTDEPARTUREDATE +
                ", TICKET=" + TICKET +
                ", CARGO=" + CARGO +
                ", WEIGHT=" + WEIGHT +
                ", VOLUME=" + VOLUME +
                ", HANDLEPERSON='" + HANDLEPERSON + '\'' +
                ", HANDLEDATE=" + HANDLEDATE +
                ", ENTERPERSON=" + ENTERPERSON +
                ", ENTERDATE=" + ENTERDATE +
                ", ENTERCOMPANY='" + ENTERCOMPANY + '\'' +
                ", ACCEPTPERSON=" + ACCEPTPERSON +
                ", ACCEPTDATE=" + ACCEPTDATE +
                ", ACCEPTCOMPANY='" + ACCEPTCOMPANY + '\'' +
                ", ABNORMALREMARKS='" + ABNORMALREMARKS + '\'' +
                ", WORKINT='" + WORKINT + '\'' +
                ", ACTUALCOUNT=" + ACTUALCOUNT +
                ", DESTINATION='" + DESTINATION + '\'' +
                ", WARENAME='" + WARENAME + '\'' +
                ", ACTUALVOLUME=" + ACTUALVOLUME +
                ", TIMELIMIT=" + TIMELIMIT +
                ", ASK='" + ASK + '\'' +
                ", TAKECARGOPERSON='" + TAKECARGOPERSON + '\'' +
                ", TACKCARGOADDRESS='" + TACKCARGOADDRESS + '\'' +
                ", PAYMENT=" + PAYMENT +
                ", SPECIALENSURE='" + SPECIALENSURE + '\'' +
                ", DELIVERYTYPE=" + DELIVERYTYPE +
                ", IMPORTANTHINTS='" + IMPORTANTHINTS + '\'' +
                ", SURPLUSTIME=" + SURPLUSTIME +
                '}';
    }
}