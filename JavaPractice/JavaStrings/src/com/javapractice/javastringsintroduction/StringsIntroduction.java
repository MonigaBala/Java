package com.javapractice.javastringsintroduction;

import java.util.Scanner;

public class StringsIntroduction {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input one: ");
		String inputOne = scanner.nextLine();
		System.out.println("Enter the input two: ");
		String inputTwo = scanner.nextLine();
		int totalLength = inputOne.length() + inputTwo.length();
		System.out.println("Sum of the length of two Strings : " + totalLength);
		if (inputOne.compareTo(inputTwo) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		String capitalizedInputOne = inputOne.substring(0, 1).toUpperCase() + inputOne.substring(1);
		String capitalizedInputTwo = inputTwo.substring(0, 1).toUpperCase() + inputTwo.substring(1);

		System.out.println(capitalizedInputOne + " " + capitalizedInputTwo);
		scanner.close();
	}

}
