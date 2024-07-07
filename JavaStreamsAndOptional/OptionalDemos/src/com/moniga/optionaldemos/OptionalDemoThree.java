package com.moniga.optionaldemos;

/**
 * Filtering the Optional values using Optional.filter(Predicate<>) method.
 * @MonigaBalasubramanian
 */
import java.util.Optional;

public class OptionalDemoThree {

	public static void main(String[] args) {

		// Create an Optional
		Optional<Integer> optionalInteger = Optional.ofNullable(6758);

		// Prints the value.
		System.out.println("Optional value for given integer: " + optionalInteger);

		// Filter the Optional value using Optional.filter(Predicate<>).
		System.out.println("Filtered value for odd or even: " + optionalInteger.filter(num -> num % 2 == 0));

		Optional<Double> optionalDouble = Optional.ofNullable(45.67);
		System.out.println("Optional value for given double: " + optionalDouble);

		// Filter the Optional value and if it does not satisfy the predicate, will
		// returns with an empty Optional [ Optional.empty] .
		System.out.println("Filtered value for double or not: " + optionalDouble.filter(num -> num > 50.00));

		Optional<String> optionalString = Optional.ofNullable("Moniga");
		System.out.println("Optional value for given String: " + optionalString);

		// Filter the Optional value if it satisfies the following predicate else will
		// returns an empty Optional.
		System.out.println("Filtered value for String based on its length not more than 7: "
				+ optionalString.filter(str -> str.length() > 7));

	}

}
