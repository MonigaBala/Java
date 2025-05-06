package com.leetcode.productOfArrayExceptItself;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptItself {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scanner.nextInt();
		}
		System.out.println("The values are: " + Arrays.toString(productExceptSelf(nums)));
		scanner.close();
	}

	public static int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		Arrays.fill(result, 1);
		int pre = 1, post = 1;
		for (int i = 0; i < result.length; i++) {
			result[i] = pre;
			pre = nums[i] * pre;
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			result[i] = result[i] * post;
			post = post * nums[i];
		}
		return result;
	}
}
