package com.xb.model;

import java.util.List;

public class Role {

    private Integer rid;
    private String rname;
    private List<Menu> menu;

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                '}';
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Role() {
    }

    public Role(Integer rid, String rname) {
        this.rid = rid;
        this.rname = rname;
    }
}
