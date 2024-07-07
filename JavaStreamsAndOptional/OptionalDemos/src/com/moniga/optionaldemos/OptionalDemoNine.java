package com.moniga.optionaldemos;

/**
 * Demonstration of Optional.equals(Object o) method.
 * @author MonigaBalasubramanian
 *
 */
import java.util.Optional;

public class OptionalDemoNine {

	public static void main(String[] args) {

		Optional<Integer> optionalIntegerOne = Optional.ofNullable(123);
		System.out.println("Optional 1: " + optionalIntegerOne);

		Optional<Integer> optionalIntegerTwo = Optional.of(123);
		System.out.println("Optional 2: " + optionalIntegerTwo);
		// Optional.equals(Object o) will returns a boolean value by comparing the two
		// Optional instances.
		System.out.println("Comparing Optional 1 and Optional 2... Are they equal? "
				+ optionalIntegerOne.equals(optionalIntegerTwo));
		System.out.println();
		Optional<String> optionalStringOne = Optional.ofNullable("Moniga");
		System.out.println("Optional 1: " + optionalStringOne);
		Optional<String> optionalStringTwo = Optional.ofNullable("Arun");
		System.out.println("Optional 2: " + optionalStringTwo);

		System.out.println(
				"Comparing Optional 1 and Optional 2.. Are they equal? " + optionalStringOne.equals(optionalStringTwo));

	}

}
