package com.moniga.optionaldemos;

/**
 * Creating Empty Optional using Optional.empty() method.
 * @MonigaBalasubramanian
 */
import java.util.Optional;

public class OptionalDemoTwo {

	public static void main(String[] args) {

		// Creating empty Optional using Optional.empty() method.
		Optional<Integer> optionalEmpty = Optional.empty();
		System.out.println("Empty Optional using Optional.empty() method: " + optionalEmpty);

		// Alternate of creating a empty Optional is by using Optional.ofNullable(null)
		// which results the same as Optional.empty().
		// Result will be: Optional.empty
		Optional<String> optionalString = Optional.ofNullable(null);
		System.out.println("Empty OPtional using Optional.ofNullable() method: " + optionalString);
	}
}
