package com.bos.model;

import java.util.Date;

public class BiglogLogisticscontroltable {
    private Short ID;

    private String WORKSHEETNO;

    private Short CTYPE;

    private String CORPORATION;

    private String WAYBILLID;

    private String REMARKS;

    private Short INPUTPERSON;

    private Date INPUTDATE;

    private Short INPUTCOMPANY;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getWORKSHEETNO() {
        return WORKSHEETNO;
    }

    public void setWORKSHEETNO(String WORKSHEETNO) {
        this.WORKSHEETNO = WORKSHEETNO == null ? null : WORKSHEETNO.trim();
    }

    public Short getCTYPE() {
        return CTYPE;
    }

    public void setCTYPE(Short CTYPE) {
        this.CTYPE = CTYPE;
    }

    public String getCORPORATION() {
        return CORPORATION;
    }

    public void setCORPORATION(String CORPORATION) {
        this.CORPORATION = CORPORATION == null ? null : CORPORATION.trim();
    }

    public String getWAYBILLID() {
        return WAYBILLID;
    }

    public void setWAYBILLID(String WAYBILLID) {
        this.WAYBILLID = WAYBILLID == null ? null : WAYBILLID.trim();
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

    public Short getINPUTCOMPANY() {
        return INPUTCOMPANY;
    }

    public void setINPUTCOMPANY(Short INPUTCOMPANY) {
        this.INPUTCOMPANY = INPUTCOMPANY;
    }

    @Override
    public String toString() {
        return "BiglogLogisticscontroltable{" +
                "ID=" + ID +
                ", WORKSHEETNO='" + WORKSHEETNO + '\'' +
                ", CTYPE=" + CTYPE +
                ", CORPORATION='" + CORPORATION + '\'' +
                ", WAYBILLID='" + WAYBILLID + '\'' +
                ", REMARKS='" + REMARKS + '\'' +
                ", INPUTPERSON=" + INPUTPERSON +
                ", INPUTDATE=" + INPUTDATE +
                ", INPUTCOMPANY=" + INPUTCOMPANY +
                '}';
    }
}