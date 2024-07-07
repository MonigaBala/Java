package com.javabook.Chapterone;

/**
 * Match the suitable code blocks in given blanks for the given output.
 * 
 * @author Moniga
 */
public class PoolPuzzleChapterOne {

	public static void main(String[] args) {

		int x = 0; // Initialization

// Given output is
// a noise x=0
// annoys x=1
// an oyster x=2
		while (x < 4) {
			System.out.print("a");
			if (x < 1) {
				System.out.print(" ");
			}
			System.out.print("n");
			if (x > 1) {
				System.out.print(" oyster");
				x = x + 2;
			}
			if (x == 1) {
				System.out.print("noys");
			}
			if (x < 1) {
				System.out.print("oise");
			}

			System.out.println();
			x = x + 1; // Incrementing the value

		}
	}

}
