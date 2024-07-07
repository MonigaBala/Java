package com.moniga.optionaldemos;
/**
 * Creating Optional and demonstration of Optional.ofNullable(T value) method.
 * @author MonigaBalasubramanian
 */
import java.util.Optional;

public class OptionalDemoOne {

	public static void main(String[] args) {

		// Syntax: Optional< T > op_name = Optional.ofNullable(T value);
		// Optional.ofNullable() method returns an Optional with a present value if the
		// specified value is non-null, otherwise an empty Optional.

		Optional<Integer> op1 = Optional.ofNullable(1234);
		System.out.println("Optional 1 of type Integer: " + op1);

		Optional<String> op2 = Optional.ofNullable("Moniga");
		System.out.println("Optional 2 of type String: " + op2);

		// It accepts the null value as a parameter and returns empty Optional.
		Optional<Double> op3 = Optional.ofNullable(null);
		System.out.println("Optional 3 of type Double with empty value: " + op3);
	}

}
