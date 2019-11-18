package com.xb.model;

public class Users {

    private Integer uid;
    private String name;
    private String password;
    private String fullName;
    private String cardNo;
    private String mobileNo;


    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Users() {
    }

    public Users(String name, String password, String fullName, String cardNo, String mobileNo) {
        this.name = name;
        this.password = password;
        this.fullName = fullName;
        this.cardNo = cardNo;
        this.mobileNo = mobileNo;
    }
}
