package GreatestNumber;

/**
 * Class to find GreatestNumber of given three integers using ternary
 * operator(condition?true:false).
 * 
 * @author Moniga
 */
public class GreatestNumber {

	public static void main(String[] args) {
		// Declaration of variables with values.
		int numberOne = 20;
		int numberTwo = 30;
		int numberThree = 40;

		// Ternary operator(condition?true:false) is used in this case to find the
		// greatest of three integers also everything are nested with other ternary
		// condition as three numbers are compared one another.

		int greatestNumber = (numberOne > numberTwo) ? (numberOne > numberThree ? numberOne : numberThree)
				: (numberTwo > numberThree ? numberTwo : numberThree);

		System.out.println("Greates number among the three integer is : " + greatestNumber);
	}
}
