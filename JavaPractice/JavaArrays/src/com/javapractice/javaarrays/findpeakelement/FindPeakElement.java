package com.javapractice.javaarrays.findpeakelement;

import java.util.Scanner;

public class FindPeakElement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length of the array : ");
		int length = scanner.nextInt();
		int[] array = new int[length];

		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();
		}
		int peakElement = findPeakElement(array, length);
		System.out.println("The peak element in the array is : " + peakElement);
		scanner.close();
	}

	public static int findPeakElement(int[] array, int n) {
		if (n == 1) {
			return 0;
		}
		if (array[0] >= array[1]) {
			return array[0];

		}
		if (array[n - 1] >= array[n - 2]) {
			return array[n - 1];
		}
		for (int i = 1; i < n - 2; i++) {
			if (array[i] >= array[i - 1] && array[i] >= array[i + 1]) {
				return array[i];
			}
		}
		return 0;
	}
}
