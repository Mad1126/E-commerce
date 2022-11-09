package com.Database.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PairConnection {
	
	public static Connection getConnection() {
		
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			

			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ecommerce?autoReconnect=true&useSSL=false","root","root");
			
		}catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		
		return con;
		
		
	}
	
	public static void main(String args[]) {
		
		getConnection();
		
	}

}
