package com.javapractice.javastringreverse;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string to be reversed: ");

		String input = scanner.nextLine();

		String reversed = new StringBuilder(input).reverse().toString();

		if (input.equals(reversed)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scanner.close();
	}
}
