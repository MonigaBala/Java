package com.interfaceonline.defaultMethodsInterface;

/**
 * BonusCalculator is an interface with a abstract method calcBonus() and
 * default method greetMessage() which is common for all its implementations .
 * 
 * @author Moniga
 */
public interface BonusCalculator {

	void calcBonus(int x);

	// This method should be declared using "default"keyword and if any of the
	// interface has the same default method ,then the implementing class should
	// override it .
	default void greetMessage() {
		System.out.println("Have a good day");
	}
}