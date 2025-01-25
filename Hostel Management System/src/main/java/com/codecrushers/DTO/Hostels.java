package com.codecrushers.DTO;

public class Hostels {

    private int hostelId;
    private String hostelName;
    private String hostelAddress;

    public Hostels(int hostelId, String hostelName, String hostelAddress) {
        this.hostelId = hostelId;
        this.hostelName = hostelName;
        this.hostelAddress = hostelAddress;
    }

    public int getHostelId() {
        return hostelId;
    }

    public void setHostelId(int hostelId) {
        this.hostelId = hostelId;
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public String getHostelAddress() {
        return hostelAddress;
    }

    public void setHostelAddress(String hostelAddress){
        this.hostelAddress = hostelAddress;
    }



}
