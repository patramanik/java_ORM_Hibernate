package com.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static String  url ="jdbc:mysql://localhost:3307/testdb";
	
	private static String user ="root";
	
	private static String password ="root";
	
	private DBUtil(){}
	
	static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
	
	
	public static Connection getConnection() throws SQLException{
		
		return DriverManager.getConnection(url, user, password);
		
	}
	

}