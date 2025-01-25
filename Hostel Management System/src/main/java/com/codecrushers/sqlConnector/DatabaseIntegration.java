package com.codecrushers.sqlConnector;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseIntegration {
    static String host = "jdbc:mysql://localhost:3306/hostel_management_system";
    static String username = "root";
    static String password = "";

    public static Connection getConnection() {
        try{
            Connection connection = DriverManager.getConnection(host, username, password);
            System.out.println("Connected to database");
            return connection;
        }
        catch(SQLException e){
            System.out.println("Connection Failed! "+e.getMessage());
        }
        return null;
    }
}
