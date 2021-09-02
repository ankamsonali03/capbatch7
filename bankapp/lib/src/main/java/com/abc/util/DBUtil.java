package com.abc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getDBConnection() {
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/capbatch7", "batch7", "batch7123");
		}
		catch(SQLException e) {
		    System.out.println("Couldn't connect. "+e.getMessage());
		}	
		return con;
		
	}
}