package EmployeeOverloadingDemo;

public class Employee {
	private String name;
	private String designation;

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

	double bonus = 0.0;

	public double calcBonus(double basicAllowance) {
		bonus += basicAllowance;
		return bonus;
	}

	public double calcBonus(double basicAllowance, double carAllowance) {
		bonus += basicAllowance + carAllowance;
		return bonus;
	}

	public double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		bonus += basicAllowance + carAllowance + houseAllowance;
		return bonus;
	}

}
