package com.javapractice.javainterviewpreparation.numberofguestsincruise;

import java.util.Scanner;

public class NumberOfGuestsInCruiseWithinTHours {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of T: ");
		int T = scanner.nextInt();
		int[] entry = new int[T];
		int[] leave = new int[T];
		for (int i = 0; i < T; i++) {
			entry[i] = scanner.nextInt();
		}
		for (int i = 0; i < T; i++) {
			leave[i] = scanner.nextInt();
		}
		int current_guests = 0;
		int max_guests = 0;
		for (int i = 0; i < T; i++) {
			current_guests += entry[i] - leave[i];
			if (current_guests > max_guests) {
				max_guests = current_guests;
			}
		}
		System.out.println("The maximum number of guests in the cruise is : " + max_guests);
		scanner.close();
	}

}
