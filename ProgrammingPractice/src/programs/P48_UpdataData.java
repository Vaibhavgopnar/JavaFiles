package programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class P48_UpdataData {

	private static Connection con;
	private static PreparedStatement stmt;

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/challenge_1";
		String user = "root";
		String pass = "V2169@gpatil";

		con = DriverManager.getConnection(url, user, pass);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price to update ");
		int price = sc.nextInt();

		String query = "update ecommerce SET Product_cost =?  where Product_id IN(101, 102, 103)";
		
		stmt = con.prepareStatement(query);
		stmt.setInt(1, price);
		stmt.executeUpdate();
		
		stmt.close();
		con.close();
		sc.close();
	}

}
