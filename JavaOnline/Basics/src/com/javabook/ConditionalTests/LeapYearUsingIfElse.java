package com.javabook.ConditionalTests;

import java.util.Scanner;

/**
 * To check the input is a leap year or not using ifelse condition.
 * 
 * @author Moniga
 */
public class LeapYearUsingIfElse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Getting user input using STDin.

		System.out.println("Enter a year to check for leap year: ");
		int year = scanner.nextInt();

		String result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "This is a leap year"
				: "This is not a leap year"; // Ternary operator is used in case of if else i.e,condition?true
												// statements:false statements.

		System.out.println(result);
		scanner.close();

	}

}
