package exceptions;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter some text: ");
		String userInput = keyboard.nextLine();
		try {
			System.out.println("the 10th character is " + userInput.charAt(9));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("your text has less than 10 characters");
		}


	}

}
