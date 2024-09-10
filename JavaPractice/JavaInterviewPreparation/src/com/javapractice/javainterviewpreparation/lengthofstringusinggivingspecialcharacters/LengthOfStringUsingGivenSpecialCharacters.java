package com.javapractice.javainterviewpreparation.lengthofstringusinggivingspecialcharacters;

import java.util.Scanner;

public class LengthOfStringUsingGivenSpecialCharacters {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the input : ");
		String input = scanner.nextLine();
		int countStar = 0;
		int countHash = 0;
		for (char ch : input.toCharArray()) {
			if (ch == '*') {
				countStar++;
			} else if (ch == '#') {
				countHash++;
			}
		}
		int difference = countStar - countHash;
		System.out.println("The difference is : " + difference);
		scanner.close();
	}
}
