package com.xb.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private Integer id;
    private String name;
    private Integer pid;
    private String url;
    private String icon;


    private List<Menu> children=new ArrayList<Menu>();

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", url='" + url + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Menu() {
    }

    public Menu(String name, Integer pid, String url, String icon) {
        this.name = name;
        this.pid = pid;
        this.url = url;
        this.icon = icon;
    }
}
