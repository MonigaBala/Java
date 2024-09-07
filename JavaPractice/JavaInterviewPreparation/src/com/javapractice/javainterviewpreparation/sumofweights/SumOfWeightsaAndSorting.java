package com.javapractice.javainterviewpreparation.sumofweights;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfWeightsaAndSorting {

	public static void main(String[] args) {
		int[] numbers = { 10, 36, 54, 89, 12 };
		List<int[]> weightedNumbers = new ArrayList<>();

		for (int num : numbers) {
			int weight = calculateWeight(num);
			weightedNumbers.add(new int[] { num, weight });
		}

		Collections.sort(weightedNumbers, (a, b) -> a[1] - b[1]);

		for (int[] weightedNum : weightedNumbers) {
			System.out.println("<" + weightedNum[0] + ", " + weightedNum[1] + ">");
		}
	}

	public static int calculateWeight(int num) {
		int weight = 0;

		if (isPerfectSquare(num)) {
			weight += 5;
		}

		if (num % 4 == 0 && num % 6 == 0) {
			weight += 4;
		}

		if (num % 2 == 0) {
			weight += 3;
		}

		return weight;
	}

	public static boolean isPerfectSquare(int num) {
		int sqrt = (int) Math.sqrt(num);
		return (sqrt * sqrt == num);
	}

}
