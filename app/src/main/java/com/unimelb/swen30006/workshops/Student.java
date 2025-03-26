package com.unimelb.swen30006.workshops;

public class Student extends Person {
    private String email;
    private String studentID;

    public Student(String email, String studentID) {
        this.email = email;
        this.studentID = studentID;
    }
    public void sendEmailMsg(String email) {
        this.email = email;
    }
    public float totalGrade() {
        return 0;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
