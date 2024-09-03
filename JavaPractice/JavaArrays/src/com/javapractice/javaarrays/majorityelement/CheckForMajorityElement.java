package com.javapractice.javaarrays.majorityelement;

import java.util.Scanner;

public class CheckForMajorityElement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter the key element to be checked : ");
		int key = scanner.nextInt();
		System.out.println(
				"Is the key element is appeared majority in the array : " + checkMajorityElement(array, size, key));
		scanner.close();
	}

	public static boolean checkMajorityElement(int[] array, int size, int key) {

		int last_index = 0;

		last_index = (size % 2 == 0) ? size / 2 : size / 2 + 1;
		for (int i = 0; i < last_index; i++) {
			if (array[i] == key && array[i + size / 2] == key) {
				return true;
			}

		}
		return false;
	}
}
