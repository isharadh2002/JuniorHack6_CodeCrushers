package com.codecrushers.DTO;

public class Allocations {

    private int allocation_id;
    private String room_id;
    private int hostel_id;
    private int student_id;

    public Allocations(int allocation_id, String room_id, int hostel_id, int student_id) {
        this.allocation_id = allocation_id;
        this.room_id = room_id;
        this.hostel_id = hostel_id;
        this.student_id = student_id;
    }

    public int getId() {
        return allocation_id;
    }

    public String getRoomNo() {
        return room_id;
    }

    public int getHostelId() {
        return hostel_id;
    }

    public int getStudent_id() {
        return student_id;
    }
}
