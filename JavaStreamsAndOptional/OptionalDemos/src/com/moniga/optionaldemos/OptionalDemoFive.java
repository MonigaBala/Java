package com.moniga.optionaldemos;

/**
 * Demonstration of Optional.ifPresentOrElse(Consumer <? super Integer> action, Runnable emptyAction) method.
 * @MonigaBalasubramanian
 */
import java.util.Optional;

public class OptionalDemoFive {

	public static void main(String[] args) {

		Optional<Integer> optionalInteger = Optional.ofNullable(2678);
		System.out.println("Optional: " + optionalInteger);

		// The Optional.ifPresentOrElse(Consumer <? super Integer> action, Runnable
		// emptyAction) method will accepts two parameters,
		// 1) action 2) emptyAction and will not return any value.
		optionalInteger.ifPresentOrElse((value) -> {
			System.out.println("Value is present, its: " + value);
		}, () -> {
			System.out.println("Value is empty");
		});

		System.out.println();

		Optional<String> optionalString = Optional.empty();
		System.out.println("Optional: " + optionalString);

		// Here, the Optional is an empty and it doesn't has any value. Hence, the
		// second parameter emptyAction will be executed.
		optionalString.ifPresentOrElse((str) -> {
			System.out.println("String is present, its length is: " + str.length());
		}, () -> {
			System.out.println("String is not present, length of the String is zero.");
		});

	}

}
