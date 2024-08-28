package com.javapractice.javasubstrings;

import java.util.Scanner;

public class JavaSubstrings {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = scanner.nextLine();
		System.out.println("Enter the start index: ");
		int startIndex = scanner.nextInt();
		System.out.println("Enter the last index: ");
		int endIndex = scanner.nextInt();
		String substring = input.substring(startIndex, endIndex);
		System.out.println("The substring of the given input is : " + substring);
		scanner.close();
	}

}
