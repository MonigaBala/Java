package com.javapractice.javainterviewpreparation.permutationofstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PermutationOfGivenString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = scanner.nextLine();
		List<String> permutations1 = find_permutation(input);
		System.out.println(String.join(" ", permutations1));
		scanner.close();
	}

	public static List<String> find_permutation(String S) {
		List<String> result = new ArrayList<>();
		char[] chars = S.toCharArray();

		Arrays.sort(chars);

		boolean[] visited = new boolean[S.length()];
		backtrack(chars, "", visited, result);

		return result;
	}

	private static void backtrack(char[] chars, String current, boolean[] visited, List<String> result) {
		if (current.length() == chars.length) {
			result.add(current);
			return;
		}

		for (int i = 0; i < chars.length; i++) {
			if (visited[i] || (i > 0 && chars[i] == chars[i - 1] && !visited[i - 1])) {
				continue;
			}

			visited[i] = true;
			backtrack(chars, current + chars[i], visited, result);
			visited[i] = false;
		}
	}
}
