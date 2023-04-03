package review;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// demo of auto-widening
		acceptAnInt(5); // this works and returns a double (auto widening)
		acceptAnInt(5.0); // this doesn't work
		acceptAnInt((int) 5.0); // this works with the cast to int
		acceptADouble(5); // this works too (auto widening)

		
		// throwing and catching a custom exception
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter your name (no Erics allowed) ");
		String username = keyboard.nextLine();

		try {
			if (username.toLowerCase().equals("eric")) {
				MyCustomException e = new MyCustomException();
				throw e; // must handle exception or add throws clause
			}
		}
		catch (MyCustomException e) {
			System.out.println("no Erics allowed!");
		}

		
		Card aceOfSpades1; // at this point, aceOfSpaces is "null". no object has been assigned to it yet
		aceOfSpades1 = new Card(1, "Spades");
		Card aceOfSpades2 = new Card(1, "Spades");
		Card aceOfSpades3 = aceOfSpades1;
		System.out.println(aceOfSpades1);
		System.out.println(aceOfSpades2);
		System.out.println(aceOfSpades3);
		
		// checking equality of objects (i.e. reference variables)
		System.out.println(aceOfSpades1 == aceOfSpades2);
		System.out.println(aceOfSpades1 == aceOfSpades3);
		// 1 and 2 are different objects, but 1 and 3 are different reference variables pointing to the same object
		// use a custom equals method for comparison instead
		//    and note that it accepts a reference to the aceOfSpades2 object (not a copy of that object)
		System.out.println(aceOfSpades1.equals(aceOfSpades2));

		
		int[] myArray = new int[5]; // first way to create an array (of size 5)
		System.out.println(myArray[0]); // values default to zero
		myArray[0] = 3;
		int[] myArray2 = {0, 1, 2, 3, 4};
		int sum = 0;
		for (int i=0; i<myArray2.length; i++) {  // for loop that loops through all indices in the array
			sum += myArray2[i];
		}
		
		for (int i=0; i<=myArray2.length; i++) {  // will get an out-of-bounds error because of <=
			sum += myArray2[i];
		}
		
		sum = 0;
		for (int value : myArray2) { // enhanced or "for each" loop iterates through elements themselves
			sum += value;
		}
		
		int myInt = 5;
		switch (myInt) {
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
		case 6:
			System.out.println("six");
			break;
		}
		
		// a simple ternary
		System.out.println(myInt == 5 ? "myInt is five" : "myInt is not five");
		// comparable if-else
		if (myInt == 5) {
			System.out.println("myInt is five");
		}
		else {
			System.out.println("myInt is not five");
		}
		
	}

	public static double acceptAnInt(int b) {
		return b + 10;
	}

	public static double acceptADouble(double d) {
		return d + 10;
	}

}
