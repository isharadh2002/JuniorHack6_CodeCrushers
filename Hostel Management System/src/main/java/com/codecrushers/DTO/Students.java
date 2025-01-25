package com.codecrushers.DTO;

public class Students {

    private String studentId;
    private String studentName;
    private int studentAge;
    private String studentDept;

    public Students(String studentId, String studentName, int studentAge, String studentDept) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentDept = studentDept;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentDept() {
        return studentDept;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentDept(String studentDept) {
        this.studentDept = studentDept;
    }

    public String toString() {
        return "ID: " + studentId + ", Name: " + studentName + ", Age: " + studentAge + ", Department: " + studentDept;
    }






}
