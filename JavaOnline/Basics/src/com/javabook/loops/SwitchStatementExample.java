package com.javabook.loops;

import java.util.Scanner;

/**
 * Printing the statements using "switch case".
 * 
 * @author Moniga
 */
public class SwitchStatementExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Getting user input to switch statements.

		System.out.println("Enter a case to switch : ");
		int number = scanner.nextInt();

		switch (number) { // Switch expression

		case 1: // Case statements
			System.out.println("A");
			break;

		case 2:
			System.out.println("B");
			break;

		case 3:
			System.out.println("C");
			break;

		default: // default statement
			System.out.println("ABC");
		}

		scanner.close();
	}
}
