package com.javapractice.javaarrays.rearrange;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RearrangementOfArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int length = scanner.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(rearrangementOfArray(array)));
		scanner.close();
	}

	public static int[] rearrangementOfArray(int[] array) {

		Set<Integer> reversedArray = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			reversedArray.add(array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			if (reversedArray.contains(i)) {
				array[i] = i;
			} else {
				array[i] = -1;
			}
		}
		return array;
	}
}
