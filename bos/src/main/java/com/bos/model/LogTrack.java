package com.bos.model;

import java.util.Date;

public class LogTrack {
    private Short ID;

    private String LINETYPE;

    private String LINENAME;

    private String LOGISTICSCAR;

    private Short LINESTATE;

    private String NODENAME;

    private Date STARTTIME;

    private Date ARRIVALTIME;

    private String CARINT;

    private String NEXTNODELOAD;

    private String DESCRIBE;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getLINETYPE() {
        return LINETYPE;
    }

    public void setLINETYPE(String LINETYPE) {
        this.LINETYPE = LINETYPE == null ? null : LINETYPE.trim();
    }

    public String getLINENAME() {
        return LINENAME;
    }

    public void setLINENAME(String LINENAME) {
        this.LINENAME = LINENAME == null ? null : LINENAME.trim();
    }

    public String getLOGISTICSCAR() {
        return LOGISTICSCAR;
    }

    public void setLOGISTICSCAR(String LOGISTICSCAR) {
        this.LOGISTICSCAR = LOGISTICSCAR == null ? null : LOGISTICSCAR.trim();
    }

    public Short getLINESTATE() {
        return LINESTATE;
    }

    public void setLINESTATE(Short LINESTATE) {
        this.LINESTATE = LINESTATE;
    }

    public String getNODENAME() {
        return NODENAME;
    }

    public void setNODENAME(String NODENAME) {
        this.NODENAME = NODENAME == null ? null : NODENAME.trim();
    }

    public Date getSTARTTIME() {
        return STARTTIME;
    }

    public void setSTARTTIME(Date STARTTIME) {
        this.STARTTIME = STARTTIME;
    }

    public Date getARRIVALTIME() {
        return ARRIVALTIME;
    }

    public void setARRIVALTIME(Date ARRIVALTIME) {
        this.ARRIVALTIME = ARRIVALTIME;
    }

    public String getCARINT() {
        return CARINT;
    }

    public void setCARINT(String CARINT) {
        this.CARINT = CARINT == null ? null : CARINT.trim();
    }

    public String getNEXTNODELOAD() {
        return NEXTNODELOAD;
    }

    public void setNEXTNODELOAD(String NEXTNODELOAD) {
        this.NEXTNODELOAD = NEXTNODELOAD == null ? null : NEXTNODELOAD.trim();
    }

    public String getDESCRIBE() {
        return DESCRIBE;
    }

    public void setDESCRIBE(String DESCRIBE) {
        this.DESCRIBE = DESCRIBE == null ? null : DESCRIBE.trim();
    }

    @Override
    public String toString() {
        return "LogTrack{" +
                "ID=" + ID +
                ", LINETYPE='" + LINETYPE + '\'' +
                ", LINENAME='" + LINENAME + '\'' +
                ", LOGISTICSCAR='" + LOGISTICSCAR + '\'' +
                ", LINESTATE=" + LINESTATE +
                ", NODENAME='" + NODENAME + '\'' +
                ", STARTTIME=" + STARTTIME +
                ", ARRIVALTIME=" + ARRIVALTIME +
                ", CARINT='" + CARINT + '\'' +
                ", NEXTNODELOAD='" + NEXTNODELOAD + '\'' +
                ", DESCRIBE='" + DESCRIBE + '\'' +
                '}';
    }
}