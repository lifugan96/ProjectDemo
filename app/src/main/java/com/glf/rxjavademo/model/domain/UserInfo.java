package com.glf.rxjavademo.model.domain;

public class UserInfo {


    @Override
    public String toString() {
        return "UserInfo{" +
                "ID=" + ID +
                ", DEPARTID=" + DEPARTID +
                ", ROLEID=" + ROLEID +
                ", USERNAME='" + USERNAME + '\'' +
                ", LOGINID='" + LOGINID + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", DELFLAG=" + DELFLAG +
                ", REMARK='" + REMARK + '\'' +
                ", MOBILE='" + MOBILE + '\'' +
                ", TEL='" + TEL + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", EDITTIME='" + EDITTIME + '\'' +
                ", DEPART='" + DEPART + '\'' +
                ", ROLE='" + ROLE + '\'' +
                ", ROLELEVELID=" + ROLELEVELID +
                ", ROLELEVEL='" + ROLELEVEL + '\'' +
                ", JOBNO='" + JOBNO + '\'' +
                ", PARENTID=" + PARENTID +
                ", POSITIONID=" + POSITIONID +
                ", POSITION=" + POSITION +
                ", DisaORend='" + DisaORend + '\'' +
                ", ADLoginID=" + ADLoginID +
                ", SORT=" + SORT +
                ", Professional='" + Professional + '\'' +
                ", ProfessionalID='" + ProfessionalID + '\'' +
                ", WDXXName='" + WDXXName + '\'' +
                ", TZXMGL='" + TZXMGL + '\'' +
                '}';
    }

    /**
     * ID : 2
     * DEPARTID : 1
     * ROLEID : 1
     * USERNAME : 系统管理员
     * LOGINID : admin
     * PASSWORD : sjxt123
     * DELFLAG : false
     * REMARK :
     * MOBILE :
     * TEL :
     * EMAIL :
     * EDITTIME : 2014-06-16T17:08:10
     * DEPART : 仙桃市
     * ROLE : 系统管理员
     * ROLELEVELID : 10
     * ROLELEVEL : 系统管理
     * JOBNO : 1001
     * PARENTID : 0
     * POSITIONID : 0
     * POSITION : null
     * DisaORend : 启用
     * ADLoginID : null
     * SORT : null
     * Professional : 农业,工业,建筑业,批发与零售业,重点服务业,住宿与餐饮业,房地产,
     * ProfessionalID : A,B,C,E,F,S,X,
     * WDXXName : admin
     * TZXMGL : 1
     */

    private int ID;
    private int DEPARTID;
    private int ROLEID;
    private String USERNAME;
    private String LOGINID;
    private String PASSWORD;
    private boolean DELFLAG;
    private String REMARK;
    private String MOBILE;
    private String TEL;
    private String EMAIL;
    private String EDITTIME;
    private String DEPART;
    private String ROLE;
    private int ROLELEVELID;
    private String ROLELEVEL;
    private String JOBNO;
    private int PARENTID;
    private int POSITIONID;
    private Object POSITION;
    private String DisaORend;
    private Object ADLoginID;
    private Object SORT;
    private String Professional;
    private String ProfessionalID;
    private String WDXXName;
    private String TZXMGL;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDEPARTID() {
        return DEPARTID;
    }

    public void setDEPARTID(int DEPARTID) {
        this.DEPARTID = DEPARTID;
    }

    public int getROLEID() {
        return ROLEID;
    }

    public void setROLEID(int ROLEID) {
        this.ROLEID = ROLEID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getLOGINID() {
        return LOGINID;
    }

    public void setLOGINID(String LOGINID) {
        this.LOGINID = LOGINID;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public boolean isDELFLAG() {
        return DELFLAG;
    }

    public void setDELFLAG(boolean DELFLAG) {
        this.DELFLAG = DELFLAG;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getEDITTIME() {
        return EDITTIME;
    }

    public void setEDITTIME(String EDITTIME) {
        this.EDITTIME = EDITTIME;
    }

    public String getDEPART() {
        return DEPART;
    }

    public void setDEPART(String DEPART) {
        this.DEPART = DEPART;
    }

    public String getROLE() {
        return ROLE;
    }

    public void setROLE(String ROLE) {
        this.ROLE = ROLE;
    }

    public int getROLELEVELID() {
        return ROLELEVELID;
    }

    public void setROLELEVELID(int ROLELEVELID) {
        this.ROLELEVELID = ROLELEVELID;
    }

    public String getROLELEVEL() {
        return ROLELEVEL;
    }

    public void setROLELEVEL(String ROLELEVEL) {
        this.ROLELEVEL = ROLELEVEL;
    }

    public String getJOBNO() {
        return JOBNO;
    }

    public void setJOBNO(String JOBNO) {
        this.JOBNO = JOBNO;
    }

    public int getPARENTID() {
        return PARENTID;
    }

    public void setPARENTID(int PARENTID) {
        this.PARENTID = PARENTID;
    }

    public int getPOSITIONID() {
        return POSITIONID;
    }

    public void setPOSITIONID(int POSITIONID) {
        this.POSITIONID = POSITIONID;
    }

    public Object getPOSITION() {
        return POSITION;
    }

    public void setPOSITION(Object POSITION) {
        this.POSITION = POSITION;
    }

    public String getDisaORend() {
        return DisaORend;
    }

    public void setDisaORend(String DisaORend) {
        this.DisaORend = DisaORend;
    }

    public Object getADLoginID() {
        return ADLoginID;
    }

    public void setADLoginID(Object ADLoginID) {
        this.ADLoginID = ADLoginID;
    }

    public Object getSORT() {
        return SORT;
    }

    public void setSORT(Object SORT) {
        this.SORT = SORT;
    }

    public String getProfessional() {
        return Professional;
    }

    public void setProfessional(String Professional) {
        this.Professional = Professional;
    }

    public String getProfessionalID() {
        return ProfessionalID;
    }

    public void setProfessionalID(String ProfessionalID) {
        this.ProfessionalID = ProfessionalID;
    }

    public String getWDXXName() {
        return WDXXName;
    }

    public void setWDXXName(String WDXXName) {
        this.WDXXName = WDXXName;
    }

    public String getTZXMGL() {
        return TZXMGL;
    }

    public void setTZXMGL(String TZXMGL) {
        this.TZXMGL = TZXMGL;
    }
}
