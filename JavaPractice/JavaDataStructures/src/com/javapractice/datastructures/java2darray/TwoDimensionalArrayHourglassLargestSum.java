package com.javapractice.datastructures.java2darray;

import java.util.Scanner;

public class TwoDimensionalArrayHourglassLargestSum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of two dimensional array: ");
		int length = scanner.nextInt();
		int[][] twoDArray = new int[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				twoDArray[i][j] = scanner.nextInt();
			}
		}
		int largestSum = largestSumOfHourGlass(twoDArray);
		System.out.println("The Largest Sum of the total hourglass is : " + largestSum);
		scanner.close();
	}

	public static int largestSumOfHourGlass(int[][] array) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sum = array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j + 1] + array[i + 2][j]
						+ array[i + 2][j + 1] + array[i + 2][j + 2];
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		return maxSum;
	}

}
