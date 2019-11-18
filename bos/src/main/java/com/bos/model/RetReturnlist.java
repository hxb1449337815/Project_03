package com.bos.model;

import java.util.Date;

public class RetReturnlist {
    private Short ID;

    private String APPLICATIONNO;

    private String WORKSHEETNO;

    private Short RETURNTYPE;

    private String APREMARK;

    private Short APLOSS;

    private Date ENTRYTIME;

    private Short RECEIVEGUNIT;

    private Short INVALIDATESIGN;

    private Short RETURNUNIT;

    private Date RECORDINGTIME;

    private Short ENTRYUNIT;

    private String PERSONNAME;

    private Date CONFIRMATIONTIME;

    private Short CONFIRMATIONUNIT;

    private String CONFIRMATIONPERSONNAME;

    private Short TREATMENTSTATE;

    private Short APRETURNSTATUS;

    private Short IDENTIFICATIONSIGN;

    private String HANDLINGOPINIONS;

    private String DENIALTYPE;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getAPPLICATIONNO() {
        return APPLICATIONNO;
    }

    public void setAPPLICATIONNO(String APPLICATIONNO) {
        this.APPLICATIONNO = APPLICATIONNO == null ? null : APPLICATIONNO.trim();
    }

    public String getWORKSHEETNO() {
        return WORKSHEETNO;
    }

    public void setWORKSHEETNO(String WORKSHEETNO) {
        this.WORKSHEETNO = WORKSHEETNO == null ? null : WORKSHEETNO.trim();
    }

    public Short getRETURNTYPE() {
        return RETURNTYPE;
    }

    public void setRETURNTYPE(Short RETURNTYPE) {
        this.RETURNTYPE = RETURNTYPE;
    }

    public String getAPREMARK() {
        return APREMARK;
    }

    public void setAPREMARK(String APREMARK) {
        this.APREMARK = APREMARK == null ? null : APREMARK.trim();
    }

    public Short getAPLOSS() {
        return APLOSS;
    }

    public void setAPLOSS(Short APLOSS) {
        this.APLOSS = APLOSS;
    }

    public Date getENTRYTIME() {
        return ENTRYTIME;
    }

    public void setENTRYTIME(Date ENTRYTIME) {
        this.ENTRYTIME = ENTRYTIME;
    }

    public Short getRECEIVEGUNIT() {
        return RECEIVEGUNIT;
    }

    public void setRECEIVEGUNIT(Short RECEIVEGUNIT) {
        this.RECEIVEGUNIT = RECEIVEGUNIT;
    }

    public Short getINVALIDATESIGN() {
        return INVALIDATESIGN;
    }

    public void setINVALIDATESIGN(Short INVALIDATESIGN) {
        this.INVALIDATESIGN = INVALIDATESIGN;
    }

    public Short getRETURNUNIT() {
        return RETURNUNIT;
    }

    public void setRETURNUNIT(Short RETURNUNIT) {
        this.RETURNUNIT = RETURNUNIT;
    }

    public Date getRECORDINGTIME() {
        return RECORDINGTIME;
    }

    public void setRECORDINGTIME(Date RECORDINGTIME) {
        this.RECORDINGTIME = RECORDINGTIME;
    }

    public Short getENTRYUNIT() {
        return ENTRYUNIT;
    }

    public void setENTRYUNIT(Short ENTRYUNIT) {
        this.ENTRYUNIT = ENTRYUNIT;
    }

    public String getPERSONNAME() {
        return PERSONNAME;
    }

    public void setPERSONNAME(String PERSONNAME) {
        this.PERSONNAME = PERSONNAME == null ? null : PERSONNAME.trim();
    }

    public Date getCONFIRMATIONTIME() {
        return CONFIRMATIONTIME;
    }

    public void setCONFIRMATIONTIME(Date CONFIRMATIONTIME) {
        this.CONFIRMATIONTIME = CONFIRMATIONTIME;
    }

    public Short getCONFIRMATIONUNIT() {
        return CONFIRMATIONUNIT;
    }

    public void setCONFIRMATIONUNIT(Short CONFIRMATIONUNIT) {
        this.CONFIRMATIONUNIT = CONFIRMATIONUNIT;
    }

    public String getCONFIRMATIONPERSONNAME() {
        return CONFIRMATIONPERSONNAME;
    }

    public void setCONFIRMATIONPERSONNAME(String CONFIRMATIONPERSONNAME) {
        this.CONFIRMATIONPERSONNAME = CONFIRMATIONPERSONNAME == null ? null : CONFIRMATIONPERSONNAME.trim();
    }

    public Short getTREATMENTSTATE() {
        return TREATMENTSTATE;
    }

    public void setTREATMENTSTATE(Short TREATMENTSTATE) {
        this.TREATMENTSTATE = TREATMENTSTATE;
    }

    public Short getAPRETURNSTATUS() {
        return APRETURNSTATUS;
    }

    public void setAPRETURNSTATUS(Short APRETURNSTATUS) {
        this.APRETURNSTATUS = APRETURNSTATUS;
    }

    public Short getIDENTIFICATIONSIGN() {
        return IDENTIFICATIONSIGN;
    }

    public void setIDENTIFICATIONSIGN(Short IDENTIFICATIONSIGN) {
        this.IDENTIFICATIONSIGN = IDENTIFICATIONSIGN;
    }

    public String getHANDLINGOPINIONS() {
        return HANDLINGOPINIONS;
    }

    public void setHANDLINGOPINIONS(String HANDLINGOPINIONS) {
        this.HANDLINGOPINIONS = HANDLINGOPINIONS == null ? null : HANDLINGOPINIONS.trim();
    }

    public String getDENIALTYPE() {
        return DENIALTYPE;
    }

    public void setDENIALTYPE(String DENIALTYPE) {
        this.DENIALTYPE = DENIALTYPE == null ? null : DENIALTYPE.trim();
    }

    @Override
    public String toString() {
        return "RetReturnlist{" +
                "ID=" + ID +
                ", APPLICATIONNO='" + APPLICATIONNO + '\'' +
                ", WORKSHEETNO='" + WORKSHEETNO + '\'' +
                ", RETURNTYPE=" + RETURNTYPE +
                ", APREMARK='" + APREMARK + '\'' +
                ", APLOSS=" + APLOSS +
                ", ENTRYTIME=" + ENTRYTIME +
                ", RECEIVEGUNIT=" + RECEIVEGUNIT +
                ", INVALIDATESIGN=" + INVALIDATESIGN +
                ", RETURNUNIT=" + RETURNUNIT +
                ", RECORDINGTIME=" + RECORDINGTIME +
                ", ENTRYUNIT=" + ENTRYUNIT +
                ", PERSONNAME='" + PERSONNAME + '\'' +
                ", CONFIRMATIONTIME=" + CONFIRMATIONTIME +
                ", CONFIRMATIONUNIT=" + CONFIRMATIONUNIT +
                ", CONFIRMATIONPERSONNAME='" + CONFIRMATIONPERSONNAME + '\'' +
                ", TREATMENTSTATE=" + TREATMENTSTATE +
                ", APRETURNSTATUS=" + APRETURNSTATUS +
                ", IDENTIFICATIONSIGN=" + IDENTIFICATIONSIGN +
                ", HANDLINGOPINIONS='" + HANDLINGOPINIONS + '\'' +
                ", DENIALTYPE='" + DENIALTYPE + '\'' +
                '}';
    }
}