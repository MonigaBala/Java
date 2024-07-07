package com.interfaceonline.implDemoTwo;

/**
 * Programmer class which extends Employee and implements two interfaces to use
 * the abstract methods specifically .
 * 
 * @author Moniga
 */
public class Programmer extends Employee implements Recreation, Gamer {

	public Programmer(String name, double salary) {
		super(name, salary);
	}

	@Override
	public void outdoorGames() {
		System.out.println("Cricket and FootBall");
	}

	@Override
	public void indoorGames() {
		System.out.println("Chess and TableTennis");
	}

	@Override
	public void theatreClub() {
		System.out.println("Standup comedy weekend");
	}

	@Override
	public void musicClub() {
		System.out.println("Music night weekend");
	}

}
