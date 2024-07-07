package FirstAssignment;

import java.util.Scanner;

public class SquareRootOfOneDArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		for (int ele : array) {

			System.out.println("The square root of the array elements is " + Math.sqrt(ele));
		}
		scanner.close();
	}

}
