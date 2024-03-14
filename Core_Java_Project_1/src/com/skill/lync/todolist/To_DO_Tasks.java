package com.skill.lync.todolist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class To_DO_Tasks {
	static String user_name;
	static PreparedStatement pstmt;
	static Connection con = MainApp.con;
	static Scanner sc = new Scanner(System.in);
	private static ResultSet res;

	static void taskList(String user) {
		user_name = user;
		System.out.println(" Select an option: \n" + "1. Add task\n" + "2. View tasks\n" + "3. Update task\n"
				+ "4. Remove task\n"
				+ "5. searchTask" + "6. Logout");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			newTask();
			break;
		}
		case 2: {
			viewTasks();
			break;
		}
		case 3: {
			updateTask();
			break;
		}
		case 4: {
			removeTask();
			break;
		}
		case 5: {
			searchTask();
		}
		case 6: {
			MainApp.main(null);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}

	static void removeTask() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Task name:");
		String taskname = sc.next();

		String q = "delete from todo_list where taskname=?";
		try {
			pstmt = con.prepareStatement(q);
			pstmt.setString(1, taskname);

			int res = pstmt.executeUpdate();

			if (res > 0)
				System.out.println("Task Ended ");
			else
				System.out.println("Tsk not Found");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	static void updateTask() {

		String q = "update todo_list set status=? where user_name=? and id=?";
		try {
			pstmt = con.prepareStatement(q);
			System.out.println("Enter the id");
			int id = sc.nextInt();
			System.out.println("Enter the status");
			String status = sc.next();
			
			pstmt.setInt(3, id);
			pstmt.setString(2, user_name);
			pstmt.setString(1, status);
			
			int x = pstmt.executeUpdate();
			
			if(x > 0) {
				System.out.println("Task Updated ");
			}
			else
				System.out.println("Somethimg went wrong");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	static void viewTasks() {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from todo_list where user_name = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user_name);
			res = pstmt.executeQuery();
			while (res.next() == true) {
				System.out.println("Task Id\t: " + res.getInt(1));
				System.out.println("Task Name \t: " + res.getString(2));
				System.out.println("Task Description \t: " + res.getString(3));
				System.out.println("Task Status \t: " + res.getString(4));
				System.out.println("--------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void newTask() {
		try {
			System.out.println(con);
			System.out.println("Enter the task name:");
			String task_name = sc.next();
			System.out.println("Enter the description: ");
			String desc = sc.next();
			String sql = "insert into todo_list (taskname,description,user_name) values (?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, task_name);
			pstmt.setString(2, desc);
			pstmt.setString(3, user_name);
			int x = pstmt.executeUpdate();
			if (x > 0) {
				System.out.println("Task Added successfully.\n");
				taskList(user_name);
			} else {
				System.out.println("Task action failed.");
				taskList(user_name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void searchTask() {
		try {
			System.out.println("Enter the taskname");
			String task = sc.next();
			String sql = "select * from todo_list where user_name=? and taskname like '" + task + "%'";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user_name);
			
			res = pstmt.executeQuery();
			while (res.next() == true) {
				System.out.println("Task Id\t: " + res.getInt(1));
				System.out.println("Task Name \t: " + res.getString(2));
				System.out.println("Task Description \t: " + res.getString(3));
				System.out.println("Task Status \t: " + res.getString(4));
				System.out.println("--------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
