package com.leetcode.twosuminputarrayissorted;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumInputArrayIsSorted {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scanner.nextInt();
		}
		int target = scanner.nextInt();
		System.out.println("The indices of two sum equal to target is : " + Arrays.toString(findTwoSum(nums, target)));
		scanner.close();
	}

	public static int[] findTwoSum(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			if (nums[left] + nums[right] > target) {
				right--;
			} else if (nums[left] + nums[right] < target) {
				left++;
			} else {
				return new int[] { left + 1, right + 1 };
			}
		}
		return null;
	}
}
