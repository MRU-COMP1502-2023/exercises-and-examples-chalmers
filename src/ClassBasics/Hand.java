package ClassBasics;

import java.util.ArrayList;

public class Hand {
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public void addCard(Card theCard) {
		this.cards.add(theCard);
	}
	
	public int total() {
		
		int totalScore = 0;
		
		for (int index = 0; index < this.cards.size(); index++ ) {
			totalScore += this.cards.get(index).getValue();
		}
		
		return totalScore;
	}
	
	public String toString() {
		String str = "";
		
		for (int index = 0; index < this.cards.size(); index++ ) {
			str += this.cards.get(index).toString();
		}
		
		return str;
	}

}
