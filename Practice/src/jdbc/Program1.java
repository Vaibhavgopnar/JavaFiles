package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program1 {

	private static Connection con;
	private static Statement stmt;
	private static ResultSet rest;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practice", "root", "V2169@gpatil");

		stmt = con.createStatement();

//		String query = "Insert into employees values(122, 'ram', 34)";
//		int row = stmt.executeUpdate(query);

		String query1 = "select * from employees";
		rest = stmt.executeQuery(query1);
		
//		rest.beforeFirst();
		rest.afterLast();
		boolean b = rest.isBeforeFirst();

//		if(row == 1) {
//			System.out.println("Data Entry Success");
//		}
//		else {
//			System.out.println("Data Entry Failed");
//		}

		if (b == true) {
			while (rest.next()) {
				System.out.println(rest.getInt(1));
				System.out.println(rest.getString(2));
				System.out.println(rest.getInt(3));

				System.out.println("------------------------");
			}
		} else {
			System.out.println("The Result set handle is not in a beforefirst position");
		}

		rest.close();
		stmt.close();
		con.close();
	}

}
