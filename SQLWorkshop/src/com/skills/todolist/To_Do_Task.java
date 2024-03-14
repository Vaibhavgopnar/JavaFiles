package com.skills.todolist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class To_Do_Task {

	static String username;
	static Scanner sc = new Scanner(System.in);
	static Connection con = MainApp.con;
	private static PreparedStatement pstmt;

	static void taskList(String user) throws SQLException {
		username = user;
		System.out.println("Select an option\n" + "1. Add task\n" + "2. view task\n" + "3. update task\n"
				+ "4. removw task\n" + "5. Loguot");

		int ch = sc.nextInt();

		switch (ch) {
		case 1: {
			newTask();
		}
		case 2: {
			viewTask();
		}
		case 3: {
			updateTask();
		}
		case 4: {
			removeTask();
		}
		case 5: {
			MainApp.main(null);
		}
		default:
			throw new IllegalArgumentException("Unexpected value " + ch);
		}
	}

	private static void viewTask() throws SQLException {

		String q = "select * from todo_list where user_name=?";
		pstmt = con.prepareStatement(q);
		pstmt.setString(1, username);
		ResultSet res = pstmt.executeQuery();

		while (res.next()==true) {
			System.out.println("Task Details : \n" + res.getInt(1) + " \nTaskName : " + res.getString(2)
					+ " \nTaskDesc :  " + res.getString(3) + " \nTaskStatus : " + res.getString(4));

		}
	}

	private static void removeTask() throws SQLException {

		System.out.println("Enter the Task name:");
		String taskname = sc.next();

		String q = "delete from todo_list where taskname=?";
		pstmt = con.prepareStatement(q);
		pstmt.setString(1, taskname);

		int res = pstmt.executeUpdate();
		
		if(res > 0)
			System.out.println("Task Ended ");
		else
			System.out.println("Tsk not Found");
	}

	private static void updateTask() {

	}

	private static void newTask() throws SQLException {
		System.out.println("Enter the Task name:");
		String taskname = sc.next();
		System.out.println("Enter the description");
		String desc = sc.next();

		String q = "insert into todo_list (taskname, description,user_name) values(?,?,?)";
		pstmt = con.prepareStatement(q);
		pstmt.setString(1, taskname);
		pstmt.setString(2, desc);
		pstmt.setString(3, username);

		int x = pstmt.executeUpdate();

		if (x > 0) {
			System.out.println("Task added Successfull\n");
			taskList(username);
		} else {
			System.out.println("Task Action failed !! ");
			taskList(username);
		}
	}
}
