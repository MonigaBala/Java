package com.leetcode.validPalindrome;

import java.util.Scanner;

public class ValidPalindrome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = scanner.nextLine();
		System.out.println("Is Valid Palindrome: " + validPalindrome(s));
		scanner.close();
	}

	public static boolean validPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
