package com.javapractice.javainterviewpreparation.paranthesischecker;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesisChecker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to be checked : ");
		String input = scanner.nextLine();
		System.out.println(isBalanced(input) ? "true" : false);
		scanner.close();
	}

	public static boolean isBalanced(String x) {
		// Stack to store the opening brackets
		Stack<Character> stack = new Stack<>();

		// Traverse through each character of the string
		for (int i = 0; i < x.length(); i++) {
			char ch = x.charAt(i);

			// Push opening brackets onto the stack
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			}
			// Check if closing brackets match with the top of the stack
			else if (ch == '}' || ch == ']' || ch == ')') {
				// If stack is empty or the brackets don't match, return false
				if (stack.isEmpty()) {
					return false;
				}

				char top = stack.pop();
				if (!isMatchingPair(top, ch)) {
					return false;
				}
			}
		}

		// If stack is empty, the expression is balanced, otherwise it's not
		return stack.isEmpty();
	}

	// Helper function to check if the opening and closing brackets match
	private static boolean isMatchingPair(char open, char close) {
		return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
	}
}
