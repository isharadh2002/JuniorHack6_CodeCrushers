package com.codecrushers.DTO;

public class Hostels {

    private int hostel_id;
    private String hostel_name;
    private int number_of_rooms;

    public Hostels(int hostelId, String hostelName, String hostelAddress) {
        this.hostel_id = hostel_id;
        this.hostel_name = hostel_name;
        this.number_of_rooms = number_of_rooms;
    }

    public int getHostelId() {
        return hostel_id;
    }

    public void setHostelId(int hostelId) {
        this.hostel_id = hostel_id;
    }

    public String getHostelName() {
        return hostel_name;
    }

    public void setHostelName(String hostelName) {
        this.hostel_name = hostel_name;
    }

    public int getNumber_of_rooms() {
        return number_of_rooms;
    }

    public void setHostelAddress(String hostelAddress){
        this.number_of_rooms = number_of_rooms;
    }



}
