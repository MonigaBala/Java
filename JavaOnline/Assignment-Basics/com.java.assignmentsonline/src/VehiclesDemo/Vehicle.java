package VehiclesDemo;

public class Vehicle {

	private String name;
	private String model;
	private int price;

	public Vehicle(String name, String model, int price) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
	}

	public void getDetails() {
		System.out.println("The name of the vehicle is: " + name);
		System.out.println("The model of the vehicle is: " + model);
		System.out.println("The price of the vehicle is: " + price);

	}

}
