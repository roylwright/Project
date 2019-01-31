package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		createTable();
		post();
		get();
		
	}
	public static ArrayList<String> get() throws Exception {
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT first,last FROM tablename");
			ResultSet result = statement.executeQuery();
			ArrayList<String> array = new ArrayList<String>();
			while(result.next()) {
				System.out.println(result.getString("first") + " " + result.getString("last"));
				array.add(result.getString("last"));
			}
			System.out.println("Read complete");
			return array;
		}catch(Exception e){System.out.println(e);}
		return null;
		
	}
	public static void post() throws Exception {
		final String var1 = "john";
		final String var2 = "smith";
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO tablename (first,last) VALUES('"+var1+"','"+var2+"')");
			posted.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		finally {System.out.println("Insert complete");}
		
	}
	public static void createTable() throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement(
					"CREATE TABLE IF NOT EXISTS tablename(id int NOT NULL AUTO_INCREMENT, FIRST VARCHAR(255), LAST VARCHAR(255), PRIMARY KEY(ID))");
			create.executeUpdate();
			
		}catch(Exception e){System.out.println(e);}
		finally {System.out.println("Table exists");}
	}
	
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			// replace local host with ip address if not local; last ref is db name
			String url = "jdbc:mysql://localhost:3306/testdb";
			String userName = "root";
			String password = "password";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			System.out.println();
			System.out.println("Connected");
			return conn;
		} catch(Exception e) {System.out.println(e);}
		return null;
	}
}
