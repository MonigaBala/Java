package com.interfaceonline.defaultMethodsInterface;

/**
 * Manager class implements two interfaces and the abstract and default method
 * should be overridden here .
 * 
 * @author Moniga
 */
public class Manager implements BonusCalculator, IncrementCalculator {

	@Override
	public void calcBonus(int x) {
		System.out.println("Bonus : " + x);
	}

	// At the time of object creation to this Manager class,if greetMessage() method
	// is invoked ,then the flow will first jumps here .
	@Override
	public void greetMessage() {
		System.out.println("In Manager");
		BonusCalculator.super.greetMessage();
		IncrementCalculator.super.greetMessage();
	}

	@Override
	public void calcBonus(int x, int y) {
		
	}
}
