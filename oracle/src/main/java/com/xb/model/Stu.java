package com.xb.model;

import java.util.Date;

public class Stu {

    private Object sid;
    private Object sname;
    private Object sex;
    private Object birthday;

    @Override
    public String toString() {
        return "Stu{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Object getSid() {
        return sid;
    }

    public void setSid(Object sid) {
        this.sid = sid;
    }

    public Object getSname() {
        return sname;
    }

    public void setSname(Object sname) {
        this.sname = sname;
    }

    public Object getSex() {
        return sex;
    }

    public void setSex(Object sex) {
        this.sex = sex;
    }

    public Object getBirthday() {
        return birthday;
    }

    public void setBirthday(Object birthday) {
        this.birthday = birthday;
    }

    public Stu() {
    }

    public Stu(Object sid, Object sname, Object sex, Object birthday) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.birthday = birthday;
    }
}
