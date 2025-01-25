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
            
        }
    }
}
