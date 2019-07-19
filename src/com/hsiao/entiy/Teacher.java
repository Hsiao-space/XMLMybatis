package com.hsiao.entiy;

import java.util.List;

public class Teacher {
    private Long tid;
    private String tname;
    private String subject;

    private List<Student> students;

    public Teacher() {

    }

    public Teacher(Long tid, String tname, String subject, List<Student> students) {
        System.out.println("构造函数封装数据-------");
        this.tid = tid;
        this.tname = tname;
        this.subject = subject;
        this.students = students;
    }

    public Teacher(Long tid, String tname, String subject) {
        this.tid = tid;
        this.tname = tname;
        this.subject = subject;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher [tid=" + tid + ", tname=" + tname + ", subject=" + subject + "]";
    }

}
