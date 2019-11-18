package com.bos.model;

public class BasSubstitute {
    private Short ID;

    private String EMPNO;

    private String EMPNAME;

    private Short MOBILENO;

    private Short TYPE;

    private Short PDA;

    private Short STANDARDKG;

    private Short STANDARDLENGTH;

    private String MODELS;

    private String PLATEINT;

    private Short INVALIDATEMARK;

    private Short SUBORDINATEUNIT;

    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(String EMPNO) {
        this.EMPNO = EMPNO == null ? null : EMPNO.trim();
    }

    public String getEMPNAME() {
        return EMPNAME;
    }

    public void setEMPNAME(String EMPNAME) {
        this.EMPNAME = EMPNAME == null ? null : EMPNAME.trim();
    }

    public Short getMOBILENO() {
        return MOBILENO;
    }

    public void setMOBILENO(Short MOBILENO) {
        this.MOBILENO = MOBILENO;
    }

    public Short getTYPE() {
        return TYPE;
    }

    public void setTYPE(Short TYPE) {
        this.TYPE = TYPE;
    }

    public Short getPDA() {
        return PDA;
    }

    public void setPDA(Short PDA) {
        this.PDA = PDA;
    }

    public Short getSTANDARDKG() {
        return STANDARDKG;
    }

    public void setSTANDARDKG(Short STANDARDKG) {
        this.STANDARDKG = STANDARDKG;
    }

    public Short getSTANDARDLENGTH() {
        return STANDARDLENGTH;
    }

    public void setSTANDARDLENGTH(Short STANDARDLENGTH) {
        this.STANDARDLENGTH = STANDARDLENGTH;
    }

    public String getMODELS() {
        return MODELS;
    }

    public void setMODELS(String MODELS) {
        this.MODELS = MODELS == null ? null : MODELS.trim();
    }

    public String getPLATEINT() {
        return PLATEINT;
    }

    public void setPLATEINT(String PLATEINT) {
        this.PLATEINT = PLATEINT == null ? null : PLATEINT.trim();
    }

    public Short getINVALIDATEMARK() {
        return INVALIDATEMARK;
    }

    public void setINVALIDATEMARK(Short INVALIDATEMARK) {
        this.INVALIDATEMARK = INVALIDATEMARK;
    }

    public Short getSUBORDINATEUNIT() {
        return SUBORDINATEUNIT;
    }

    public void setSUBORDINATEUNIT(Short SUBORDINATEUNIT) {
        this.SUBORDINATEUNIT = SUBORDINATEUNIT;
    }

    @Override
    public String toString() {
        return "BasSubstitute{" +
                "ID=" + ID +
                ", EMPNO='" + EMPNO + '\'' +
                ", EMPNAME='" + EMPNAME + '\'' +
                ", MOBILENO=" + MOBILENO +
                ", TYPE=" + TYPE +
                ", PDA=" + PDA +
                ", STANDARDKG=" + STANDARDKG +
                ", STANDARDLENGTH=" + STANDARDLENGTH +
                ", MODELS='" + MODELS + '\'' +
                ", PLATEINT='" + PLATEINT + '\'' +
                ", INVALIDATEMARK=" + INVALIDATEMARK +
                ", SUBORDINATEUNIT=" + SUBORDINATEUNIT +
                '}';
    }
}