package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class P2 {

	private static Connection con;
	private static Statement stmt;

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice", "root", "V2169@gpatil");

			stmt = con.createStatement();

			int x = stmt.executeUpdate("create table employee (id int, empName varchar(100), age int)");

			if (x >= 0) {
				System.out.println("table created");
			} else {
				System.out.println("table creation failed");
			}

			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
