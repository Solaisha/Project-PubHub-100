package com.solai.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
 
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3309/pubhub100db";
        Connection con = DriverManager.getConnection(url,"root" ,"solaimysql");
        return con;
    }

	
 
}


