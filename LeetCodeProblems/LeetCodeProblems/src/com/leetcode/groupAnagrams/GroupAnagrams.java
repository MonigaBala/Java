package com.leetcode.groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GroupAnagrams {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the string array: ");
		int size = scanner.nextInt();
		scanner.nextLine(); 

		String[] strs = new String[size];
		System.out.println("Enter the strings:");
		for (int i = 0; i < size; i++) {
			strs[i] = scanner.nextLine();
		}

		System.out.println("Grouped Anagrams: " + groupAnagrams(strs));
		scanner.close();
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0) {
			return new ArrayList();
		}
		Map<String, List> map = new HashMap<>();
		int[] count = new int[26];
		for (String s : strs) {
			Arrays.fill(count, 0);
			for (char c : s.toCharArray()) {
				count[c - 'a']++;
			}
			StringBuilder sb = new StringBuilder("");
			for (int i = 0; i < 26; i++) {
				sb.append("#");
				sb.append(count[i]);
			}
			String key = sb.toString();
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList());
			}
			map.get(key).add(s);

		}
		return new ArrayList(map.values());
	}
}
