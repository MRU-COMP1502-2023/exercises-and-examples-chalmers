package ClassBasics;

import java.util.Random;

public class Card {
	
	private String suit;
	private int value;
	
	/**
	 * Constructor
	 * @param suit - the suit of the card. One of ♠, ♥, ♦, ♣
	 * @param value - numeric value from 1-13
	 */
	public Card(String suit, int value) {
		this.suit = suit;
		this.value = value;
	}
	
	/**
	 * Alternate (overload) constructor to create a random Card
	 */
	public Card() {
		Random rnd = new Random();
		String[] suits = {"♠", "♥", "♦", "♣"};
		this.suit = suits[rnd.nextInt(suits.length)];
		this.value = rnd.nextInt(1, 14);
	}
	
	public String getSuit() {
		return this.suit;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String toString() {
		return Integer.toString(this.value) + this.suit;
	}
}
