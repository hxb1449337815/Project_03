package com.bos.model;

public class BasZonecustominfo {
    private Short CUSTOMCODE;

    private String CUSTOMNAME;

    private Short MOBILENO;

    private String CITYNAME;

    private String CSTOMADDRESS;

    private Short ZONEINFOID;

    public Short getCUSTOMCODE() {
        return CUSTOMCODE;
    }

    public void setCUSTOMCODE(Short CUSTOMCODE) {
        this.CUSTOMCODE = CUSTOMCODE;
    }

    public String getCUSTOMNAME() {
        return CUSTOMNAME;
    }

    public void setCUSTOMNAME(String CUSTOMNAME) {
        this.CUSTOMNAME = CUSTOMNAME == null ? null : CUSTOMNAME.trim();
    }

    public Short getMOBILENO() {
        return MOBILENO;
    }

    public void setMOBILENO(Short MOBILENO) {
        this.MOBILENO = MOBILENO;
    }

    public String getCITYNAME() {
        return CITYNAME;
    }

    public void setCITYNAME(String CITYNAME) {
        this.CITYNAME = CITYNAME == null ? null : CITYNAME.trim();
    }

    public String getCSTOMADDRESS() {
        return CSTOMADDRESS;
    }

    public void setCSTOMADDRESS(String CSTOMADDRESS) {
        this.CSTOMADDRESS = CSTOMADDRESS == null ? null : CSTOMADDRESS.trim();
    }

    public Short getZONEINFOID() {
        return ZONEINFOID;
    }

    public void setZONEINFOID(Short ZONEINFOID) {
        this.ZONEINFOID = ZONEINFOID;
    }

    @Override
    public String toString() {
        return "BasZonecustominfo{" +
                "CUSTOMCODE=" + CUSTOMCODE +
                ", CUSTOMNAME='" + CUSTOMNAME + '\'' +
                ", MOBILENO=" + MOBILENO +
                ", CITYNAME='" + CITYNAME + '\'' +
                ", CSTOMADDRESS='" + CSTOMADDRESS + '\'' +
                ", ZONEINFOID=" + ZONEINFOID +
                '}';
    }
}