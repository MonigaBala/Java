package com.interfaceonline.extendingInterface;

/**
 * AdvanceCalculator is a subclass of BasicCalculator and is implemented the
 * interface ScientificCalculator .The methods are overridden here.
 * 
 * @author Moniga
 */
public class AdvanceCalculator extends BasicCalculator implements ScientificCalculator {

	/**
	 * As the class extends BasicCalculator it need not override the methods in
	 * ScientificCalculator (it extends the Calculator interface) .
	 */
	@Override
	public void square(int a) {
		System.out.println("Square : " + (a * a));
	}

}
