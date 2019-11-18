package com.xb.model;

import java.util.List;

public class Menu {

    private Integer mid;
    private String mname;
    private List<Role> role;

    @Override
    public String toString() {
        return "Menu{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", role=" + role +
                '}';
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Menu() {
    }

    public Menu(Integer mid, String mname) {
        this.mid = mid;
        this.mname = mname;
    }
}
