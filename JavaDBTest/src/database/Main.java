package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getConnection();

	}
	
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			// replace local host with ip address if not local; last ref is db name
			String url = "jdbc:mysql://localhost:3306/sakila";
			String userName = "root";
			String password = "baby5685";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			System.out.println();
			System.out.println("Connected");
			return conn;
		} catch(Exception e) {System.out.println(e);}
		return null;
	}

}
