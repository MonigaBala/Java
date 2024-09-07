package com.javapractice.javainterviewpreparation.printwithoddletters;

public class PrintWithOddLetters {

	public static void main(String[] args) {

		String word = "PROGRAM";
		int length = word.length();

		for (int i = 0; i < length / 2 + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print(word.charAt(i));
			for (int j = 0; j < length - 2 * (i + 1); j++) {
				System.out.print(" ");
			}
			if (i != length / 2) {
				System.out.print(word.charAt(length - 1 - i));
			}
			System.out.println();
		}

		for (int i = length / 2 - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print(word.charAt(i));
			for (int j = 0; j < length - 2 * (i + 1); j++) {
				System.out.print(" ");
			}
			System.out.print(word.charAt(length - 1 - i));
			System.out.println();
		}

	}

}
