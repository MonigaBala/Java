package com.csv.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 * The {@code ViewEmployees} class connects to a MySQL database and retrieves
 * all employee records from the {@code employees} table. The retrieved data
 * includes the employee's ID, name, age, department, and salary, and it is
 * printed to the console.
 * 
 * @author MonigaBalasubramanian
 */
public class ViewEmployees {

	/**
	 * The main method that establishes a database connection, executes a SQL query
	 * to retrieve employee data, and displays the data.
	 * 
	 * @param args Command line arguments (not used in this application).
	 */
	public static void main(String[] args) {
		// Database connection URL
		String jdbcURL = "jdbc:mysql://localhost:3306/csvjdbc";

		// Database credentials
		String username = "root";
		String password = "demo";

		// SQL query to retrieve all records from the employees table
		String sql = "SELECT * FROM employees";

		try {
			// Load the MySQL JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish a connection and execute the SQL query
			try (Connection connection = DriverManager.getConnection(jdbcURL, username, password);
					Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(sql)) {

				// Iterate over the result set and print employee details
				while (resultSet.next()) {
					int id = resultSet.getInt("id");
					String name = resultSet.getString("name");
					int age = resultSet.getInt("age");
					String department = resultSet.getString("department");
					double salary = resultSet.getDouble("salary");

					System.out.printf("ID: %d, Name: %s, Age: %d, Department: %s, Salary: %.2f%n", id, name, age,
							department, salary);
				}

			} catch (SQLException e) {
				// Handle SQL-related exceptions
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// Handle exception if the JDBC driver is not found
			e.printStackTrace();
		}
	}
}
