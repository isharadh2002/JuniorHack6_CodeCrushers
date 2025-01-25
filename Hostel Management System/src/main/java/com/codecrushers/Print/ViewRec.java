package com.codecrushers.Print;

public class ViewRec {
    public void addId(){
        System.out.println("View Student Details.../n");
        System.out.println("Enter the Student Id: ");
    }
    public void showInfo(String stuId,String stuName,int stuAge,String stuDept ){
        System.out.print("ID: "+stuId + ", ");
        System.out.print("Name: "+stuName+", ");
        System.out.print("Age: "+stuAge+", ");
        System.out.print("Department: "+stuDept);
        System.out.println("/n/n");
    }
}
