package com.interfaceonline.extendingInterface;

/**
 * CalculatorMain is the main class where execution begins and the objects are
 * created for various interfaces and classes to invoke the methods.
 * 
 * @author Moniga
 */
public class CalculatorMain {

	public static void main(String[] args) {

		Calculator calc = new BasicCalculator(); // Interface reference=Implementation object .

		// As the object is created for implemented interface ,the overridden methods of
		// interface can be invoked .
		calc.add(20, 10);
		calc.subtract(20, 10);
		calc.multiply(20, 10);
		calc.division(20, 10);

		System.out.println();

		calc = new AdvanceCalculator(); // As the AdvanceCalculator extends BasicCalculator,same reference (calc) is
										// used to create object.

		// In this case,the reference used is same for the BasicCalculator,so it
		// implements only the Calculator interface .So the same four methods only can
		// be invoked .
		calc.add(6, 4);
		calc.subtract(6, 4);
		calc.multiply(6, 4);
		calc.division(6, 4);

		System.out.println();

		ScientificCalculator scientificCalc = new AdvanceCalculator();// To invoke the method of ScientificCalculator
																		// interface which is a subinterface of
																		// Calculator,the instance is created for
																		// SubInterface and not SuperInterface.
		// In this case, as the method square() is implemented in AdvanceCalculator it
		// can also be invoked and other methods are also invoked .
		scientificCalc.add(300, 200);
		scientificCalc.subtract(300, 200);
		scientificCalc.multiply(300, 200);
		scientificCalc.division(300, 200);
		scientificCalc.square(10);

	}
}
