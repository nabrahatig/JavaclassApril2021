package com.bank.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionManager {
	
	public static Connection getMySqlConnection() throws SQLException {
		
		Connection connection = null;
		
		String url = "jdbc:mysql://localhost:3306/bank_System";
		String user = "root";
		String pwd = "Kia202160";
		
		connection = DriverManager.getConnection(url, user, pwd);
		
		return connection;
	}

}
