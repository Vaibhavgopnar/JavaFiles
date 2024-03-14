package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P4 {

	private static Connection con;
	private static Statement stmt;

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice", "root", "V2169@gpatil");

			stmt = con.createStatement();

			ResultSet x = stmt.executeQuery("select * from employee");

			while (x.next() == true) {
				System.out.println(x.getInt(1)+"  "+x.getString(2)+" "+x.getInt(3));
				
				System.out.println("------------");
			} 

			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
