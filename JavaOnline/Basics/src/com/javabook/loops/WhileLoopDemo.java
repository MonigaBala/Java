package com.javabook.loops;

/**
 * Printing the value of x less than 4 using while loop.
 * 
 * @author Moniga
 */
public class WhileLoopDemo {

	public static void main(String[] args) {

		int x = 1; // Initializing while loop.
		System.out.println("Before the loop");

		while (x < 4) { // Condition when the loop will exit.
			System.out.println("In the loop");
			System.out.println("Value of x is : " + x);

			x = x + 1; // Incrementing the value in while loop.
		}
		System.out.println("This is after the loop");
	}
}
