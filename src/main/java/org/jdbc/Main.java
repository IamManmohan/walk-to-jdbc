package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String url = "jdbc:mysql://localhost:3306/mysql";
        String username = "general";
        String password = "general";
        Connection connection = null;
        try {
            System.out.println("Connecting database...");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
        } catch (SQLException e) {
            System.err.println("Cannot connect the database!");
            e.printStackTrace();
        } finally {
            System.out.println("Closing the connection.");
            if (connection != null) {
                try {
                    System.out.println("Connecting database...");
                    connection = DriverManager.getConnection(url, username, password);
                    System.out.println("Database connected!");
                } catch (SQLException e) {
                    System.err.println("Cannot connect the database!");
                    e.printStackTrace();
                } finally {
                    System.out.println("Closing the connection.");
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (SQLException ignore) {

                            try {
                                connection.close();
                            } catch (SQLException ignore1) {

                            }
                        }
                    }
                }
            }
        }
    }

}