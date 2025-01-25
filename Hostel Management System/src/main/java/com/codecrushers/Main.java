package com.codecrushers;

import com.codecrushers.sqlConnector.DatabaseIntegration;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = DatabaseIntegration.getConnection();


    }
}