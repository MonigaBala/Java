package com.javapractice.javainterviewpreparation.grandchildrencount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GrandChildrenCount {

	public static void main(String[] args) {

		String[][] relations = { { "luke", "shaw" }, { "wayne", "rooney" }, { "rooney", "ronaldo" },
				{ "shaw", "rooney" } };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the target name : ");
		String target = scanner.nextLine();
		System.out.println("Number of grandchildren of " + target + ": " + findGrandchildren(relations, target));
		scanner.close();
	}

	public static int findGrandchildren(String[][] relations, String target) {
		Map<String, List<String>> parentChildMap = new HashMap<>();

		for (String[] relation : relations) {
			String child = relation[0];
			String parent = relation[1];
			parentChildMap.computeIfAbsent(parent, k -> new ArrayList<>()).add(child);
		}

		int grandchildrenCount = 0;

		List<String> children = parentChildMap.getOrDefault(target, new ArrayList<>());

		for (String child : children) {
			grandchildrenCount += parentChildMap.getOrDefault(child, new ArrayList<>()).size();
		}

		return grandchildrenCount;
	}

}
