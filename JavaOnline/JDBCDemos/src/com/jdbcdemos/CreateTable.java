package com.jdbcdemos;

import java.sql.*;

public class CreateTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/dblearning";
		String username = "root";
		String password = "root";
		Connection connection = null;
		Statement statement = null;
		String sql = "Create table employee(name varchar(20),empid integer,city varchar(20)";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			boolean val = statement.execute(sql);
			System.out.println("Table created " + val);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				connection.close();
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
