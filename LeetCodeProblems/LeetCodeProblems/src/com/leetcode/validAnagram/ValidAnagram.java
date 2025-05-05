package com.leetcode.validAnagram;

import java.util.Scanner;

public class ValidAnagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String t = scanner.nextLine();
		System.out.println("Is Valid Anagram: " + isValidAnagram(s, t));
		scanner.close();
	}

	public static boolean isValidAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] charCounts = new int[26];
		for (int i = 0; i < s.length(); i++) {
			charCounts[s.charAt(i) - 'a']++;
			charCounts[t.charAt(i) - 'a']--;
		}
		for (int count : charCounts) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}
}
