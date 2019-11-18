package com.bos.model;

import java.util.Date;

public class LogLogisticstransfer {
    private Short ID;

    private String TRANSFERINT;

    private String STARTSTATION;

    private String ENDSTATION;

    private String DISPATCHER;

    private String DRIVER;

    private Short DELIVERYPERSON;

    private Date DELIVERYDATE;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getTRANSFERINT() {
        return TRANSFERINT;
    }

    public void setTRANSFERINT(String TRANSFERINT) {
        this.TRANSFERINT = TRANSFERINT == null ? null : TRANSFERINT.trim();
    }

    public String getSTARTSTATION() {
        return STARTSTATION;
    }

    public void setSTARTSTATION(String STARTSTATION) {
        this.STARTSTATION = STARTSTATION == null ? null : STARTSTATION.trim();
    }

    public String getENDSTATION() {
        return ENDSTATION;
    }

    public void setENDSTATION(String ENDSTATION) {
        this.ENDSTATION = ENDSTATION == null ? null : ENDSTATION.trim();
    }

    public String getDISPATCHER() {
        return DISPATCHER;
    }

    public void setDISPATCHER(String DISPATCHER) {
        this.DISPATCHER = DISPATCHER == null ? null : DISPATCHER.trim();
    }

    public String getDRIVER() {
        return DRIVER;
    }

    public void setDRIVER(String DRIVER) {
        this.DRIVER = DRIVER == null ? null : DRIVER.trim();
    }

    public Short getDELIVERYPERSON() {
        return DELIVERYPERSON;
    }

    public void setDELIVERYPERSON(Short DELIVERYPERSON) {
        this.DELIVERYPERSON = DELIVERYPERSON;
    }

    public Date getDELIVERYDATE() {
        return DELIVERYDATE;
    }

    public void setDELIVERYDATE(Date DELIVERYDATE) {
        this.DELIVERYDATE = DELIVERYDATE;
    }

    @Override
    public String toString() {
        return "LogLogisticstransfer{" +
                "ID=" + ID +
                ", TRANSFERINT='" + TRANSFERINT + '\'' +
                ", STARTSTATION='" + STARTSTATION + '\'' +
                ", ENDSTATION='" + ENDSTATION + '\'' +
                ", DISPATCHER='" + DISPATCHER + '\'' +
                ", DRIVER='" + DRIVER + '\'' +
                ", DELIVERYPERSON=" + DELIVERYPERSON +
                ", DELIVERYDATE=" + DELIVERYDATE +
                '}';
    }
}