package com.leetcode.medianoftwosortedarrays;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array one: ");
		int arraySizeOne = scanner.nextInt();
		System.out.println("Enter the size of the array two: ");
		int arraySizeTwo = scanner.nextInt();
		int[] arrayOne = new int[arraySizeOne];
		int[] arrayTwo = new int[arraySizeTwo];
		System.out.println("Enter the elements of the array one: ");
		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = scanner.nextInt();
		}
		System.out.println("Enter the elements of the array two: ");
		for (int j = 0; j < arrayTwo.length; j++) {
			arrayTwo[j] = scanner.nextInt();
		}
		double result = findMedianSortedArrays(arrayOne, arrayTwo);
		System.out.println("The median of the two sorted arrays is: " + result);
		scanner.close();
	}

	public static double findMedianSortedArrays(int[] arrayOne, int[] arrayTwo) {
		int[] resultArray = new int[arrayOne.length + arrayTwo.length];
		System.arraycopy(arrayOne, 0, resultArray, 0, arrayOne.length);
		System.arraycopy(arrayTwo, 0, resultArray, arrayOne.length, arrayTwo.length);

		Arrays.sort(resultArray);

		int length = resultArray.length;

		if (length % 2 == 0) {
			int mid = length / 2;
			return (resultArray[mid - 1] + resultArray[mid]) / 2.0;
		} else {
			int mid = length / 2;
			return resultArray[mid];
		}
	}
}
