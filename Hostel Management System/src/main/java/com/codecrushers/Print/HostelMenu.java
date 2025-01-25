package com.codecrushers.Print;

import com.codecrushers.CrudOPR.HostelOPR;
import com.codecrushers.sqlConnector.DatabaseIntegration;

import java.sql.Connection;
import java.util.Scanner;

public class HostelMenu implements Menu {
    Scanner scanner = new Scanner(System.in);

    public void printMenu(){


        System.out.println("Hostel Management...../n/n");
        System.out.println("[1] Add a Hostel");
        System.out.println("[2] Update Hostel Information");
        System.out.println("[3] View Hostel Details");
        System.out.println("[4] Rooms Management");
        System.out.println("[0] Main menu");

        int choice = scanner.nextInt();
        HostelOPR hostelOPR = new HostelOPR();

        if(choice == 1){
            hostelOPR.addHostel(DatabaseIntegration.getConnection());
        }
        else if(choice == 2){
            hostelOPR.updateHostelInformation(DatabaseIntegration.getConnection());
        }
        else if(choice == 3){
            hostelOPR.viewHostelDetails(DatabaseIntegration.getConnection());
        }
        else if(choice == 4){
            RoomMenu roomMenu = new RoomMenu();
            roomMenu.printMenu();
        }


    }
}
