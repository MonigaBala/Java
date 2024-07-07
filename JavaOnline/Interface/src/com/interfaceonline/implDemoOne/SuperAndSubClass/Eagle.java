package com.interfaceonline.implDemoOne.SuperAndSubClass;

import com.interfaceonline.implDemoOne.Interfaces.Flyable;

/**
 * Subclass Eagle extends Bird and also implements interface Flyable to get
 * their functionalities overriden.
 * 
 * @author Moniga
 */
public class Eagle extends Bird implements Flyable {

	public Eagle(String name) { // Constructor overloading as parent class Bird has a parameterized constructor.
		super(name);
	}

	@Override
	public void fly() { // Overriding the abstract method of interface Flyable .
		System.out.println(name + " flies very high");
	}
}
