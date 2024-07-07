package com.moniga.methodreferences.instancemethodofarbitaryobjectreference;

/** Instance type method reference to sort with custom comparator.
 * @author MonigaBalasubramanian
 * 
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArbitaryObjectInstanceMethodReference {

	public static void main(String[] args) {

		List<String> coloursList = Arrays.asList("Red", "Green", "Yellow", "Blue", "Black");

		// Method reference to String type.
		Collections.sort(coloursList, String::compareToIgnoreCase);

		// Printing each elements in the console.
		coloursList.forEach(System.out::println);

	}

}
