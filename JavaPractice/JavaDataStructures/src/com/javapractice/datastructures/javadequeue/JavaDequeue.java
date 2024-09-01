package com.javapractice.datastructures.javadequeue;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaDequeue {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of integers: ");
		int n = scanner.nextInt();
		System.out.println("Enter the size of the subarray: ");
		int m = scanner.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {

			arr[i] = scanner.nextInt();
		}

		scanner.close();

		Set<Integer> window = new HashSet<>();
		int maxUniqueCount = 0;

		for (int i = 0; i <= n - m; i++) {
			window.clear();

			for (int j = i; j < i + m; j++) {
				window.add(arr[j]);
			}

			maxUniqueCount = Math.max(maxUniqueCount, window.size());
		}

		System.out.println(maxUniqueCount);

	}
}
