package com.javapractice.javaarrays.findminandmax;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinimumAndMaximumElements {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int length = scanner.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);

		System.out.println("The minimum element is : " + array[0]);
		System.out.println("The maximum element is : " + array[length - 1]);
		scanner.close();
	}

}
