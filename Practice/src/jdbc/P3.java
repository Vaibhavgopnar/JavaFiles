package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class P3 {

	private static Connection con;
	private static PreparedStatement stmt;
	private static int id;
	private static String name;
	private static int age;

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice", "root", "V2169@gpatil");
			for (int i = 1; i <= 3; i++) {
				System.out.println("Enter the  "+i+" Employee id");
				id = sc.nextInt();
				System.out.println("Enter the "+i+"  Name");
				name = sc.next();
				System.out.println("Enter the "+i+"  age");
				age = sc.nextInt();
			}
			
			String query = "Insert into employee(id, empname, age) values(?,?,?)";
			stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setInt(3, age);

			int x = stmt.executeUpdate();

			String query2 = "Insert into employee values(234,'akash',35),(244,'rkash',38),(34,'pawan',34)";
			stmt.executeUpdate(query2);
			if (x >= 1) {
				System.out.println("data inserted");
			} else {
				System.out.println("data insertion failed");
			}

			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
