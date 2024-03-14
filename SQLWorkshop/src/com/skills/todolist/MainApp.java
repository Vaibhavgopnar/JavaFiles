package com.skills.todolist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class MainApp {

	static Connection con;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlworkshop", "root", "V2169@gpatil");
			System.out.println("Connected to database");

			System.out.println("Select an Option\n" + "1. Register as new user\n" + "2. Login");
			int choice = sc.nextInt();

			if (choice == 1) {
				Users.userRegistration();
			} else if (choice == 2) {
				Users.userLogin();
			} else {
				System.out.println("Wrong option selected refresh the page");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		sc.close();

	}

}
