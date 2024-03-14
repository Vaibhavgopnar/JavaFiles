package programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class P45_InsertDataIntoTable {

	private static PreparedStatement stmt;
	private static Connection con;

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/challenge_1";
		String user = "root";
		String pass = "V2169@gpatil";

		con = DriverManager.getConnection(url, user, pass);
		
		String query = "Insert into Ecommerce(Product_id,Product_name,Product_cost,Product_available_quantity, Product_rating,Product_owner ) values(?,?,?,?,?,?)"; 
		stmt = con.prepareStatement(query);
		stmt.setInt(1, 105);
		stmt.setString(2, "T-Shirt");
		stmt.setInt(3, 3700);
		stmt.setInt(4, 20);
		stmt.setInt(5, 5);
		stmt.setString(6, "Being Human");
		
		stmt.executeUpdate();
		
		stmt.close();
		con.close();
	}
}
