package com.javapractice.datastructures.javahashset;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of inputs : ");
		int numberOfInputs = scanner.nextInt();
		scanner.nextLine();

		HashSet<String> uniquePairs = new HashSet<>();

		for (int i = 0; i < numberOfInputs; i++) {
			System.out.println("Enter the word One : ");
			String wordOne = scanner.nextLine();
			System.out.println("Enter the word Two : ");
			String wordTwo = scanner.nextLine();
			String pair = wordOne + " " + wordTwo;
			uniquePairs.add(pair);
			System.out.println(uniquePairs.size());
		}
		scanner.close();
	}

}
