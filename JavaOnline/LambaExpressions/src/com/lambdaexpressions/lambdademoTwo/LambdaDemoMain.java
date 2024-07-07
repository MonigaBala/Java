package com.lambdaexpressions.lambdademoTwo;

import java.util.ArrayList;

public class LambdaDemoMain {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		Employee empOne = new Employee("Moniga", "Chennai");
		Employee empTwo = new Employee("Arun", "Coimbatore");
		Employee empThree = new Employee("Priya", "Salem");
		Employee empFour = new Employee("Bala", "Srivilliputtur");
		Employee empFive = new Employee("Linga", "Madurai");

		list.add(empFive);
		list.add(empFour);
		list.add(empThree);
		list.add(empThree);
		list.add(empTwo);
		list.add(empOne);
		System.out.println(list);
		

	}

}
