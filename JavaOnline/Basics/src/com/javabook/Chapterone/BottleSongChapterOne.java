package com.javabook.Chapterone;

/**
 * Prints the Bottle song using while loop.
 * @author Moniga
 */
public class BottleSongChapterOne {

	public static void main(String[] args) {

		int bottlesNum = 10;
		String word = "Bottles";

		while (bottlesNum > 0) {

			if (bottlesNum == 1) {
				word = "Bottle";
			}

			System.out.println(bottlesNum + " green " + word + " hanging on the wall");
			System.out.println(bottlesNum + " green " + word + " hanging on the wall");
			System.out.println("And if one green bottle should accidently fall,");

			bottlesNum = bottlesNum - 1;

			if (bottlesNum > 0) {
				System.out.println("There will be " + bottlesNum + " green" + word + " hanging on the wall");
			} else {
				System.out.println("There will be no green bottles,hanging on the wall");
			}

		}
	}

}
