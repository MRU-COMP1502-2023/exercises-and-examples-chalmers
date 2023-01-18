package ClassBasics;

public class Card {
	
	private String suit;
	private int value;
	
	public Card(String suit, int value) {
		this.suit = suit;
		this.value = value;
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
