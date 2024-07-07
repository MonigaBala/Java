package com.interfaceonline.defaultMethodsInterface;

/**
 * DefaultMain is the main class and the object is created for Manager class
 * using interface reference .
 * 
 * @author Moniga
 */
public class DefaultMain {

	public static void main(String[] args) {

		BonusCalculator manager = new Manager();

		manager.calcBonus(100);

		manager.greetMessage(); // This will first go and check in the overridden message in the Manager class .

	}

}
