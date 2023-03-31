package edu.ntnu.idatt2001.lectures.dp.singeleton.lazy.realworld.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManagerSQL {
    private static DBConnectionManagerSQL instance;
    private Connection connection;
 
    private DBConnectionManagerSQL(String url, String username, String password) throws SQLException {
       // initialize the database connection
       
       connection = DriverManager.getConnection(url, username, password);
    }
 
    public static DBConnectionManagerSQL getInstance(String url, String username, String password) throws SQLException {
       if (instance == null) {
          instance = new DBConnectionManagerSQL(url, username, password);
       }
       return instance;
    }
 
    public Connection getConnection() {
       return connection;
    }
}