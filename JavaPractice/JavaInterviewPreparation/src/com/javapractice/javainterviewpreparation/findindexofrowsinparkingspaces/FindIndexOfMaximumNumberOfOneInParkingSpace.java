package com.javapractice.javainterviewpreparation.findindexofrowsinparkingspaces;

import java.util.Scanner;

public class FindIndexOfMaximumNumberOfOneInParkingSpace {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the row : ");
		int row = scanner.nextInt();
		System.out.println("Enter the length of the column : ");
		int column = scanner.nextInt();
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		int maxRowIndex = -1;
		int maxOnesCount = -1;
		for (int r = 0; r < row; r++) {
			int countOnes = 0;
			for (int c = 0; c < column; c++) {
				if (matrix[r][c] == 1) {
					countOnes++;
				}
			}
			if (countOnes > maxOnesCount) {
				maxOnesCount = countOnes;
				maxRowIndex = r + 1;
			}
		}

		System.out.println(maxRowIndex);
		scanner.close();
	}

}
