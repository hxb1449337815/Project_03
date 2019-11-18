package com.bos.model;

public class SyRolesmenus {
    private Short ID;

    private Short ROLEID;

    private Short MENUID;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public Short getROLEID() {
        return ROLEID;
    }

    public void setROLEID(Short ROLEID) {
        this.ROLEID = ROLEID;
    }

    public Short getMENUID() {
        return MENUID;
    }

    public void setMENUID(Short MENUID) {
        this.MENUID = MENUID;
    }

    @Override
    public String toString() {
        return "SyRolesmenus{" +
                "ID=" + ID +
                ", ROLEID=" + ROLEID +
                ", MENUID=" + MENUID +
                '}';
    }
}