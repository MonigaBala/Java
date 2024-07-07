package RegistrationChecking;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Class named Registration has a String[] array populated with names and the
 * STD input is used to check with the names using ArrayList.
 * 
 * @author Moniga
 */
public class Registration {

	public static void main(String[] args) {

		// Declaration of String[] array with values.
		String[] users = { "Moniga", "Arun", "Bala", "Linga" };

		Scanner scanner = new Scanner(System.in);
		// Using Scanner class to get user input.
		System.out.println("Enter name to register : ");
		String name = scanner.nextLine();

		// Converting the array into list by Arrays.asList(array_name).
		List<String> list = Arrays.asList(users);

		// The list is checked with the user input name using (.contains() method).
		if (list.contains(name)) {
			System.out.println("Name is not unique");
		} else {
			System.out.println("You are registered");
		}
		scanner.close();
	}

}
