package com.javapractice.datastructures.javacomparator.service;

import java.util.Comparator;

import com.javapractice.datastructures.javacomparator.bean.Player;

public class PlayerChecker implements Comparator<Player> {

	@Override
	public int compare(Player a, Player b) {
		if (a.getScore() != b.getScore()) {
			return b.getScore() - a.getScore();
		} else {
			return a.getName().compareTo(b.getName());
		}
	}

}
