package com.codecrushers.Print;

public class ViewRooms {
    public void addId(){
        System.out.println("View Rooms.../n");
        System.out.println("Hostel Id(eg: hos001): ");
    }
    public void showInfo(String hosId,String roomId,int roomNumber,int capacity,int availableCap ){
        System.out.print("Room ID: "+roomId + ", ");
        System.out.print("Hostel ID: "+hosId+", ");
        System.out.print("Room Number: "+roomNumber+", ");
        System.out.print("Capacity: "+capacity+", ");
        System.out.println("Available Capacity: "+availableCap);
        System.out.println("/n/n");
    }
}
