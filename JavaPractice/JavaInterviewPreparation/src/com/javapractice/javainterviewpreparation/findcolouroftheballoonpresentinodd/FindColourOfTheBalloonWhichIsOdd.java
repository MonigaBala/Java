package com.javapractice.javainterviewpreparation.findcolouroftheballoonpresentinodd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindColourOfTheBalloonWhichIsOdd {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the number of balloons : ");
			int N = scanner.nextInt();
			scanner.nextLine();

			String[] balloons = new String[N];
			for (int i = 0; i < N; i++) {
				balloons[i] = scanner.nextLine().trim();
			}

			Map<String, Integer> colorCount = new HashMap<>();

			for (String color : balloons) {
				colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
			}

			for (String color : balloons) {
				if (colorCount.get(color) % 2 != 0) {
					System.out.println(color);
					return;
				}
			}

			System.out.println("All are even");
		}

	}

}
