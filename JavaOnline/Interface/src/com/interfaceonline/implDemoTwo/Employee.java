package com.interfaceonline.implDemoTwo;

/**
 * Superclass of Manager and Programmer which implements the interface
 * BonusCalculator that will be common to both the subclasses. Constructor is
 * overloaded to initialize instance variables. And it has its own method which
 * will be executed by its own object .
 * 
 * @author Moniga
 */
public class Employee implements BonusCalculator {

	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	void getDetails() {
		System.out.println("Name " + name);
		System.out.println("Salary " + salary);
	}

	@Override
	public void calculateBonus() {
		System.out.println("Bonus for everyone");
	}

}
