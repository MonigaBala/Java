package FirstAssignment;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String[] usernames = { "Ram", "Sam", "Tom", "Ravi" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a username: ");
		String name = scanner.nextLine();
		for (String ele : usernames) {
			if (name.equalsIgnoreCase(ele)) {
				System.out.println("Name is not unique");
			} else {
				System.out.println("You are registered");
			}
		}
		scanner.close();
	}

}
