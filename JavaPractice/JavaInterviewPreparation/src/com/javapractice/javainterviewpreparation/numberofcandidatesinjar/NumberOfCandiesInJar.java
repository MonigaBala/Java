package com.javapractice.javainterviewpreparation.numberofcandidatesinjar;

import java.util.Scanner;

public class NumberOfCandiesInJar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = 10, k = 5;
		System.out.println("Enter the number of candies : ");
		int num = scanner.nextInt();
		if (num >= 1 && num <= k) {
			System.out.println("NUMBER OF CANDIES SOLD : " + num);
			System.out.print("NUMBER OF CANDIES LEFT : " + (n - num));
		} else {
			System.out.println("INVALID INPUT");
			System.out.print("NUMBER OF CANDIES LEFT : " + n);
		}
		scanner.close();

	}

}
