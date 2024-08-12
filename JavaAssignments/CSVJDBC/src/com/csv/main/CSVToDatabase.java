package com.csv.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * The {@code CSVToDatabase} class reads employee data from a CSV file and
 * inserts it into a MySQL database.
 * <p>
 * The CSV file is expected to have the following columns: {@code id},
 * {@code name}, {@code age}, {@code department}, and {@code salary}. Each row
 * from the CSV file is inserted into the {@code employees} table in the
 * specified MySQL database.
 * </p>
 * 
 * @author MonigaBalasubramanian
 */
public class CSVToDatabase {

	/**
	 * The main method that orchestrates reading from the CSV file and inserting
	 * data into the database.
	 * 
	 * @param args Command line arguments (not used in this application).
	 */
	public static void main(String[] args) {
		// Path to the CSV file containing employee data
		String csvFilePath = "employees.csv";

		// Database connection URL
		String URL = "jdbc:mysql://localhost:3306/csvjdbc";

		// Database credentials
		String username = "root";
		String password = "demo";

		// SQL query for inserting employee data into the database
		String sql = "INSERT INTO employees (id, name, age, department, salary) VALUES (?, ?, ?, ?, ?)";

		// Establishing the connection and reading the CSV file
		try (Connection connection = DriverManager.getConnection(URL, username, password);
				BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath))) {

			// Reading the first line of the CSV file to skip the header
			lineReader.readLine();

			String lineText;

			// Looping through each line of the CSV file
			while ((lineText = lineReader.readLine()) != null) {
				// Splitting the line into fields using a comma as the delimiter
				String[] data = lineText.split(",");

				// Parsing the individual fields
				int id = Integer.parseInt(data[0]);
				String name = data[1];
				int age = Integer.parseInt(data[2]);
				String department = data[3];
				double salary = Double.parseDouble(data[4]);

				// Preparing the SQL statement with the parsed data
				try (PreparedStatement statement = connection.prepareStatement(sql)) {
					statement.setInt(1, id);
					statement.setString(2, name);
					statement.setInt(3, age);
					statement.setString(4, department);
					statement.setDouble(5, salary);

					// Executing the SQL statement to insert data into the database
					statement.executeUpdate();
				} catch (SQLException e) {
					// Handling any SQL exceptions that occur during the execution of the SQL
					// statement
					e.printStackTrace();
				}
			}

			// Indicating successful data insertion
			System.out.println("Data has been inserted successfully.");

		} catch (IOException | SQLException ex) {
			// Handling exceptions related to file I/O and SQL operations
			ex.printStackTrace();
		}
	}
}
