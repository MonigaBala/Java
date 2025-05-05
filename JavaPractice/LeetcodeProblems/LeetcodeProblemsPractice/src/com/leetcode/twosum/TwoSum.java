package com.leetcode.twosum;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter the target: ");
		int target = scanner.nextInt();
		int[] resultArray = twoSum(array, target);
		System.out.println(Arrays.toString(resultArray));
		scanner.close();
	}

	public static int[] twoSum(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (target == array[i] + array[j]) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

}
