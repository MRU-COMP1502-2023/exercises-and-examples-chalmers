package Decisions;

import java.util.Scanner;


public class DatingProfile {

	/**
	 * determine if someone is a match for an online dating profile, given:
	 * turn-ons: (tall or fun), athletic
	 * turn-offs: smelly, loud
	 */
	public static void main(String[] args) {
		
		// create a scanner object for collecting user input
		Scanner keyboard = new Scanner(System.in);
		
		// ask user for their attributes
		// create a boolean variable for each using a conditional expression
		System.out.println("are you tall? (Y/N)");
		boolean tall = keyboard.nextLine().equals("Y") ? true : false;
		
		System.out.println("are you fun? (Y/N)");
		boolean fun = keyboard.nextLine().equals("Y") ? true : false;
				
		System.out.println("are you athletic? (Y/N)");
		boolean athletic = keyboard.nextLine().equals("Y") ? true : false;
		
		System.out.println("are you smelly? (Y/N)");
		boolean smelly = keyboard.nextLine().equals("Y") ? true : false;
		
		System.out.println("are you loud? (Y/N)");
		boolean loud = keyboard.nextLine().equals("Y") ? true : false;
		
		// decision logic to see if all turn-ons are satisfied...
		boolean turnOns = (tall || fun) && athletic;
		// ... and if any turn-offs are present
		boolean turnOffs = smelly || loud;
		
		// final output
		if (turnOns && !turnOffs)
		{
			System.out.println("match");
		}
		else
		{
			System.out.println("no match");
		}
		
	}

}
