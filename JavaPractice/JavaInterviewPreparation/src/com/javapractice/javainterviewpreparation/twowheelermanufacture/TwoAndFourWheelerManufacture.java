package com.javapractice.javainterviewpreparation.twowheelermanufacture;

import java.util.Scanner;

public class TwoAndFourWheelerManufacture {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total number of vechicles V : ");
		int V = scanner.nextInt();
		System.out.println("Enter the total number of wheels : ");
		int W = scanner.nextInt();
		if (W % 2 != 0 || V >= W || V < 2 || W < 2) {
			System.out.println("INVALID INPUT");
		}
		int FW = (W - (2 * V)) / 2;
		int TW = V - FW;
		if (FW >= 0 && TW >= 0) {
			System.out.println("TW = " + TW + " FW = " + FW);
		} else {
			System.out.println("INVALID INPUT");
		}
		scanner.close();
	}

}
