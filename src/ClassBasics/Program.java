package ClassBasics;

import ClassBasics.Rectangle;
import ClassBasics.Card;

public class Program {

	public static void main(String[] args) {
		
		Rectangle myRectangle = new Rectangle(5.0f, 10.0f);
		
		System.out.println(myRectangle.getLength());
		
		myRectangle.setLength(10.0f);
		System.out.println(myRectangle.getArea());

		
		Card myCard = new Card("♣", 10);
		System.out.println(myCard);
	}

}
