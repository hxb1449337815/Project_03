package com.bos.model;

import java.util.Date;

public class AccWorkorder {
    private Short ID;

    private String BUSINESSNOTICENO;

    private String JOBNO;

    private Short JOBTYPE;

    private Short PICKUPSTATUS;

    private Short SHORTMESSAGEINT;

    private Date WORKGENERATIONTIME;

    private Short AFTERSINGLENUM;

    private Short SMALLMEMBERNUM;

    private Short PICKUPUNIT;

    private Date PICKUPTIME;

    private String SORTINGCODE;

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

    public String getJOBNO() {
        return JOBNO;
    }

    public void setJOBNO(String JOBNO) {
        this.JOBNO = JOBNO == null ? null : JOBNO.trim();
    }

    public Short getJOBTYPE() {
        return JOBTYPE;
    }

    public void setJOBTYPE(Short JOBTYPE) {
        this.JOBTYPE = JOBTYPE;
    }

    public Short getPICKUPSTATUS() {
        return PICKUPSTATUS;
    }

    public void setPICKUPSTATUS(Short PICKUPSTATUS) {
        this.PICKUPSTATUS = PICKUPSTATUS;
    }

    public Short getSHORTMESSAGEINT() {
        return SHORTMESSAGEINT;
    }

    public void setSHORTMESSAGEINT(Short SHORTMESSAGEINT) {
        this.SHORTMESSAGEINT = SHORTMESSAGEINT;
    }

    public Date getWORKGENERATIONTIME() {
        return WORKGENERATIONTIME;
    }

    public void setWORKGENERATIONTIME(Date WORKGENERATIONTIME) {
        this.WORKGENERATIONTIME = WORKGENERATIONTIME;
    }

    public Short getAFTERSINGLENUM() {
        return AFTERSINGLENUM;
    }

    public void setAFTERSINGLENUM(Short AFTERSINGLENUM) {
        this.AFTERSINGLENUM = AFTERSINGLENUM;
    }

    public Short getSMALLMEMBERNUM() {
        return SMALLMEMBERNUM;
    }

    public void setSMALLMEMBERNUM(Short SMALLMEMBERNUM) {
        this.SMALLMEMBERNUM = SMALLMEMBERNUM;
    }

    public Short getPICKUPUNIT() {
        return PICKUPUNIT;
    }

    public void setPICKUPUNIT(Short PICKUPUNIT) {
        this.PICKUPUNIT = PICKUPUNIT;
    }

    public Date getPICKUPTIME() {
        return PICKUPTIME;
    }

    public void setPICKUPTIME(Date PICKUPTIME) {
        this.PICKUPTIME = PICKUPTIME;
    }

    public String getSORTINGCODE() {
        return SORTINGCODE;
    }

    public void setSORTINGCODE(String SORTINGCODE) {
        this.SORTINGCODE = SORTINGCODE == null ? null : SORTINGCODE.trim();
    }

    @Override
    public String toString() {
        return "AccWorkorder{" +
                "ID=" + ID +
                ", BUSINESSNOTICENO='" + BUSINESSNOTICENO + '\'' +
                ", JOBNO='" + JOBNO + '\'' +
                ", JOBTYPE=" + JOBTYPE +
                ", PICKUPSTATUS=" + PICKUPSTATUS +
                ", SHORTMESSAGEINT=" + SHORTMESSAGEINT +
                ", WORKGENERATIONTIME=" + WORKGENERATIONTIME +
                ", AFTERSINGLENUM=" + AFTERSINGLENUM +
                ", SMALLMEMBERNUM=" + SMALLMEMBERNUM +
                ", PICKUPUNIT=" + PICKUPUNIT +
                ", PICKUPTIME=" + PICKUPTIME +
                ", SORTINGCODE='" + SORTINGCODE + '\'' +
                '}';
    }
}