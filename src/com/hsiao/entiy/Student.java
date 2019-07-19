package com.hsiao.entiy;

import java.util.Date;

public class Student {
    private Long sid;
    private String sname;
    private Date sdate;
    private Long tid;

    private  Teacher tvo;

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Student(Long sid, String sname, Date sdate, Long tid, Teacher tvo) {
        super();
        this.sid = sid;
        this.sname = sname;
        this.sdate = sdate;
        this.tid = tid;
        this.tvo = tvo;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Teacher getTvo() {
        return tvo;
    }

    public void setTvo(Teacher tvo) {
        this.tvo = tvo;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", sdate=" + sdate + ", tid=" + tid + ", tvo=" + tvo + "]";
    }


}
