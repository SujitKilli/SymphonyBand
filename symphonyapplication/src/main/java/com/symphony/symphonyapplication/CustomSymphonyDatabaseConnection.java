package com.symphony.symphonyapplication;

import java.sql.*;

public class CustomSymphonyDatabaseConnection {
    public Connection con;
    public void initializeDatabase()
            throws SQLException, ClassNotFoundException
    {
        // Initialize all the information regarding
        // Database Connection
        String dbDriver = "com.mysql.cj.jdbc.Driver";
        String dbURL = "jdbc:mysql://localhost:3306/";
        // Database name to access
        String dbName = "symphony";
        String dbUsername = "root";
        String dbPassword = "mysql123";

        Class.forName(dbDriver);
        con = DriverManager.getConnection(dbURL + dbName,
                dbUsername,
                dbPassword);
    }

    public <T> void excuteQuery(String query) throws SQLException {
        Statement stmt= con.createStatement();
        ResultSet res = stmt.executeQuery(query);
        while (res.next()) {

        }
        res.close();                       // Close the ResultSet                 4
        stmt.close();
    }

    public void closeConnection() throws SQLException {
        con.close();
    }
}
