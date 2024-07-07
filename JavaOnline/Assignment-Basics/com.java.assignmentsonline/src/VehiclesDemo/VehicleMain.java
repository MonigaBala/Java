package VehiclesDemo;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Car", "BMW", 1000000);
		Vehicle vehicle1 = new Vehicle("Bike", "HeroHonda", 50000);
		vehicle.getDetails();
		vehicle1.getDetails();
	}

}
