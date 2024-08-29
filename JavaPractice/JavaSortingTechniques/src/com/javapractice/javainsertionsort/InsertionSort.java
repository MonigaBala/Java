package com.javapractice.javainsertionsort;

import java.util.Scanner;

public class InsertionSort {

	public static void insertionSort1(int n, int[] arr) {
		int key = arr[n - 1]; // Store the value to be inserted
		int i = n - 2; // Start checking from the second last element

		// Traverse the array from right to left
		while (i >= 0 && arr[i] > key) {
			arr[i + 1] = arr[i]; // Shift the element to the right
			printArray(arr); // Print the current state of the array
			i--;
		}

		arr[i + 1] = key; // Insert the key at the correct position
		printArray(arr); // Print the final state of the array
	}

	public static void printArray(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		insertionSort1(n, arr);
		scanner.close();
	}
}
