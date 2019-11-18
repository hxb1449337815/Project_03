package com.bos.model;

import java.util.Date;

public class SorStorage {
    private Short ID;

    private Date ACCEPTDATE;

    private Short ACCEPTPERSON;

    private String ACCEPTCOMPANY;

    private Short DELIVERYPERSON;

    private String DELIVERYCOMPANY;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public Date getACCEPTDATE() {
        return ACCEPTDATE;
    }

    public void setACCEPTDATE(Date ACCEPTDATE) {
        this.ACCEPTDATE = ACCEPTDATE;
    }

    public Short getACCEPTPERSON() {
        return ACCEPTPERSON;
    }

    public void setACCEPTPERSON(Short ACCEPTPERSON) {
        this.ACCEPTPERSON = ACCEPTPERSON;
    }

    public String getACCEPTCOMPANY() {
        return ACCEPTCOMPANY;
    }

    public void setACCEPTCOMPANY(String ACCEPTCOMPANY) {
        this.ACCEPTCOMPANY = ACCEPTCOMPANY == null ? null : ACCEPTCOMPANY.trim();
    }

    public Short getDELIVERYPERSON() {
        return DELIVERYPERSON;
    }

    public void setDELIVERYPERSON(Short DELIVERYPERSON) {
        this.DELIVERYPERSON = DELIVERYPERSON;
    }

    public String getDELIVERYCOMPANY() {
        return DELIVERYCOMPANY;
    }

    public void setDELIVERYCOMPANY(String DELIVERYCOMPANY) {
        this.DELIVERYCOMPANY = DELIVERYCOMPANY == null ? null : DELIVERYCOMPANY.trim();
    }

    @Override
    public String toString() {
        return "SorStorage{" +
                "ID=" + ID +
                ", ACCEPTDATE=" + ACCEPTDATE +
                ", ACCEPTPERSON=" + ACCEPTPERSON +
                ", ACCEPTCOMPANY='" + ACCEPTCOMPANY + '\'' +
                ", DELIVERYPERSON=" + DELIVERYPERSON +
                ", DELIVERYCOMPANY='" + DELIVERYCOMPANY + '\'' +
                '}';
    }
}