package programs;

import java.sql.*;

public class P43_CreateDatabase_1 {

	private static Statement stmt;
	private static Connection con;

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/mysql";
		String user = "root";
		String pass = "V2169@gpatil";

		con = DriverManager.getConnection(url, user, pass);
		
		String query = "create database Challenge_1";
		stmt = con.createStatement();
		stmt.executeUpdate(query);
		System.out.println("Database created");
		
		stmt.close();
		con.close();
	}
}
