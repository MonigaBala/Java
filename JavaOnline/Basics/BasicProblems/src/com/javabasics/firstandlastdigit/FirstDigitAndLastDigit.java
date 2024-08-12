package com.javabasics.firstandlastdigit;

import java.util.Scanner;

public class FirstDigitAndLastDigit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int firstNumber = findFirstDigit(number);
		int lastNumber = findLastDigit(number);
		System.out.println("The First Digit of the number is : " + firstNumber);
		System.out.println("The last Digit of the number is : " + lastNumber);
		scanner.close();
	}

	public static int findFirstDigit(int n) {

		while (n >= 10) {
			n /= 10;
		}
		return n;
	}

	public static int findLastDigit(int n) {

		return n % 10;
	}

}
