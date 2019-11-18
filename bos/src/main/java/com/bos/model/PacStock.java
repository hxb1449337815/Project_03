package com.bos.model;

import java.util.Date;

public class PacStock {
    private Short ID;

    private String WAREHOUSENO;

    private Short RESERVOIRTYPE;

    private String TRANSPORT;

    private String SUBORDINATEUNIT;

    private Short DRAWERNO;

    private String DRAWERNAME;

    private Date DRAWERTIME;

    private String REMARK;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getWAREHOUSENO() {
        return WAREHOUSENO;
    }

    public void setWAREHOUSENO(String WAREHOUSENO) {
        this.WAREHOUSENO = WAREHOUSENO == null ? null : WAREHOUSENO.trim();
    }

    public Short getRESERVOIRTYPE() {
        return RESERVOIRTYPE;
    }

    public void setRESERVOIRTYPE(Short RESERVOIRTYPE) {
        this.RESERVOIRTYPE = RESERVOIRTYPE;
    }

    public String getTRANSPORT() {
        return TRANSPORT;
    }

    public void setTRANSPORT(String TRANSPORT) {
        this.TRANSPORT = TRANSPORT == null ? null : TRANSPORT.trim();
    }

    public String getSUBORDINATEUNIT() {
        return SUBORDINATEUNIT;
    }

    public void setSUBORDINATEUNIT(String SUBORDINATEUNIT) {
        this.SUBORDINATEUNIT = SUBORDINATEUNIT == null ? null : SUBORDINATEUNIT.trim();
    }

    public Short getDRAWERNO() {
        return DRAWERNO;
    }

    public void setDRAWERNO(Short DRAWERNO) {
        this.DRAWERNO = DRAWERNO;
    }

    public String getDRAWERNAME() {
        return DRAWERNAME;
    }

    public void setDRAWERNAME(String DRAWERNAME) {
        this.DRAWERNAME = DRAWERNAME == null ? null : DRAWERNAME.trim();
    }

    public Date getDRAWERTIME() {
        return DRAWERTIME;
    }

    public void setDRAWERTIME(Date DRAWERTIME) {
        this.DRAWERTIME = DRAWERTIME;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK == null ? null : REMARK.trim();
    }

    @Override
    public String toString() {
        return "PacStock{" +
                "ID=" + ID +
                ", WAREHOUSENO='" + WAREHOUSENO + '\'' +
                ", RESERVOIRTYPE=" + RESERVOIRTYPE +
                ", TRANSPORT='" + TRANSPORT + '\'' +
                ", SUBORDINATEUNIT='" + SUBORDINATEUNIT + '\'' +
                ", DRAWERNO=" + DRAWERNO +
                ", DRAWERNAME='" + DRAWERNAME + '\'' +
                ", DRAWERTIME=" + DRAWERTIME +
                ", REMARK='" + REMARK + '\'' +
                '}';
    }
}