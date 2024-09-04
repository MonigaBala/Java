package com.javapractice.javaarrays.countnumberofprimes;

import java.util.Scanner;

public class CountNumberOfPrimes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int length = scanner.nextInt();
		System.out.println("Enter the elements of the array: ");
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int totalPrimeNumbers = countOfPrime(array);
		System.out.println("The count of prime numbers is : " + totalPrimeNumbers);
		scanner.close();
	}

	public static int countOfPrime(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (isPrime(array[i])) {
				count++;
			}
		}
		return count;
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		if (num <= 3) {
			return true;
		}
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0)
				return false;
		}
		return true;
	}

}
