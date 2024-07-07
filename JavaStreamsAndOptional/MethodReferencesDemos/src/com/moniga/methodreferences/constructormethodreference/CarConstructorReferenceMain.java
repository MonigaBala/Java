package com.moniga.methodreferences.constructormethodreference;

public class CarConstructorReferenceMain {

	public static void main(String[] args) {

		// Using a constructor reference to create a Car object
		CarFactory carFactory = Car::new;

		// Creating a Car object using the factory
		Car car = carFactory.create("Toyota Camry", 2023);

		// Displaying the car details
		car.display();

	}

}
