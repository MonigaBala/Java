package com.leetcode.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scanner.nextInt();
		}
		System.out.println("Three sum: " + threeSum(nums));
		scanner.close();
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				twoSum(nums, i, result);
			}
		}
		return result;
	}

	public static void twoSum(int[] nums, int i, List<List<Integer>> result) {
		int left = i + 1;
		int right = nums.length - 1;
		while (left < right) {
			int sum = nums[i] + nums[left] + nums[right];
			if (sum < 0) {
				left++;
			} else if (sum > 0) {
				right--;
			} else {
				result.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
				while (left < right && nums[left] == nums[left - 1]) {
					++left;
				}
			}
		}

	}
}
