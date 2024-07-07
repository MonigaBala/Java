package com.moniga.optionaldemos;

/**
 * Demonstration of Optional.orElseGet(Supplier<>) method.
 * @MonigaBalasubramanian
 */
import java.util.Optional;

public class OptionalDemoSix {

	public static void main(String[] args) {

		Optional<Integer> optionalInteger = Optional.of(3692);
		System.out.println("Optional: " + optionalInteger);

		// This will result with the Optional value present in the Optional.
		System.out
				.println("Value by orElseGet() method: " + optionalInteger.orElseGet(() -> (int) (Math.random() * 10)));

		System.out.println();

		Optional<Integer> optionalIntegerTwo = Optional.empty();
		System.out.println("Optinonal: " + optionalIntegerTwo);

		// This will return with the Supplier given in the Optional.orElseGet(Supplier<>
		// ) method.
		// Because there is null value in the Optional.
		System.out.println(
				"Value by orElseGet() method: " + optionalIntegerTwo.orElseGet(() -> (int) (Math.random() * 10)));

	}

}
