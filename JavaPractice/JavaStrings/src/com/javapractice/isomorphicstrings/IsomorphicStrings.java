package com.javapractice.isomorphicstrings;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input one: ");
		String inputOne = scanner.nextLine();
		System.out.println("Enter the input two: ");
		String inputTwo = scanner.nextLine();
		System.out.println(areIsomorphic(inputOne, inputTwo));
		scanner.close();
	}

	public static boolean areIsomorphic(String inputOne, String inputTwo) {

		if (inputOne.length() != inputTwo.length()) {
			return false;
		}
		HashMap<Character, Character> mapOne = new HashMap<>();
		HashMap<Character, Character> mapTwo = new HashMap<>();
		for (int i = 0; i < inputOne.length(); i++) {
			char ch1 = inputOne.charAt(i);
			char ch2 = inputTwo.charAt(i);
			if (mapOne.containsKey(ch1)) {
				if (mapOne.get(ch1) != ch2) {
					return false;
				}
			} else {
				if (mapTwo.containsKey(ch2)) {
					return false;
				}
				mapOne.put(ch1, ch2);
				mapTwo.put(ch2, ch1);
			}
		}

		return true;
	}

}