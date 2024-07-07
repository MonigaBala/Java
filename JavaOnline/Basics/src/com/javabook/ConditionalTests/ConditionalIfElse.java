package com.javabook.ConditionalTests;

import java.util.Scanner;

/**
 * In this program,the given input is checked whether it is odd or even.
 * @author Moniga
 */
public class ConditionalIfElse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // STDin is used to get user input.
		System.out.println("Enter an integer to check odd or even : ");
		int num = scanner.nextInt();

		if (num > 0 && num % 2 == 0) { // if-elseif-else are used to check the condition.
			System.out.println("The given number is EVEN");
		} else if (num > 0 && num % 2 != 0) {
			System.out.println("The given number is ODD");
		} else {
			System.out.println("Given input cannot be decided into ODD or EVEN");
		}

		scanner.close();
	}

}
