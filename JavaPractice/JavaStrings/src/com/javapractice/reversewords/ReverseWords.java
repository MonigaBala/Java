package com.javapractice.reversewords;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String input = scanner.nextLine();
		System.out.println(reverseWords(input));
		scanner.close();

	}

	public static String reverseWords(String input) {
		String[] words = input.split("\\.");
		int left = 0;
		int right = words.length - 1;
		while (left < right) {
			String temp = words[left];
			words[left] = words[right];
			words[right] = temp;
			left++;
			right--;

		}
		return String.join(".", words);
	}
}
