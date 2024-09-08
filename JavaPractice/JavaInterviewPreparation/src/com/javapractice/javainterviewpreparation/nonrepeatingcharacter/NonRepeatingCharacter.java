package com.javapractice.javainterviewpreparation.nonrepeatingcharacter;

import java.util.Scanner;

public class NonRepeatingCharacter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String input = scanner.nextLine();
		System.out.println(findFirstNonRepeating(input));
		scanner.close();
	}

	public static char findFirstNonRepeating(String s) {
		int[] freq = new int[26];

		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (freq[s.charAt(i) - 'a'] == 1) {
				return s.charAt(i);
			}
		}
		return '$';
	}
}
