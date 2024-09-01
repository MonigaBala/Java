package com.javapractice.datastructures.javacomparator;

import java.util.Arrays;
import java.util.Scanner;

import com.javapractice.datastructures.javacomparator.bean.Player;
import com.javapractice.datastructures.javacomparator.service.PlayerChecker;

public class JavaComparator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of players : ");
		int n = scanner.nextInt();
		Player[] players = new Player[n];

		for (int i = 0; i < n; i++) {
			players[i] = new Player(scanner.next(), scanner.nextInt());
		}
		scanner.close();

		Arrays.sort(players, new PlayerChecker());

		for (Player player : players) {
			System.out.println(player.getName() + " " + player.getScore());
		}
	}

}
