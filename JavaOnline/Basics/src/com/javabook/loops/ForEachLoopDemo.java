package com.javabook.loops;

/**
 * Printing the values of the array declared using EnhancedForLoop.
 * 
 * @author Moniga
 */
public class ForEachLoopDemo {

	public static void main(String[] args) {

		int array[] = { 10, 20, 30, 40 }; // Array declaration

		for (int ele : array) { // Iterating over the array to print the elements

			System.out.println(ele);
		}
	}
}
