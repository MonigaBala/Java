package com.javabook.Chapterone;

/**
 * To match the particular output,below code is written.
 * 
 * @author Moniga
 */
public class MixedMessageChapterOne {
	public static void main(String[] args) {

		// Initialization
		int x = 0;
		int y = 0;

		while (x < 5) {
			y = y + 2; // Filling these blocks to

			if (y > 4) { // match the given outputs
				y = y - 1;
			}
			System.out.println(x + " " + y);

			// Incrementing the value by 1
			x = x + 1;
		}
	}
}
