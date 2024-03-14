package practice;

import java.awt.*;
import java.sql.*;

import javax.swing.*;

public class Readdata extends JFrame {

	private static final long serialVersionUID = 1L;
	JTable t;
	JTextField tf;
	JScrollPane sp;
	Font f,f1;
	int i=0,j=0;
	String[] x = { "name", "city", "birthdate", "professor", "department", "departmentid"};
	String y[][] = new String[20][6];
	
	Readdata() {
		
	}
	
	Readdata(String id) {
		super("Employee Details");
		setLocation(400, 100);
		setSize(600, 400);

		f = new Font("Arial", Font.BOLD, 20);
		f1 = new Font("Arial", Font.PLAIN, 18);
		
		
		
		try {

			ConnectionClass obj = new ConnectionClass();
			String q = "select * from employee where departmentid=' "+id+" ' ";
			ResultSet rest = obj.stm.executeQuery(q);
			while (rest.next()) 
			{
				y[i][j++] = rest.getString("name");
				y[i][j++] = rest.getString("city");
				y[i][j++] = rest.getString("birthdate");
				y[i][j++] = rest.getString("professor");
				y[i][j++] = rest.getString("department");
				y[i][j++] = rest.getString("departmentid");

				i++;
				j = 0;
			}

		t = new JTable(y, x);
		t.setFont(f1);

		} catch (SQLException e1) {

			e1.printStackTrace();
		}

		sp = new JScrollPane(t);
		add(sp);
	}
	public static void main(String[] args) {
		
		new Readdata().setVisible(true);

	}

}
