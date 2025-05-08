package com.leetcode.encodeanddecodestrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EncodeAndDecodeStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the String List: ");
		int size = scanner.nextInt();
		scanner.nextLine();
		String[] s = new String[size];
		for (int i = 0; i < s.length; i++) {
			s[i] = scanner.nextLine();
		}
		String encoded = encodeStrings(Arrays.asList(s));
		System.out.println("Encoded String: " + encoded);
		System.out.println("Decoded List of Strings: " + decodeStrings(encoded));
		scanner.close();
	}

	public static String encodeStrings(List<String> s) {
		if (s.size() == 0) {
			return Character.toString((char) 258);
		}
		String separate = Character.toString((char) 257);
		StringBuilder sb = new StringBuilder();
		for (String str : s) {
			sb.append(str);
			sb.append(separate);
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

	public static List<String> decodeStrings(String sb) {
		if (sb.equals(Character.toString((char) 258))) {
			return new ArrayList();
		}
		String separate = Character.toString((char) 257);
		return Arrays.asList(sb.split(separate, -1));
	}
}
