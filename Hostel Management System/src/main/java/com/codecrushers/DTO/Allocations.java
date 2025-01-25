package com.codecrushers.DTO;

public class Allocations {

    private int id;
    private String roomNo;
    private int hostelId;
    private int studentId;

    public Allocations(int id, String roomNo, int hostelId, int studentId) {
        this.id = id;
        this.roomNo = roomNo;
        this.hostelId = hostelId;
        this.studentId = studentId;
    }

    public int getId() {
        return id;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public int getHostelId() {
        return hostelId;
    }

    public int getStudentId() {
        return studentId;
    }
}
