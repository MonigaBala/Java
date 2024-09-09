package com.javapractice.divisibilityby999;

import java.util.Scanner;

public class DivisibilityBy999 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input : ");
		String input = scanner.nextLine();
		System.out.println(isDivisible999(input) ? "Divisible" : "Not Divisible");
		scanner.close();
	}

	public static boolean isDivisible999(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			int digit = input.charAt(i) - '0';
			sum = (sum * 10 + digit) % 999;

		}
		return sum == 0;
	}
}
