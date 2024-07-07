package EmployeeOverloadingDemo;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = scanner.nextLine();
		System.out.println("Enter the designation: ");
		String designation = scanner.nextLine();
		Employee employee1 = new Employee(name, designation);
		Employee employee2 = new Employee(name, designation);
		Employee employee3 = new Employee(name, designation);
		if (designation.equals("Programmer")) {
			double bA = scanner.nextDouble();
			System.out.println("Bonus for Programmer is: " + employee1.calcBonus(bA));
		} else if (designation.equals("Manager")) {
			double bA = scanner.nextDouble();
			double cA = scanner.nextDouble();
			System.out.println("Bonus for Manager is: " + employee2.calcBonus(bA, cA));
		} else {
			double bA = scanner.nextDouble();
			double cA = scanner.nextDouble();
			double hA = scanner.nextDouble();
			System.out.println("Bonus for Director is: " + employee3.calcBonus(bA, cA, hA));
		}
		scanner.close();
	}

}
