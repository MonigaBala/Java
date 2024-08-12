package com.csv.generator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * The {@code EmployeeCSVGenerator} class is responsible for generating a CSV
 * file containing random employee data. The generated file includes the
 * employee's ID, name, age, department, and salary. This class simulates the
 * creation of employee records with randomly assigned attributes.
 * 
 * <p>
 * The generated CSV file will have the following columns:
 * <ul>
 * <li><b>id:</b> A unique integer identifier for each employee.</li>
 * <li><b>name:</b> A randomly selected name from a predefined list.</li>
 * <li><b>age:</b> A randomly generated age between 20 and 64 years.</li>
 * <li><b>department:</b> A randomly assigned department from a predefined
 * list.</li>
 * <li><b>salary:</b> A randomly generated salary value between 30,000 and
 * 100,000.</li>
 * </ul>
 * </p>
 * 
 * <p>
 * <b>Example CSV Output:</b>
 * 
 * <pre>
 * id,name,age,department,salary
 * 1,John,35,IT,56400.00
 * 2,Jane,42,Marketing,78950.75
 * ...
 * 100,Olivia,29,Finance,62000.32
 * </pre>
 * </p>
 * 
 * <p>
 * <b>Usage:</b> This class can be executed as a standalone program to generate
 * a CSV file named {@code employees.csv} in the current directory.
 * </p>
 * 
 * @author MonigaBalasubramanian
 */
public class EmployeeCSVGenerator {

	/**
	 * The main method that drives the generation of the CSV file with random
	 * employee data. It defines the file name, the number of rows to generate, and
	 * utilizes predefined lists for names and departments to populate the employee
	 * data.
	 * 
	 * @param args Command line arguments (not used in this application).
	 */
	public static void main(String[] args) {
		// The name of the CSV file to be created
		String fileName = "employees.csv";

		// Number of employee records to generate
		int numRows = 100;

		// Predefined arrays of names and departments
		String[] names = { "John", "Jane", "Robert", "Lucy", "Michael", "Emma", "David", "Sophia", "Daniel", "Olivia" };
		String[] departments = { "HR", "IT", "Finance", "Marketing", "Sales" };
		Random random = new Random();

		// Try-with-resources statement to ensure the FileWriter is closed after use
		try (FileWriter writer = new FileWriter(fileName)) {
			// Write the CSV header
			writer.append("id,name,age,department,salary\n");

			// Write the employee data rows
			for (int i = 1; i <= numRows; i++) {
				// Generate random employee data
				int id = i;
				String name = names[random.nextInt(names.length)];
				int age = 20 + random.nextInt(45); // Age between 20 and 64
				String department = departments[random.nextInt(departments.length)];
				double salary = 30000 + (random.nextDouble() * 70000); // Salary between 30,000 and 100,000

				// Write the data to the CSV file
				writer.append(String.valueOf(id)).append(',').append(name).append(',').append(String.valueOf(age))
						.append(',').append(department).append(',').append(String.format("%.2f", salary)).append('\n');
			}

			// Print a success message to the console
			System.out.println("CSV file created successfully.");
		} catch (IOException e) {
			// Handle potential IOExceptions
			e.printStackTrace();
		}
	}
}
