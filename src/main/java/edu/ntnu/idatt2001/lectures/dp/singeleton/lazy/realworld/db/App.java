package edu.ntnu.idatt2001.lectures.dp.singeleton.lazy.realworld.db;

import java.sql.Connection;
import java.sql.SQLException;

public class App {
    
    public static void main(String...args) {
        Connection conn = null;
        try {
            DBConnectionManagerSQL dbManager =DBConnectionManagerSQL.getInstance(null, null, null);
            conn = dbManager.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
}
