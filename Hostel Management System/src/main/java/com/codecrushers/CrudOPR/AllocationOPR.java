package com.codecrushers.CrudOPR;

import com.codecrushers.sqlConnector.DatabaseIntegration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AllocationOPR {

    //Allocation a Room to a Student
    public void addAllocation(String allocation_id, String student_id, String room_id, String allocation_date) {
        String query = "INSERT INTO allocations (allocation_id, student_id, room_id, allocation_date) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseIntegration.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setString(1, allocation_id);
            stmt.setString(1, student_id);
            stmt.setString(2, room_id);
            stmt.setString(3, allocation_date);
            stmt.executeUpdate();
            System.out.println("Successfully added the record of the allocation ID: " + allocation_id + ".");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    //Delete Allocation
    public void deleteAllocation(String allocation_id) {
        String query = "DELETE FROM allocations WHERE allocation_id = ?";
        try (Connection conn = DatabaseIntegration.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, Integer.parseInt(allocation_id));
            stmt.executeUpdate();
            System.out.println("Successfully deleted the record of the allocation ID: " + allocation_id + ".");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //View Allocation
    public void viewAllocation() {
        String query = "SELECT * FROM allocations";
        try (Connection conn = DatabaseIntegration.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getString("allocation_id") + ", Student ID: " + rs.getString("student_id") +  ", Room ID: " + rs.getInt("room_id") + ", Date: " + rs.getString("allocation_date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
