package OneDimensionalArray;

import java.util.Scanner;

public class OneDimensionalArray {

	public static void main(String[] args) {
		int array[] = new int[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the elements in the array : ");
		int sum = 0;
		float average = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			sum += array[i];
			average = average + array[i] / array.length;

		}
		System.out.println("Sum of the elements: " + sum);
		System.out.println("Average of the elements : " + average);
		scanner.close();

	}
}
