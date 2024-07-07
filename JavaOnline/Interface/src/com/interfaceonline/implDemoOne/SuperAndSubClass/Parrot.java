package com.interfaceonline.implDemoOne.SuperAndSubClass;

import com.interfaceonline.implDemoOne.Interfaces.Flyable;
import com.interfaceonline.implDemoOne.Interfaces.Talkable;

/**
 * Parrot class is a subclass of Bird and it implements both Talkable and
 * Flyable interface to override its abstract methods.
 * 
 * @author Moniga
 */
public class Parrot extends Bird implements Flyable, Talkable {

	public Parrot(String name) { // Constructor overloading as Parent class has parameterized constructor.
		super(name);
	}

	@Override
	public void talk() { // Overriding the abstract method of interface Talkable as it has implemented
							// it.
		System.out.println(name + " repeats what you say");
	}

	@Override
	public void fly() { // Overriding the method in the interface Flyable.
		System.out.println(name + " flies low");
	}

	public void makeSound() { // Own method of Parrot class
		System.out.println(name + " sounds as kiki");
	}
}
