package com.skills.todolist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Users {

	static String username;
	static String upasword;
	static Connection con = MainApp.con;

	static Scanner sc = new Scanner(System.in);
	private static PreparedStatement pstmt;

	public Users(String username, String upasword) {
		super();
		Users.username = username;
		Users.upasword = upasword;
	}

	public String getUsername() {
		return username;
	}

	public String getUpasword() {
		return upasword;
	}

	static void userRegistration() throws SQLException {
		System.out.println("Enter userName :");
		username = sc.next();
		System.out.println("Enter Password");
		upasword = sc.next();

		String q = "Insert into users values(?,?)";
		pstmt = con.prepareStatement(q);
		pstmt.setString(1, username);
		pstmt.setString(2, upasword);

		int x = pstmt.executeUpdate();

		if (x > 0) {
			System.out.println("User Added !!,  Refresh the page to login");
		} else
			System.out.println("User insertion failed !! Refresh the page to register again");

	}

	static void userLogin() throws SQLException {
		System.out.println("Enter userName :");
		username = sc.next();
		System.out.println("Enter Password");
		upasword = sc.next();

		String q = "select * from users where user_name=? and upassword=?";
		pstmt = con.prepareStatement(q);
		pstmt.setString(1, username);
		pstmt.setString(2, upasword);

		ResultSet res = pstmt.executeQuery();

		if (res.next() == true) {
			System.out.println("Login Successfull\n" + "Welcome to your To-Do-List Application " + res.getString(1));
			To_Do_Task.taskList(res.getString(1));
		} else {
			System.out.println("User Login failed !! Refresh the page to login again");
		}

	}
}
