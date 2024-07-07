package FirstAssignment;

import java.util.Scanner;

public class ShortcircuitANDOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOne = scanner.nextInt();
		int numberTwo = scanner.nextInt();
		int numberThree = scanner.nextInt();
		if (numberOne < numberTwo && numberOne < numberThree) {
			System.out.println("Smallest number is: " + numberOne);
		} else if (numberTwo < numberThree) {
			System.out.println("Smallest number is: " + numberTwo);
		} else {
			System.out.println("Smallest number is: " + numberThree);
		}
		scanner.close();
	}

}
