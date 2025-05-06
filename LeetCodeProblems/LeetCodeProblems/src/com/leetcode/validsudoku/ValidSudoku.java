package com.leetcode.validsudoku;

import java.util.HashSet;
import java.util.Scanner;

public class ValidSudoku {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the board: ");
		int size = scanner.nextInt();
		char[][] board = new char[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				board[i][j] = scanner.next().charAt(0);
			}
		}
		System.out.println("Is valid Sudoku: " + isValidSudoku(board));
		scanner.close();
	}

	public static boolean isValidSudoku(char[][] board) {
		int N = 9;
		HashSet<Character>[] rows = new HashSet[N];
		HashSet<Character>[] col = new HashSet[N];
		HashSet<Character>[] boxes = new HashSet[N];
		for (int r = 0; r < N; r++) {
			rows[r] = new HashSet<Character>();
			col[r] = new HashSet<Character>();
			boxes[r] = new HashSet<Character>();
		}
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				char val = board[r][c];
				if (val == '.') {
					continue;
				}
				if (rows[r].contains(val)) {
					return false;
				}
				rows[r].add(val);

				if (col[c].contains(val)) {
					return false;
				}
				col[c].add(val);

				int idx = (r / 3) * 3 + c / 3;
				if (boxes[idx].contains(val)) {
					return false;
				}
				boxes[idx].add(val);
			}
		}
		return true;
	}
}
