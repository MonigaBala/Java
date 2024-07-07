package FirstAssignment;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] usernames = { "Lily", "Sara", "Teena", "Sita" };
		System.out.println("Enter username to login: ");
		String userInput = scanner.nextLine();
		for (String values : usernames) {
			if (userInput.equals(values)) {
				System.out.println("You are logged in successfully");
				break;
			} else {
				System.out.println("Invalid username");
				break;
			}
		}
		scanner.close();
	}

}
