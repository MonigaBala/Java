package com.javabasics.power;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the base : ");
		int base = scanner.nextInt();
		System.out.println("Enter the power : ");
		int power = scanner.nextInt();
		int result = (int) Math.pow(base, power);
		System.out.println("The value is : " + result);

	}

}
