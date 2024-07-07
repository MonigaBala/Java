package com.moniga.optionaldemos;

/**
 * Demonstration of Optional.hashcode() method.
 * @MonigaBalasubramanian
 */
import java.util.Optional;

public class OptionalDemoSeven {

	public static void main(String[] args) {

		// Optional.hashcode() method will return o if there is null or empty value in
		// the Optional instance, else the hashcode value will be returned.
		Optional<Integer> optionalInteger = Optional.of(987);
		System.out.println("Optional: " + optionalInteger);
		System.out.println("Optional Hashcode value: " + optionalInteger.hashCode());
		System.out.println();

		Optional<String> optionalString = Optional.ofNullable("Moniga");
		System.out.println("Optional: " + optionalString);
		System.out.println("Optional Hashcode value: " + optionalString.hashCode());
		System.out.println();

		Optional<String> optionalStringTwo = Optional.empty();
		System.out.println("Optional: " + optionalStringTwo);
		System.out.println("Optional Hashcode value: " + optionalStringTwo.hashCode());

	}

}
