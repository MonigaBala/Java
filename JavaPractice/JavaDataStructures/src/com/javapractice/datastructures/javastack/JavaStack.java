package com.javapractice.datastructures.javastack;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string to check whether it is balanced or unbalanced: ");

		while (scanner.hasNext()) {
			String input = scanner.nextLine();
			System.out.println(isBalanced(input));
		}
	}

	public static boolean isBalanced(String input) {
		Stack<Character> stack = new Stack<>();
		for (char c : input.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if (!matches(top, c)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static boolean matches(char top, char close) {
		return (top == '(' && close == ')') || (top == '{' && close == '}') || (top == '[' && close == ']');
	}
}
