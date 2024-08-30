package com.javapractice.datastructures.javamap;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> phoneBook = new HashMap<>();
		System.out.println("Enter the number of entries in the phone book: ");
		int numberOfEntries = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < numberOfEntries; i++) {
			System.out.println("Enter the name of entry " + (i + 1));
			String name = scanner.nextLine();
			System.out.println("Enter the corresponding phone number of entry :");
			String phoneNumber = scanner.nextLine();
			phoneBook.put(name, phoneNumber);
		}
		System.out.println("Enter the name to be searched : ");
		while (scanner.hasNext()) {
			String query = scanner.nextLine();
			if (phoneBook.containsKey(query)) {
				System.out.println(query + " = " + phoneBook.get(query));
			} else {
				System.out.println("Not found");
			}
		}
		scanner.close();
	}

}
