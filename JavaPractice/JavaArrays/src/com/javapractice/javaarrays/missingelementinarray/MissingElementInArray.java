package com.javapractice.javaarrays.missingelementinarray;

import java.util.Scanner;

public class MissingElementInArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int length = scanner.nextInt();
		int[] array = new int[length - 1];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int missingElement = findMissingElement(array, length);
		System.out.println("The missing element is : " + missingElement);
		scanner.close();
	}

	public static int findMissingElement(int[] array, int length) {
		int totalSum = (length * (length + 1)) / 2;
		int sum = 0;
		for (int ele : array) {
			sum += ele;
		}
		return totalSum - sum;
	}

}
