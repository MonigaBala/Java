package com.javapractice.javasubstringcomparison;

import java.util.Scanner;

public class SubstringComparison {

	public static String findSmallestAndLargestSubstring(String input, int k) {
		String smallest = input.substring(0, k);
		String largest = input.substring(0, k);
		for (int i = 1; i <= input.length() - k; i++) {
			String substring = input.substring(i, i + k);
			if (substring.compareTo(smallest) < 0) {
				smallest = substring;
			} else if (substring.compareTo(largest) > 0) {
				largest = substring;
			}
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to compare the substrings lexicographically: ");
		String input = scanner.nextLine();
		System.out.println("Enter the length to be compared: ");
		int k = scanner.nextInt();
		String result = findSmallestAndLargestSubstring(input, k);
		System.out.println(result);

		scanner.close();
	}

}
