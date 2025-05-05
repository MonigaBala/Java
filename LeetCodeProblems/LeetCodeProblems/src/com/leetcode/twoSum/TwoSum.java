package com.leetcode.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scanner.nextInt();
		}

		int target = scanner.nextInt();
		int[] result = findIndices(nums, target);
		System.out.println("The indices of two sum: " + Arrays.toString(result));
		scanner.close();
	}

	public static int[] findIndices(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		return new int[] {};
	}
}
