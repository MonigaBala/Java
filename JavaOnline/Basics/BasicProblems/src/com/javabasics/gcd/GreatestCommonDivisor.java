package com.javabasics.gcd;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the two numbers : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int gcd = findGCD(a, b);
		System.out.println("The GCD of the two numbers is : " + gcd);

	}

	public static int findGCD(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		if (a == b) {
			return a;
		}
		if (a > b) {
			if (a % b == 0)
				return b;
			return findGCD(a - b, b);
		}

		if (b % a == 0)
			return a;
		return findGCD(a, b - a);

	}
}
