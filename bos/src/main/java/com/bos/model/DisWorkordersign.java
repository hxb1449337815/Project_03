package com.bos.model;

import java.util.Date;

public class DisWorkordersign {
    private Short ID;

    private Short WORKORDERID;

    private String WORKSHEETNO;

    private Short WORKORDERTYPE;

    private Short SIGNTYPE;

    private Short COURIERINT;

    private String COURIERNAME;

    private String RECIPIENT;

    private Short SIGNUNIT;

    private Date SIGNTIME;

    private Short INVALIDATEMARK;

    private String ABNORMALMARK;

    private Short INPUTPERSONCODE;

    private Short INPUTPERSONID;

    private Short INPUTID;

    private Date INPUTTIME;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public Short getWORKORDERID() {
        return WORKORDERID;
    }

    public void setWORKORDERID(Short WORKORDERID) {
        this.WORKORDERID = WORKORDERID;
    }

    public String getWORKSHEETNO() {
        return WORKSHEETNO;
    }

    public void setWORKSHEETNO(String WORKSHEETNO) {
        this.WORKSHEETNO = WORKSHEETNO == null ? null : WORKSHEETNO.trim();
    }

    public Short getWORKORDERTYPE() {
        return WORKORDERTYPE;
    }

    public void setWORKORDERTYPE(Short WORKORDERTYPE) {
        this.WORKORDERTYPE = WORKORDERTYPE;
    }

    public Short getSIGNTYPE() {
        return SIGNTYPE;
    }

    public void setSIGNTYPE(Short SIGNTYPE) {
        this.SIGNTYPE = SIGNTYPE;
    }

    public Short getCOURIERINT() {
        return COURIERINT;
    }

    public void setCOURIERINT(Short COURIERINT) {
        this.COURIERINT = COURIERINT;
    }

    public String getCOURIERNAME() {
        return COURIERNAME;
    }

    public void setCOURIERNAME(String COURIERNAME) {
        this.COURIERNAME = COURIERNAME == null ? null : COURIERNAME.trim();
    }

    public String getRECIPIENT() {
        return RECIPIENT;
    }

    public void setRECIPIENT(String RECIPIENT) {
        this.RECIPIENT = RECIPIENT == null ? null : RECIPIENT.trim();
    }

    public Short getSIGNUNIT() {
        return SIGNUNIT;
    }

    public void setSIGNUNIT(Short SIGNUNIT) {
        this.SIGNUNIT = SIGNUNIT;
    }

    public Date getSIGNTIME() {
        return SIGNTIME;
    }

    public void setSIGNTIME(Date SIGNTIME) {
        this.SIGNTIME = SIGNTIME;
    }

    public Short getINVALIDATEMARK() {
        return INVALIDATEMARK;
    }

    public void setINVALIDATEMARK(Short INVALIDATEMARK) {
        this.INVALIDATEMARK = INVALIDATEMARK;
    }

    public String getABNORMALMARK() {
        return ABNORMALMARK;
    }

    public void setABNORMALMARK(String ABNORMALMARK) {
        this.ABNORMALMARK = ABNORMALMARK == null ? null : ABNORMALMARK.trim();
    }

    public Short getINPUTPERSONCODE() {
        return INPUTPERSONCODE;
    }

    public void setINPUTPERSONCODE(Short INPUTPERSONCODE) {
        this.INPUTPERSONCODE = INPUTPERSONCODE;
    }

    public Short getINPUTPERSONID() {
        return INPUTPERSONID;
    }

    public void setINPUTPERSONID(Short INPUTPERSONID) {
        this.INPUTPERSONID = INPUTPERSONID;
    }

    public Short getINPUTID() {
        return INPUTID;
    }

    public void setINPUTID(Short INPUTID) {
        this.INPUTID = INPUTID;
    }

    public Date getINPUTTIME() {
        return INPUTTIME;
    }

    public void setINPUTTIME(Date INPUTTIME) {
        this.INPUTTIME = INPUTTIME;
    }

    @Override
    public String toString() {
        return "DisWorkordersign{" +
                "ID=" + ID +
                ", WORKORDERID=" + WORKORDERID +
                ", WORKSHEETNO='" + WORKSHEETNO + '\'' +
                ", WORKORDERTYPE=" + WORKORDERTYPE +
                ", SIGNTYPE=" + SIGNTYPE +
                ", COURIERINT=" + COURIERINT +
                ", COURIERNAME='" + COURIERNAME + '\'' +
                ", RECIPIENT='" + RECIPIENT + '\'' +
                ", SIGNUNIT=" + SIGNUNIT +
                ", SIGNTIME=" + SIGNTIME +
                ", INVALIDATEMARK=" + INVALIDATEMARK +
                ", ABNORMALMARK='" + ABNORMALMARK + '\'' +
                ", INPUTPERSONCODE=" + INPUTPERSONCODE +
                ", INPUTPERSONID=" + INPUTPERSONID +
                ", INPUTID=" + INPUTID +
                ", INPUTTIME=" + INPUTTIME +
                '}';
    }
}