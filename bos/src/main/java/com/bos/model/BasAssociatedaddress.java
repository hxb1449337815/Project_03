package com.bos.model;

public class BasAssociatedaddress {
    private Short ID;

    private String ZONECODE;

    private String CITY;

    private String CUSTOMADDRESS;

    private Short ASSOCIATEDPARTITIONS;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getZONECODE() {
        return ZONECODE;
    }

    public void setZONECODE(String ZONECODE) {
        this.ZONECODE = ZONECODE == null ? null : ZONECODE.trim();
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY == null ? null : CITY.trim();
    }

    public String getCUSTOMADDRESS() {
        return CUSTOMADDRESS;
    }

    public void setCUSTOMADDRESS(String CUSTOMADDRESS) {
        this.CUSTOMADDRESS = CUSTOMADDRESS == null ? null : CUSTOMADDRESS.trim();
    }

    public Short getASSOCIATEDPARTITIONS() {
        return ASSOCIATEDPARTITIONS;
    }

    public void setASSOCIATEDPARTITIONS(Short ASSOCIATEDPARTITIONS) {
        this.ASSOCIATEDPARTITIONS = ASSOCIATEDPARTITIONS;
    }

    @Override
    public String toString() {
        return "BasAssociatedaddress{" +
                "ID=" + ID +
                ", ZONECODE='" + ZONECODE + '\'' +
                ", CITY='" + CITY + '\'' +
                ", CUSTOMADDRESS='" + CUSTOMADDRESS + '\'' +
                ", ASSOCIATEDPARTITIONS=" + ASSOCIATEDPARTITIONS +
                '}';
    }
}