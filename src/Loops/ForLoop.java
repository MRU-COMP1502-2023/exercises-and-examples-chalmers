package Loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// create a String array to hold 3 user inputs
		String[] userInputs = new String[3];
		
		for (int count = 0; count < 3; count++) {
			System.out.println("enter some text: ");
			String input = keyboard.nextLine();
			
			// add this user input to the array
			userInputs[3 - count] = input;
		}
		
		System.out.println("done");

	}

}
