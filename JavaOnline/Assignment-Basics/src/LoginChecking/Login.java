package LoginChecking;

import java.util.Scanner;

/**
 * class Login has a String[] populated with userNames and a user input is
 * checked with the array for login or not.
 * 
 * @author Moniga
 */
public class Login {

	public static void main(String[] args) {

		// Declaration of a String[] array and the values are declared.
		String[] userNames = { "Priya", "Ram", "Sam", "Suba" };

		// The user input is get using Scanner class to check with the array.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username to login : ");
		String name = scanner.nextLine();

		// A flag variable is used here to make the result more particular.
		int flag = 0;
		for (String var : userNames) { // ForEach loop is used to iterate over the userNames[] with the user input
										// "name" .
			if (name.equals(var)) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("You are logged in successfully");
		} else {
			System.out.println("Invalid username");
		}
		scanner.close();
	}
}
