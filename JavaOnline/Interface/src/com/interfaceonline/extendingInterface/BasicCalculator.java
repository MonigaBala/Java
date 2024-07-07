package com.interfaceonline.extendingInterface;

/**
 * BasicCalculator is a class which implements the interface Calculator and the
 * methods in interface are overridden as it is implemented by this class .
 * 
 * @author Moniga
 */
public class BasicCalculator implements Calculator {

	// Overridden method which adds to two numbers and print it .
	@Override
	public void add(int a, int b) {
		System.out.println("Sum : " + (a + b));
	}

// Overridden method to subtract two numbers .
	@Override
	public void subtract(int a, int b) {
		System.out.println("Difference : " + (a - b));
	}

// Overridden method to multiply two numbers .
	@Override
	public void multiply(int a, int b) {
		System.out.println("Product : " + (a * b));
	}

// Overridden method to divide two numbers and print the result .
	@Override
	public void division(int a, int b) {
		System.out.println("Division : " + (a / b));
	}
}
