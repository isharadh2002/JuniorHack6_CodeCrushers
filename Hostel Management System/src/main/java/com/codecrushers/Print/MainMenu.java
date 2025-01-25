package com.codecrushers.Print;

import java.sql.Connection;
import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);
    Connection connection;

    public MainMenu(Connection connection) {
        this.connection = connection;
    }


    public  void printMenu(){

        System.out.println("-----------------Welcome to the Hostel Management System!----------------------- ");
        System.out.println("----ABC University----/n/n");
        System.out.println("Please enter the number of the action you want to proceed../n");
        System.out.println("[1] Manage Hostels");
        System.out.println("[2] Manage Students");
        System.out.println("[3] Manage Student Allocations");
        System.out.println("[0] Exits");

        int choice = scanner.nextInt();
        Menu menu;
        if(choice == 1){
            menu = new HostelMenu();
        }
        else if(choice == 2){
            menu = new StudentMenu();
        }
        else if(choice == 3){
            menu = new StudentAlloCationMenu();
        }
        else if(choice == 0){
            return;
        }
        else{
            return;
        }

        menu.printMenu();
    }
}
