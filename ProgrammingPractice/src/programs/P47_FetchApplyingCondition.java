package programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class P47_FetchApplyingCondition {

	private static Connection con;
	private static PreparedStatement stmt;
	private static ResultSet rs;

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/challenge_1";
		String user = "root";
		String pass = "V2169@gpatil";

		con = DriverManager.getConnection(url, user, pass);

		String query = "select * from ecommerce where Product_cost > 2000";

		stmt = con.prepareStatement(query);
		rs = stmt.executeQuery();

		while (rs.next()) {

			System.out.println("Product_id : " + rs.getInt(1));
			System.out.println("Product_name : " + rs.getString(2));
			System.out.println("Product_cost : " + rs.getInt(3));
			System.out.println("Product_available_quantity : " + rs.getInt(4));
			System.out.println("Product_rating : " + rs.getInt(5));
			System.out.println("Product_owner : " + rs.getString(6));
			System.out.println();
		}

		stmt.close();
		con.close();
	}

}
