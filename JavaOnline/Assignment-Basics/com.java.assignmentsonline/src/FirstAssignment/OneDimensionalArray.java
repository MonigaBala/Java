package FirstAssignment;

import java.util.Scanner;

public class OneDimensionalArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int sum = 0;
		double average = 0.0;
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		for (int ele : array) {
			sum += ele;
		}
		average = sum / size;
		System.out.println("Sum is: " + sum);
		System.out.println("Average is: " + average);
		scanner.close();
	}

}
