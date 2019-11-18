package com.xb.model;

public class Users {

    private Integer usersid;
    private String usersName;
    private String usersPwd;

    @Override
    public String toString() {
        return "Users{" +
                "usersid=" + usersid +
                ", usersName='" + usersName + '\'' +
                ", usersPwd='" + usersPwd + '\'' +
                '}';
    }

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public String getUsersPwd() {
        return usersPwd;
    }

    public void setUsersPwd(String usersPwd) {
        this.usersPwd = usersPwd;
    }

    public Users() {
    }

    public Users(String usersName, String usersPwd) {
        this.usersName = usersName;
        this.usersPwd = usersPwd;
    }
}
