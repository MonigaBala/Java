package com.javapractice.datastructures.java1darray;

import java.util.Scanner;

public class OneDimensionalArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int numberOfElements = scanner.nextInt();
		int[] array = new int[numberOfElements];
		for (int i = 0; i < numberOfElements; i++) {
			array[i] = scanner.nextInt();
		}
		printArray(array);
		scanner.close();
	}

	public static void printArray(int[] array) {
		for (int ele : array) {
			System.out.println(ele);
		}
	}
}
