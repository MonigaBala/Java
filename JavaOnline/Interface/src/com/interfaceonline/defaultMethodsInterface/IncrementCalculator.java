package com.interfaceonline.defaultMethodsInterface;

/**
 * Interface IncrementCalculator has the same abstract method in BonusCalculator
 * interface and the same default method in BonusCalculator .
 * 
 * @author Moniga
 */
public interface IncrementCalculator {

	void calcBonus(int x, int y);

	default void greetMessage() {
		System.out.println("Good Bye");
	}
}
