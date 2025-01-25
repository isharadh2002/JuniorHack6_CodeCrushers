package com.codecrushers.Print;

import java.util.Scanner;

public class UpdateStudent extends StudentMenu {



    public void addId(){
        System.out.println("Update Student.../n");
        System.out.println("Student Id(eg: abc001): ");
    }
    public void showInfo(String stuId,String stuName,int stuAge,String stuDept ){
        System.out.print("ID: "+stuId + ", ");
        System.out.print("Name: "+stuName+", ");
        System.out.print("Age: "+stuAge+", ");
        System.out.print("Department: "+stuDept);
        System.out.println("/n/n");
    }
    public void enterInfo(){
        System.out.println("Enter the Attribute to update [1 -name, 2 - age, 3 - department]: ");
        int input=0;
        //Todo:get the value by Scanner
        //Todo:after database creation complete this function

        switch (input){
            case 1: case 3: case 4://Todo:Have to get the String value
                break;
            case 2 :  //Todo:Have to get the int value
                break;
            default:
                System.out.println("The value you enter is not valid");

        }
    }
    public void successMsg(String stuId){


        System.out.println("Successfully update the record of the student Id: "+stuId);
    }






}
