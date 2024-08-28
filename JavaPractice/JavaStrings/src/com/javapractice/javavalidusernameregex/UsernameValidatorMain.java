package com.javapractice.javavalidusernameregex;

import java.util.Scanner;

public class UsernameValidatorMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of usernames: ");
		int numberOfUsernames = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < numberOfUsernames; i++) {
			String username = scanner.nextLine();
			if (username.matches(UsernameValidator.regularexpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
		scanner.close();
	}

}
