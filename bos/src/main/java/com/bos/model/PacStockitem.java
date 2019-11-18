package com.bos.model;

public class PacStockitem {
    private Short ID;

    private String WAREHOUSENO;

    private String GOODSCODE;

    private String GOODSNAME;

    private Short STORAGENUM;

    private Short ACTUALNUM;

    private Short PLANNEDPRICE;

    private String SPECIFICATIONS;

    private Short TYPE;

    private Short STATUS;

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

    public String getGOODSCODE() {
        return GOODSCODE;
    }

    public void setGOODSCODE(String GOODSCODE) {
        this.GOODSCODE = GOODSCODE == null ? null : GOODSCODE.trim();
    }

    public String getGOODSNAME() {
        return GOODSNAME;
    }

    public void setGOODSNAME(String GOODSNAME) {
        this.GOODSNAME = GOODSNAME == null ? null : GOODSNAME.trim();
    }

    public Short getSTORAGENUM() {
        return STORAGENUM;
    }

    public void setSTORAGENUM(Short STORAGENUM) {
        this.STORAGENUM = STORAGENUM;
    }

    public Short getACTUALNUM() {
        return ACTUALNUM;
    }

    public void setACTUALNUM(Short ACTUALNUM) {
        this.ACTUALNUM = ACTUALNUM;
    }

    public Short getPLANNEDPRICE() {
        return PLANNEDPRICE;
    }

    public void setPLANNEDPRICE(Short PLANNEDPRICE) {
        this.PLANNEDPRICE = PLANNEDPRICE;
    }

    public String getSPECIFICATIONS() {
        return SPECIFICATIONS;
    }

    public void setSPECIFICATIONS(String SPECIFICATIONS) {
        this.SPECIFICATIONS = SPECIFICATIONS == null ? null : SPECIFICATIONS.trim();
    }

    public Short getTYPE() {
        return TYPE;
    }

    public void setTYPE(Short TYPE) {
        this.TYPE = TYPE;
    }

    public Short getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Short STATUS) {
        this.STATUS = STATUS;
    }

    @Override
    public String toString() {
        return "PacStockitem{" +
                "ID=" + ID +
                ", WAREHOUSENO='" + WAREHOUSENO + '\'' +
                ", GOODSCODE='" + GOODSCODE + '\'' +
                ", GOODSNAME='" + GOODSNAME + '\'' +
                ", STORAGENUM=" + STORAGENUM +
                ", ACTUALNUM=" + ACTUALNUM +
                ", PLANNEDPRICE=" + PLANNEDPRICE +
                ", SPECIFICATIONS='" + SPECIFICATIONS + '\'' +
                ", TYPE=" + TYPE +
                ", STATUS=" + STATUS +
                '}';
    }
}