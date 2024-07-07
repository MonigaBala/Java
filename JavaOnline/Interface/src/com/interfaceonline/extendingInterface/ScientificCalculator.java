package com.interfaceonline.extendingInterface;

/**
 * Interface ScientificCalculator which extends interface Calculator and has a
 * own abstract method square() will inherit the methods from the parentclass .
 * 
 * @author Moniga
 */
public interface ScientificCalculator extends Calculator {
	void square(int a);

}
