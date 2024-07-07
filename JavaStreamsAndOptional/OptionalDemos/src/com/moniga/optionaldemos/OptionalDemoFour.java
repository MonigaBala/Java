package com.moniga.optionaldemos;

/**
 * Demonstration of Optional.orElse(T value) method.
 * @MonigaBalasubramanian
 */
import java.util.Optional;

public class OptionalDemoFour {

	public static void main(String[] args) {

		// Demonstration of Optional.orElse(T other) method.
		Optional<Integer> optionalInteger = Optional.ofNullable(3289);
		System.out.println("Optional value for given integer: " + optionalInteger);

		// The following code will return an Optional value if a value is present, else
		// with the parameter passed to the orElse(T other) method.
		System.out.println("Value by orElse() method: " + optionalInteger.orElse(3400));

		Optional<String> optionalString = Optional.ofNullable(null);
		System.out.println("Optional value for given String: " + optionalString);

		// In this case, the orElse(T other) method will returns the Optional value as
		// other because the value is empty or null.
		System.out.println("Value by orElse() method: " + optionalString.orElse("Moniga"));

	}

}
