package com.leetcode.containsDuplicate;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		for (int num : nums) {
			num = scanner.nextInt();
		}
		System.out.println("Contains duplicate: " + containsDuplicate(nums));
		scanner.close();
	}

	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> seenNumbers = new HashSet<>();
		for (int num : nums) {
			if (seenNumbers.contains(num)) {
				return true;
			}
			seenNumbers.add(num);
		}
		return false;
	}
}
