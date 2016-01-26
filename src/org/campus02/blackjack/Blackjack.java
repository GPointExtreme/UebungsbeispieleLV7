package org.campus02.blackjack;

import java.util.HashMap;

public class Blackjack {
	
	private HashMap<Player, Integer> map = new HashMap<>();

	public Blackjack(HashMap<Player, Integer> map) {
		super();
		this.map = map;
	}
	
	public boolean add(Player player) {
		if (map.containsKey(player)) {
			return false;
		}
		else {
			map.put(player, 0);
			return true;
		}
	}
	
	public boolean addCard(Player player, Integer cardValue) {
		if (map.containsKey(player)) {
			Integer currentValue = map.get(player);
			map.put(player, cardValue + currentValue);
			return true;
		}
		return false;
	}
	
	public Integer getValue(Player player) {
		return map.get(player);
	}

	public String toString() {
		String result = "";
		for (Player player : map.keySet()) {
			result += player.getName() + ", Kartenwert: " + map.get(player) + "\n";
		}
		return result;
	}
	
	

}
