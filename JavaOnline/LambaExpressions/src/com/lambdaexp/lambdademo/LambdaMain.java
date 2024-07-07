package com.lambdaexp.lambdademo;

/**
 * LambdaMain is the main class with object of Checker class and using the
 * lambda expression, the findTotal() method is written here. Note :
 * LambdaExpressions can only be used with Functional interfaces
 * (Runnable,Comparable,Comparator) .
 * 
 * @author Moniga
 */
public class LambdaMain {

	public static void main(String[] args) {

		Checker checker = new Checker();
		
		checker.findTotal((x, y) -> {
			System.out.println("Using Lambda");
			return (x + y);
		}, 20, 30);

	}
}
