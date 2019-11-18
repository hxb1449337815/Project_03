package com.xb.model;

public class Departments {

    private Integer did;
    private String dname;

    @Override
    public String toString() {
        return "Departments{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Departments() {
    }

    public Departments(String dname) {
        this.dname = dname;
    }
}
