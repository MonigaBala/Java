package com.interfaceonline.implDemoTwo;

/**
 * Manager class that is a subclass of Employee and implements the interface
 * Recreation.The methods are overriden.
 * 
 * @author Moniga
 */
public class Manager extends Employee implements Recreation {

	public Manager(String name, double salary) {
		super(name, salary);
	}

	@Override
	public void theatreClub() {
		System.out.println("Standup comedy weekend");
	}

	@Override
	public void musicClub() {
		System.out.println("Weekend music party");
	}

}
