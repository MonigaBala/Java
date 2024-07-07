package com.javabook.loops;

import java.util.Scanner;

/**
 * Prints the first 10 multiples of given integer"num"(Using for loop).
 * 
 * @author Moniga
 */
public class HackerrankForLoop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int num = scanner.nextInt(); // Getting input using STDin.

		for (int i = 1; i <= 10; i++) { // Iterating over the for loop to print the 10 multiples of given input.
			int result = num * i;
			System.out.println(num + "*" + i + "=" + result);
		}

		scanner.close();
	}
}
