package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeConfig {
	public static Connection getConfig() {
		String URL_JD = "jdbc:mysql://localhost:3306/payroll_service";
		String USER_NAME = "Nikita";
		String PASSWORD = "Root";
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Drivers loaded!!");
			connection = DriverManager.getConnection(URL_JD, USER_NAME, PASSWORD);
			System.out.println("connection Established!!");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
