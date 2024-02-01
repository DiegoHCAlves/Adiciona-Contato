package com.biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/Estudo","root","root");

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
