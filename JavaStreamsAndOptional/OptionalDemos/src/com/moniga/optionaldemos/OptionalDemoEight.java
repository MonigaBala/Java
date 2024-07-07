package com.moniga.optionaldemos;

/**
 * Demonstration of Optional.toString() method.
 * @MonigaBalasubaramanian
 */
import java.util.Optional;

public class OptionalDemoEight {

	public static void main(String[] args) {

		Optional<Integer> optionalInteger = Optional.ofNullable(45378);
		System.out.println("Optional: " + optionalInteger);
		// Optional.toString() method returns String value.
		String value = optionalInteger.toString();
		System.out.println("String representation: " + value);

		System.out.println();

		Optional<String> optionalString = Optional.empty();
		System.out.println("Optional: " + optionalString);
		String value1 = optionalString.toString();
		System.out.println("String representation: " + value1);

	}

}
