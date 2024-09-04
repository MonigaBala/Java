package com.javapractice.javaarrays.findingkthsmallestelement;

import java.util.Arrays;
import java.util.Scanner;

public class ToFindKthSmallestElementInAnUnsortedArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length of the array : ");
		int length = scanner.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();

		}
		System.out.println("Enter the value of k: ");
		int k = scanner.nextInt();
		int smallestElement = kthSmallestElement(array, k);
		System.out.println("The kth smallest element is : " + smallestElement);
		scanner.close();
	}

	public static int kthSmallestElement(int[] array, int k) {
		Arrays.sort(array);
		return array[k - 1];
	}

}
