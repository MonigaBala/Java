package com.javabasics.countdigits;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int count = countDigit(number);
		long numberTwo = scanner.nextLong();
		int countTwo = countDigitByLoop(numberTwo);
		System.out.println("The Count of the digits is : " + count);
		System.out.println("The Count of the digits is : " + countTwo);

	}

	public static int countDigit(int n) {

		return (int) Math.floor(Math.log10(n) + 1);
	}

	public static int countDigitByLoop(long n) {
		if (n == 0) {
			return 1;
		}
		int count = 0;
		while (n != 0) {
			n /= 10;
			++count;
		}
		return count;
	}

}
