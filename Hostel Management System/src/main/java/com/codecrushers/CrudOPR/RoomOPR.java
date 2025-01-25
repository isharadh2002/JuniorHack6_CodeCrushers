package com.codecrushers.CrudOPR;

import com.codecrushers.sqlConnector.DatabaseIntegration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RoomOPR {

    //Add Rooms
    public void addRoom(String room_id, String hostel_id, int room_number,  int capacity, int available_capacity) {
        String query = "INSERT INTO rooms (room_id, hostel_id, room_number, capacity, available_capacity) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseIntegration.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setString(1, room_id);
            stmt.setString(2, hostel_id);
            stmt.setInt(3, room_number);
            stmt.setInt(4, capacity);
            stmt.setInt(5, available_capacity);
            stmt.executeUpdate();
            System.out.println("Successfully added the record of the room ID: " + room_id + ".");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //View Room
    public void viewRoom() {
        String query = "SELECT * FROM rooms";
        try (Connection conn = DatabaseIntegration.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getString("room_id") + ", HostelID: " + rs.getString("hostel_id") +  ", Room Number: " + rs.getInt("room_number") + ", Capacity: " + rs.getString("capacity")+ ", Available Capacity: " + rs.getString("available_capacity"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Update Room
    public void updateRoom(String room_id, String hostel_id, int room_number,  int capacity, int available_capacity) {
        String query = "UPDATE students SET hostel_id = ?, room_number = ?, capacity = ?, available_capacity = ? WHERE room_id = ?";
        try (Connection conn = DatabaseIntegration.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(2, hostel_id);
            stmt.setInt(3, room_number);
            stmt.setInt(4, capacity);
            stmt.setInt(5, available_capacity);
            stmt.executeUpdate();
            System.out.println("Successfully updated the record of the Room ID: " + room_id + ".");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Delete Room
    public void deleteRoom(String room_id) {
        String query = "DELETE FROM rooms WHERE student_id = ?";
        try (Connection conn = DatabaseIntegration.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, Integer.parseInt(room_id));
            stmt.executeUpdate();
            System.out.println("Successfully deleted the record of the room ID: " + room_id + ".");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }}
