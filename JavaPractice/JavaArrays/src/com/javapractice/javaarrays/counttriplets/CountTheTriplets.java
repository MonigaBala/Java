package com.javapractice.javaarrays.counttriplets;

import java.util.Scanner;

public class CountTheTriplets {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int length = scanner.nextInt();
		int[] array = new int[length];
		System.out.println("Enter the elements of the array : ");
		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();
		}
		int tripletCount = countTriplet(array, length);
		System.out.println("The count of the triplets is : " + tripletCount);
		scanner.close();
	}

	public static int countTriplet(int[] array, int length) {
		int count = 0;

		for (int i = 0; i < length - 2; i++) {
			for (int j = i + 1; j < length - 1; j++) {
				for (int k = j + 1; k < length; k++) {
					if (array[i] + array[j] == array[k] || array[j] + array[k] == array[i]
							|| array[k] + array[i] == array[j]) {
						count++;
					}
				}
			}
		}
		return count;

	}
}
