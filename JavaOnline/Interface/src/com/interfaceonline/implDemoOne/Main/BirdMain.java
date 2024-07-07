package com.interfaceonline.implDemoOne.Main;

import com.interfaceonline.implDemoOne.Interfaces.Flyable;
import com.interfaceonline.implDemoOne.Interfaces.Talkable;
import com.interfaceonline.implDemoOne.SuperAndSubClass.Bird;
import com.interfaceonline.implDemoOne.SuperAndSubClass.Eagle;
import com.interfaceonline.implDemoOne.SuperAndSubClass.Parrot;

/**
 * Main class to create instance for both subclasses Eagle and Parrot with
 * invoking overriden methods of interface they implemented and also their own
 * methods .
 * 
 * @author Moniga
 */
public class BirdMain {

	public static void main(String[] args) {

		Bird bird = new Eagle("Eagle"); // Creating Superclass reference= Subclass object.
		bird.printName();

		Flyable fly = (Flyable) bird; // Creating Interface reference =Implementation object,here new Eagle("Eagle")
										// object refers to both superclass and interface so it is downcasted
										// ->(interfacename) reference .
		fly.fly();

		bird = new Parrot("Parrot"); // Creating object for Parrot class using Superclass Bird reference .
		bird.printName();

		fly = (Flyable) bird; // Interface ref=(interface) superclassReference .i.e.,bird refers to new
								// Parrot("Parrot") object .
		fly.fly();

		Talkable talkable = (Talkable) bird; // Downcasting the superclass into interface .
		talkable.talk();

		Parrot parrot = (Parrot) bird; // To access the own method of Parrot, the object is created for its own class
		parrot.makeSound();
	}

}
