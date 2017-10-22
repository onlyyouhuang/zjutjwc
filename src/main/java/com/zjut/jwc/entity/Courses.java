package com.zjut.jwc.entity;

public class Courses {
    private int cno;
    private String cname;
    private float credits;
    private int chours;

    public Courses() {
    }

    public Courses(int cno, String cname, float credits, int chours) {
        this.cno = cno;
        this.cname = cname;
        this.credits = credits;
        this.chours = chours;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public float getCredits() {
        return credits;
    }

    public void setCredits(float credits) {
        this.credits = credits;
    }

    public int getChours() {
        return chours;
    }

    public void setChours(int chours) {
        this.chours = chours;
    }
}
