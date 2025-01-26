package com.codecrushers.Print;

import com.codecrushers.CrudOPR.StudentOPR;

import java.util.Scanner;

public class StudentMenu implements Menu {

    Scanner scanner = new Scanner(System.in);

    public void printMenu() {


        System.out.println("Students Management...../n/n");
        System.out.println("[1] Add a Student");
        System.out.println("[2] Remove Students");
        System.out.println("[3] Update Student");
        System.out.println("[4] View Student Details");
        System.out.println("[0] Main menu");

        int option = scanner.nextInt();
        StudentOPR studentOPR = new StudentOPR();

        if(option == 1) {
            String student_id;
            String name;
            int age;
            String department;

            System.out.println("Enter Student ID");
            student_id = scanner.next();
            System.out.println("Enter Name");
            name = scanner.next();
            System.out.println("Enter Age");
            age = scanner.nextInt();
            scanner.next();
            System.out.println("Enter Department");
            department = scanner.next();
            studentOPR.addStudent(student_id, name, age, department);
        }
        else if(option == 2) {
            String student_id;

            System.out.println("Enter Student ID");
            student_id = scanner.next();

            studentOPR.deleteStudent(student_id);
        }

        else if(option == 3) {
            String student_id;
            String name;
            int age;
            String department;

            System.out.println("Enter Student ID");
            student_id = scanner.next();
            System.out.println("Enter Name");
            name = scanner.next();
            System.out.println("Enter Age");
            age = scanner.nextInt();
            scanner.next();
            System.out.println("Enter Department");
            department = scanner.next();

            studentOPR.updateStudent(student_id, name, age, department);
        }

        else if(option == 4) {
            studentOPR.viewStudent();
        }
        else if(option == 0) {
            return;
        }
        else{
            return;
        }
    }


}
