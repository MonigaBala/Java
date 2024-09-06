package com.javapractice.javaarrays.indexesofsubarraysum;

import java.util.Arrays;
import java.util.Scanner;

public class IndexesOfSubarraySum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int length = scanner.nextInt();
		int[] array = new int[length];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter the sum of the subarray: ");
		int subarraySum = scanner.nextInt();
		int[] result = findSubarrayWithGivenSum(array, length, subarraySum);
		System.out
				.println("The start and end indexes equal to the sum of the subarray is : " + Arrays.toString(result));
		scanner.close();
	}

	public static int[] findSubarrayWithGivenSum(int[] arr, int n, int s) {
		int start = 0;
		int currSum = 0;

		// Traverse the array using 'end' as the end of the sliding window
		for (int end = 0; end < n; end++) {
			// Add the current element to the current sum
			currSum += arr[end];

			// If current sum exceeds the target sum 's', reduce the window size
			while (currSum > s && start <= end) {
				currSum -= arr[start]; // Remove elements from the start
				start++; // Move the start pointer forward
			}

			// Check if current sum is equal to the target sum 's'
			if (currSum == s) {
				// Return 1-based indices, so we add 1 to start and end
				return new int[] { start + 1, end + 1 };
			}
		}

		// If no subarray is found, return [-1]
		return new int[] { -1 };

	}

}
