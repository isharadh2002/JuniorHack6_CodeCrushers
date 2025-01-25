package com.codecrushers.CrudOPR;

import com.codecrushers.sqlConnector.DatabaseIntegration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentOPR {

    //Add Student
    public void addStudent(String student_id, String name, int age, String department) {
        String query = "INSERT INTO student (student_id, name, age, department) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseIntegration.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setString(1, student_id);
            stmt.setString(2, name);
            stmt.setInt(3, age);
            stmt.setString(4, department);
            stmt.executeUpdate();
            System.out.println("Successfully added the record of the student ID: " + student_id + ".");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Remove Student
    public void deleteStudent(String student_id) {
        String query = "DELETE FROM student WHERE student_id = ?";
        try (Connection conn = DatabaseIntegration.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, Integer.parseInt(student_id));
            stmt.executeUpdate();
            System.out.println("Successfully deleted the record of the student ID: " + student_id + ".");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Update Student
    public void updateStudent(String student_id, String name, int age, String department) {
        String query = "UPDATE users SET name = ?, age = ?, department = ? WHERE student_id = ?";
        try (Connection conn = DatabaseIntegration.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, department);
            stmt.executeUpdate();
            System.out.println("Successfully updated the record of the student ID: " + student_id + ".");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //View Student Details
    public void readStudent() {
        String query = "SELECT * FROM student";
        try (Connection conn = DatabaseIntegration.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getString("student_id") + ", Name: " + rs.getString("name") +  ", Age: " + rs.getInt("age") + ", Department: " + rs.getString("department"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
