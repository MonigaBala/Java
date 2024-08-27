package com.javapractice.javapatterns;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = scanner.nextLine();
		String[] tokens = input.split("[^A-Za-z]+");

		List<String> tokensList = Arrays.asList(tokens);
		tokens = tokensList.stream().filter(token -> !token.isEmpty()).toArray(String[]::new);
		int tokenLength = tokens.length;
		System.out.println(tokenLength);
		for (String token : tokens) {
			System.out.println(token);
		}
		scanner.close();
	}
}
