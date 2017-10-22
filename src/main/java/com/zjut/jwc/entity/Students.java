package com.zjut.jwc.entity;

public class Students {
    private String sno;
    private String sname;
    private String ssex;
    private String sbirthdate;
    private String mno;

    public Students() {
    }

    public Students(String sno, String sname, String ssex, String sbirthdate, String mno) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
        this.sbirthdate = sbirthdate;
        this.mno = mno;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSbirthdate() {
        return sbirthdate;
    }

    public void setSbirthdate(String sbirthdate) {
        this.sbirthdate = sbirthdate;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }
}
