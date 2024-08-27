package com.javapractice.javapatternsyntax;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of inputs : ");
		int numberOfInputs = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < numberOfInputs; i++) {
			String pattern = scanner.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");

			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
		}
		scanner.close();
	}

}
