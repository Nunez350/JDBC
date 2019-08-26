package com.collabera.jdbc;
​
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
​
public class ConnectionManager {
	static final String URL = "jdbc:mysql://localhost:3306/testdb";
	static final String USERNAME = "root";
	static final String PASSWORD = "root";
	private Connection conn = null;
	
	public Connection getConnection() {
		try{conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); 
			System.out.println("Connection was made.");}
		catch(SQLException e) {e.printStackTrace();}
		return conn;
	}
	
	public void close() {
		try {
			conn.close();
			System.out.println("Connection was closed.");
		} catch (SQLException e) {e.printStackTrace();}
	}
}