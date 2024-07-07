package com.interfaceonline.implDemoOne.SuperAndSubClass;

/**
 * Bird class is a Super class to two subclasses with its own method
 * printName(), Overloaded constructor .
 * 
 * @author Moniga
 */
public class Bird {
	String name; // Declaring instance variable .

	public Bird(String name) { // Constructor has overloaded to initialize the instance variable .
		super();
		this.name = name;
	}

	public void printName() { // Own method of Bird class .
		System.out.println("Name : " + name);
	}

}
