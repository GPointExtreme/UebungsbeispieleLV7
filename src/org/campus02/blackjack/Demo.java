package org.campus02.blackjack;

import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {
		
		HashMap<Player, Integer> map = new HashMap<>();
		
		Blackjack bj = new Blackjack(map);
		
		Player p1 = new Player("Dominik", 24);
		Player p2 = new Player("David", 38);
		Player p3 = new Player("Stefan", 28);
		
		//Spieler adden
		System.out.println("Added " + p1 + "?" + bj.add(p1));
		System.out.println("Added " + p2 + "?" + bj.add(p2));
		System.out.println("Added " + p3 + "?" + bj.add(p3));
		
		//Readden von SPieler2 sollte nicht gehen...
		System.out.println("Added " + p2 + "?" + bj.add(p2));
		
		//Kartenwert erhöhen und alle Spieler ausgeben
		System.out.println(bj.addCard(p1, 10));
		System.out.println(bj.toString());

	}

}
