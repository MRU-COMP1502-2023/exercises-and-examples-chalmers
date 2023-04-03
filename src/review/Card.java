package review;

public class Card {

	private int value;
	private String suit;
	
	public Card(int value, String suit) {
		this.value = value;
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public String getSuit() {
		return suit;
	}
	
//	public String toString() {
//		return this.value + this.suit;
//	}
	
	public boolean equals(Card other) {
		System.out.println("checking against card: " + other);
		return this.value == other.getValue() && this.suit.equals(other.getSuit());
	}
		
	// *may* not be appropriate to provide setters, since suit & value can't change
	
}
