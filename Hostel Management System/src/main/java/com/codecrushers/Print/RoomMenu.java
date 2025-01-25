package com.codecrushers.Print;

import com.codecrushers.CrudOPR.RoomOPR;

import java.util.Scanner;

public class RoomMenu {
    Scanner scanner = new Scanner(System.in);

    public void printMenu(){
        System.out.println("Rooms Managements.../n/n ");
        System.out.println("[1] Add Rooms");
        System.out.println("[2] View Rooms");
        System.out.println("[3] Update Rooms");
        System.out.println("[4] Delete Rooms");
        System.out.println("[0] Back to Previous");

        int choice = scanner.nextInt();
        RoomOPR roomOPR = new RoomOPR();


        if(choice == 1){
            String room_id;
            String hostel_id;
            int room_number;
            int capacity;
            int available_capacity;

            System.out.println("Enter Room ID: ");
            room_id = scanner.next();
            System.out.println("Enter Hostel ID: ");
            hostel_id = scanner.next();
            System.out.println("Enter Room Number: ");
            room_number = scanner.nextInt();
            System.out.println("Enter Capacity: ");
            capacity = scanner.nextInt();
            System.out.println("Enter Available Capacity: ");
            available_capacity = scanner.nextInt();
            roomOPR.addRoom(room_id, hostel_id, room_number, capacity, available_capacity);
        }

        else if(choice == 2){
            roomOPR.viewRoom();
        }

        else if(choice == 3){
            String room_id;
            String hostel_id;
            int room_number;
            int capacity;
            int available_capacity;
            System.out.println("Enter Room ID: ");
            room_id = scanner.next();
            System.out.println("Enter Hostel ID: ");
            hostel_id = scanner.next();
            System.out.println("Enter Room Number: ");
            room_number = scanner.nextInt();
            System.out.println("Enter Capacity: ");
            capacity = scanner.nextInt();
            System.out.println("Enter Available Capacity: ");
            available_capacity = scanner.nextInt();

            roomOPR.updateRoom(room_id, hostel_id, room_number, capacity, available_capacity);
        }
    }
}
