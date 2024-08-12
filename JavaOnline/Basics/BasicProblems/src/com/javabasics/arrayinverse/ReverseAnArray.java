package com.javabasics.arrayinverse;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("The Reversed Array is : ");
		reversedArray(array);
	}

	public static void reversedArray(int[] array) {
		int[] sortedArray = new int[array.length];

		for (int i = 0; i < sortedArray.length; i++) {

			sortedArray[i] = array[array.length - i - 1];
		}
		for (int j = 0; j < sortedArray.length; j++) {
			System.out.print(sortedArray[j] + " ");
		}
	}

}
