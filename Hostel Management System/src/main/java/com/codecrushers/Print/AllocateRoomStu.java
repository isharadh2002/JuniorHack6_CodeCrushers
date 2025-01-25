package com.codecrushers.Print;

import java.util.Scanner;

public class AllocateRoomStu  {
    public void addId(){
        System.out.println("Allocate a Room to a Student.../n");
        System.out.println("Student Id(eg: abc001): ");
    }
    public void allocateOPR(String stuId,String stuName,int stuAge,String stuDept ){
        System.out.print("ID: "+stuId + ", ");
        System.out.print("Name: "+stuName+", ");
        System.out.print("Age: "+stuAge+", ");
        System.out.print("Department: "+stuDept);
        System.out.println("/n/n");
        System.out.print("Hostel Id(eg: hos001): ");
        Scanner scanner=new Scanner(System.in);
        String hostalId=scanner.next();
        //todo:get the result of the query for above in put and put the result of those function to following valiables
        String roomId=null;
        int roomNum=0;
        int capacity=0;
        int availableCap=0;

        ViewRooms viewRooms=new ViewRooms();
        viewRooms.showInfo(hostalId,roomId ,roomNum,capacity,availableCap);

        System.out.println("Choose a room to allocate (room Id): ");
        String selectedRoomId=scanner.next();
        //Todo:execute the Query for getting result
        System.out.println("Successfully updated the record of the room, Id");


    }
}
