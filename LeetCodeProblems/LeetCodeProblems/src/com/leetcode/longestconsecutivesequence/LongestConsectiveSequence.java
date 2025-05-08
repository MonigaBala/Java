package com.leetcode.longestconsecutivesequence;

import java.util.HashSet;
import java.util.Scanner;

public class LongestConsectiveSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = scanner.nextInt();
		int[] nums = new int[s];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scanner.nextInt();
		}
		System.out.println("The length of Longest consecutive Sequence: " + longestConsecutiveSequence(nums));
		scanner.close();
	}

	public static int longestConsecutiveSequence(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		HashSet<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}
		int longestSub = 1;
		for (int num : set) {
			if (set.contains(num - 1)) {
				continue;
			} else {
				int currentNum = num;
				int currentSub = 1;
				while (set.contains(currentNum + 1)) {
					currentNum++;
					currentSub++;
				}
				longestSub = Math.max(longestSub, currentSub);
			}
		}
		return longestSub;
	}
}
