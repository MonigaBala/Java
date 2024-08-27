package com.javapractice.javaregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
	public static void main(String[] args) {
		// Create an instance of MyRegex to access the pattern
		Regex myRegex = new Regex();

		// Create a Pattern object from the regex pattern in MyRegex
		Pattern pattern = Pattern.compile(myRegex.pattern);

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			// Read the input line
			String input = scanner.nextLine();

			// Create a Matcher object to match the input string against the regex pattern
			Matcher matcher = pattern.matcher(input);

			// Check if the input string matches the regex pattern
			if (matcher.matches()) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}

		// Close the scanner
		scanner.close();
	}
}
