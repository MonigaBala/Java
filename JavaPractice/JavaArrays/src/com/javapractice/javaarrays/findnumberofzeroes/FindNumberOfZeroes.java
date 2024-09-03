package com.javapractice.javaarrays.findnumberofzeroes;

import java.util.Scanner;

public class FindNumberOfZeroes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		int result = findFirstOccurenceOfZero(array, size);
		if (result == -1) {
			System.out.println("Count of Zero is 0");
		} else {
			System.out.println("Count of zeroes is : " + (size - result));
		}
		scanner.close();

	}

	public static int findFirstOccurenceOfZero(int[] array, int size) {
		for (int i = 0; i < size; i++) {
			if (array[i] == 0) {
				return i;
			}
		}
		return -1;
	}
}
