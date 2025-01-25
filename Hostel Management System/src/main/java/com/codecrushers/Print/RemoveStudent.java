package com.codecrushers.Print;

public class RemoveStudent extends StudentMenu {

    public void addId(){
        System.out.println("Remove a student.../n/n");
        System.out.println("Student Id:(eg: abc001)");

    }
    public void confirmationMsg(String stuId){
        System.out.println("Do you want to remove student "+stuId+"(y/n)?");

    }
    public void successMsg(String stuId){
        System.out.println("Successfully deleted the record of the student Id: "+stuId);
    }
}
