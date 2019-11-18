package com.bos.model;

public class SyMenus {
    private Short ID;

    private String PARENTID;

    private String TYPE;

    private String TEXT;

    private String URL;

    private String TIP;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getPARENTID() {
        return PARENTID;
    }

    public void setPARENTID(String PARENTID) {
        this.PARENTID = PARENTID == null ? null : PARENTID.trim();
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE == null ? null : TYPE.trim();
    }

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT == null ? null : TEXT.trim();
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL == null ? null : URL.trim();
    }

    public String getTIP() {
        return TIP;
    }

    public void setTIP(String TIP) {
        this.TIP = TIP == null ? null : TIP.trim();
    }

    @Override
    public String toString() {
        return "SyMenus{" +
                "ID=" + ID +
                ", PARENTID='" + PARENTID + '\'' +
                ", TYPE='" + TYPE + '\'' +
                ", TEXT='" + TEXT + '\'' +
                ", URL='" + URL + '\'' +
                ", TIP='" + TIP + '\'' +
                '}';
    }
}