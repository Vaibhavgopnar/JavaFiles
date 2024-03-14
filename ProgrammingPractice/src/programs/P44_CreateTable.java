package programs;

import java.sql.*;

public class P44_CreateTable {

	private static Statement stmt;
	private static Connection con;

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/Challenge_1";
		String user = "root";
		String pass = "V2169@gpatil";

		con = DriverManager.getConnection(url, user, pass);
		
		String query = "create table Ecommerce (Product_id int, Product_name varchar(100), Product_cost int, Product_available_quantity int, Product_rating int, Product_owner varchar(100))";
		stmt = con.createStatement();
		stmt.executeUpdate(query);
		
		stmt.close();
		con.close();
	}

}
