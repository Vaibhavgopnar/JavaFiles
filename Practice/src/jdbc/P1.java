package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class P1 {

	private static Connection con;
	private static Statement stmt;

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practice", "root", "V2169@gpatil");

			stmt = con.createStatement();

			int x = stmt.executeUpdate("create database sqlpractice");

			if (x == 1) {
				System.out.println("Database created");
			} else {
				System.out.println("Database creation failed");
			}

			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
