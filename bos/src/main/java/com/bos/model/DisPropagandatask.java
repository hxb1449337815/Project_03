package com.bos.model;

import java.util.Date;

public class DisPropagandatask {
    private Short ID;

    private String OUTLINE;

    private Date RELEASETIME;

    private Date FAILURETIME;

    private Short STATUS;

    private String CONTENT;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getOUTLINE() {
        return OUTLINE;
    }

    public void setOUTLINE(String OUTLINE) {
        this.OUTLINE = OUTLINE == null ? null : OUTLINE.trim();
    }

    public Date getRELEASETIME() {
        return RELEASETIME;
    }

    public void setRELEASETIME(Date RELEASETIME) {
        this.RELEASETIME = RELEASETIME;
    }

    public Date getFAILURETIME() {
        return FAILURETIME;
    }

    public void setFAILURETIME(Date FAILURETIME) {
        this.FAILURETIME = FAILURETIME;
    }

    public Short getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Short STATUS) {
        this.STATUS = STATUS;
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT == null ? null : CONTENT.trim();
    }

    @Override
    public String toString() {
        return "DisPropagandatask{" +
                "ID=" + ID +
                ", OUTLINE='" + OUTLINE + '\'' +
                ", RELEASETIME=" + RELEASETIME +
                ", FAILURETIME=" + FAILURETIME +
                ", STATUS=" + STATUS +
                ", CONTENT='" + CONTENT + '\'' +
                '}';
    }
}