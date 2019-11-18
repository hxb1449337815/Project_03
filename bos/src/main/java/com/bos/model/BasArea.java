package com.bos.model;

public class BasArea {
    private Short ID;

    private String PROVINCE;

    private String CITY;

    private String COUNTY;

    private Short POSTALCODE;

    private String SIMPLECODE;

    private Short CITYCODE;

    private String ENTRYUNITID;

    private String COMPLEMENTUNITID;

    private Short NATURE;

    private Short THEAREA;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getPROVINCE() {
        return PROVINCE;
    }

    public void setPROVINCE(String PROVINCE) {
        this.PROVINCE = PROVINCE == null ? null : PROVINCE.trim();
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY == null ? null : CITY.trim();
    }

    public String getCOUNTY() {
        return COUNTY;
    }

    public void setCOUNTY(String COUNTY) {
        this.COUNTY = COUNTY == null ? null : COUNTY.trim();
    }

    public Short getPOSTALCODE() {
        return POSTALCODE;
    }

    public void setPOSTALCODE(Short POSTALCODE) {
        this.POSTALCODE = POSTALCODE;
    }

    public String getSIMPLECODE() {
        return SIMPLECODE;
    }

    public void setSIMPLECODE(String SIMPLECODE) {
        this.SIMPLECODE = SIMPLECODE == null ? null : SIMPLECODE.trim();
    }

    public Short getCITYCODE() {
        return CITYCODE;
    }

    public void setCITYCODE(Short CITYCODE) {
        this.CITYCODE = CITYCODE;
    }

    public String getENTRYUNITID() {
        return ENTRYUNITID;
    }

    public void setENTRYUNITID(String ENTRYUNITID) {
        this.ENTRYUNITID = ENTRYUNITID == null ? null : ENTRYUNITID.trim();
    }

    public String getCOMPLEMENTUNITID() {
        return COMPLEMENTUNITID;
    }

    public void setCOMPLEMENTUNITID(String COMPLEMENTUNITID) {
        this.COMPLEMENTUNITID = COMPLEMENTUNITID == null ? null : COMPLEMENTUNITID.trim();
    }

    public Short getNATURE() {
        return NATURE;
    }

    public void setNATURE(Short NATURE) {
        this.NATURE = NATURE;
    }

    public Short getTHEAREA() {
        return THEAREA;
    }

    public void setTHEAREA(Short THEAREA) {
        this.THEAREA = THEAREA;
    }

    @Override
    public String toString() {
        return "BasArea{" +
                "ID=" + ID +
                ", PROVINCE='" + PROVINCE + '\'' +
                ", CITY='" + CITY + '\'' +
                ", COUNTY='" + COUNTY + '\'' +
                ", POSTALCODE=" + POSTALCODE +
                ", SIMPLECODE='" + SIMPLECODE + '\'' +
                ", CITYCODE=" + CITYCODE +
                ", ENTRYUNITID='" + ENTRYUNITID + '\'' +
                ", COMPLEMENTUNITID='" + COMPLEMENTUNITID + '\'' +
                ", NATURE=" + NATURE +
                ", THEAREA=" + THEAREA +
                '}';
    }
}