package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class P5 {

	private static Connection con;
	private static PreparedStatement stmt;


	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice", "root", "V2169@gpatil");
			System.out.println("Enter the employee id");
			int id = sc.nextInt();
			
			String q = "select * from employee where id="+id;
			stmt = con.prepareStatement(q);
			
			ResultSet x = stmt.executeQuery(q);

			while (x.next() == true) {
				System.out.println(x.getInt(1)+"  "+x.getString(2)+" "+x.getInt(3));
				
				System.out.println("------------");
			} 

			sc.close();
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
