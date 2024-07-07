package com.interfaceonline.implDemoTwo;

/**
 * Main class where the program gets executed and the object is created for
 * different classes and interface by down casting and the implementation of all
 * the methods are coded.
 * 
 * @author Moniga
 */
public class EmployeeMain {

	public static void main(String[] args) {

		Employee manager = new Manager("Ram", 2000);
		manager.getDetails();

		Recreation recreation = (Recreation) manager;
		recreation.musicClub();
		recreation.theatreClub();

		System.out.println(Recreation.PROVIDER);

		Employee programmer = new Programmer("Sam", 4000);
		programmer.getDetails();

		recreation = (Recreation) programmer;
		recreation.musicClub();
		recreation.theatreClub();

		Gamer gamer = (Gamer) programmer;
		gamer.indoorGames();
		gamer.outdoorGames();

		BonusCalculator bonus = (BonusCalculator) programmer;
		bonus.calculateBonus();

		Manager managerTwo = new Manager("Moni", 3000);
		managerTwo.calculateBonus();

	}

}
