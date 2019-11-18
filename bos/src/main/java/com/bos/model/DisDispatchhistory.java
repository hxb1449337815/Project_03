package com.bos.model;

import java.util.Date;

public class DisDispatchhistory {
    private Short ID;

    private Short DISPATCHSEQUENCE;

    private Short TRANSFERREDUNIT;

    private Short OPERATORID;

    private Short OPERATIONUNITID;

    private Date OPERATIONTIME;

    private String REMARK;

    private Short STATUS;

    private String REASON;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public Short getDISPATCHSEQUENCE() {
        return DISPATCHSEQUENCE;
    }

    public void setDISPATCHSEQUENCE(Short DISPATCHSEQUENCE) {
        this.DISPATCHSEQUENCE = DISPATCHSEQUENCE;
    }

    public Short getTRANSFERREDUNIT() {
        return TRANSFERREDUNIT;
    }

    public void setTRANSFERREDUNIT(Short TRANSFERREDUNIT) {
        this.TRANSFERREDUNIT = TRANSFERREDUNIT;
    }

    public Short getOPERATORID() {
        return OPERATORID;
    }

    public void setOPERATORID(Short OPERATORID) {
        this.OPERATORID = OPERATORID;
    }

    public Short getOPERATIONUNITID() {
        return OPERATIONUNITID;
    }

    public void setOPERATIONUNITID(Short OPERATIONUNITID) {
        this.OPERATIONUNITID = OPERATIONUNITID;
    }

    public Date getOPERATIONTIME() {
        return OPERATIONTIME;
    }

    public void setOPERATIONTIME(Date OPERATIONTIME) {
        this.OPERATIONTIME = OPERATIONTIME;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK == null ? null : REMARK.trim();
    }

    public Short getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Short STATUS) {
        this.STATUS = STATUS;
    }

    public String getREASON() {
        return REASON;
    }

    public void setREASON(String REASON) {
        this.REASON = REASON == null ? null : REASON.trim();
    }

    @Override
    public String toString() {
        return "DisDispatchhistory{" +
                "ID=" + ID +
                ", DISPATCHSEQUENCE=" + DISPATCHSEQUENCE +
                ", TRANSFERREDUNIT=" + TRANSFERREDUNIT +
                ", OPERATORID=" + OPERATORID +
                ", OPERATIONUNITID=" + OPERATIONUNITID +
                ", OPERATIONTIME=" + OPERATIONTIME +
                ", REMARK='" + REMARK + '\'' +
                ", STATUS=" + STATUS +
                ", REASON='" + REASON + '\'' +
                '}';
    }
}