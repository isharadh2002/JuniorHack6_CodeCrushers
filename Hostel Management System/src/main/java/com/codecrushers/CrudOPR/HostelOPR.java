package com.codecrushers.CrudOPR;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HostelOPR {
    Scanner scanner = new Scanner(System.in);

    public void addHostel(Connection connection){
        System.out.println("Enter hostel ID: ");
        String hostelID = scanner.nextLine();
        System.out.println("Enter hostel name: ");
        String hostelName = scanner.nextLine();
        System.out.println("Enter number of rooms: ");
        int numberOfRooms = scanner.nextInt();

        String query = "INSERT INTO `hostels` (`hostel_id`, `hostel_name`, `number_of_rooms`) VALUES (?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, hostelID);
            preparedStatement.setString(2, hostelName);
            preparedStatement.setInt(3, numberOfRooms);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("Hostel " + hostelID + " added successfully");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void updateHostelInformation (Connection connection){
        System.out.println("Enter hostel ID: ");
        String hostelID = scanner.nextLine();

        String query = "SELECT * FROM `hostels` WHERE `hostel_id` = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, hostelID);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                if(resultSet.getString("hostel_id").equals(hostelID)) {
                    String updateQuery = "UPDATE `hostels` SET `hostel_name`=?,`number_of_rooms`=? WHERE `hostel_id`=?";
                    preparedStatement = connection.prepareStatement(updateQuery);
                    preparedStatement.setString(1, resultSet.getString("hostel_name"));
                    preparedStatement.setInt(2, resultSet.getInt("number_of_rooms"));
                    preparedStatement.setString(3, resultSet.getString("hostel_id"));
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    System.out.println("Hostel " + hostelID + " updated successfully");
                }
                else{
                    System.out.println("Hostel " + hostelID + " not found");
                }
            } else{
                System.out.println("Hostel " + hostelID + " not found");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void viewHostelDetails(Connection connection){
        System.out.println("Enter hostel ID: ");
        String hostelID = scanner.nextLine();
        String query = "SELECT * FROM `hostels` WHERE `hostel_id` = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, hostelID);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                System.out.println("Hostel ID: " + resultSet.getString("hostel_id"));
                System.out.println("Hostel Name: " + resultSet.getString("hostel_name"));
                System.out.println("Number of Rooms: " + resultSet.getInt("number_of_rooms"));
                resultSet.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    
}
