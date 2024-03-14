package programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class P49_DeleteRecord {

	private static Connection con;
	private static PreparedStatement stmt;

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/challenge_1";
		String user = "root";
		String pass = "V2169@gpatil";

		con = DriverManager.getConnection(url, user, pass);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price to delete from ");
		int price = sc.nextInt();
		System.out.println("Enter the price to delete Upto ");
		int price2 = sc.nextInt();

		String query = "delete from ecommerce where Product_cost Between ? AND ?";
		
		stmt = con.prepareStatement(query);
		stmt.setInt(1, price);
		stmt.setInt(2, price2);
		stmt.executeUpdate();
		
		stmt.close();
		con.close();
		sc.close();
	}

}
