package com.codecrushers.DTO;

public class Students {

    private String student_id;
    private String name;
    private int age;
    private String department;

    public Students(String studentId, String studentName, int studentAge, String studentDept) {
        this.student_id = student_id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getStudentId() {
        return student_id;
    }

    public String getStudentName() {
        return name;
    }

    public int getStudentAge() {
        return age;
    }

    public String getStudentDept() {
        return department;
    }

    public void setStudentId(String studentId) {
        this.student_id = student_id;
    }

    public void setStudentName(String studentName) {
        this.name = name;
    }

    public void setStudentAge(int studentAge) {
        this.age = age;
    }

    public void setStudentDept(String studentDept) {
        this.department = department;
    }

    public String toString() {
        return "ID: " + student_id + ", Name: " + name + ", Age: " + age + ", Department: " + department;
    }






}
