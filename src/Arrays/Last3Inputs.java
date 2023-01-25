package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Last3Inputs {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		ArrayList<String> last3Inputs = new ArrayList<>();
			
		System.out.println("Enter some text (Q to quit)");
		String userInput = keyboard.nextLine();

		while (!userInput.equals("Q")) {
			
			last3Inputs.add(userInput);
			
			if (last3Inputs.size() > 3) {
				last3Inputs.remove(0);
			}
			System.out.println(last3Inputs);
			
			System.out.println("Enter some text (Q to quit) ");
			userInput = keyboard.nextLine();
		}
	}
}
