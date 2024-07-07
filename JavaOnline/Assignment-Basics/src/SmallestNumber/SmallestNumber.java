package SmallestNumber;

import java.util.Scanner;

/**
 * Class to find smallest number among three integers using short circuit AND
 * operator.
 * 
 * @author Moniga
 */
public class SmallestNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		int a = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int b = scanner.nextInt();
		System.out.println("Enter the third number : ");
		int c = scanner.nextInt();
		scanner.close();

		int smallestNum = toCheckSmallestNumber(a, b, c);
		System.out.println("The smallest number is : " + smallestNum);
	}

	public static int toCheckSmallestNumber(int a, int b, int c) {
		int smallestNumber = 0;

		if (a < b && a < c) {
			smallestNumber = a;
		} else if (b < c && b < a) {
			smallestNumber = b;
		} else {
			smallestNumber = c;
		}
		return smallestNumber;

	}

}
