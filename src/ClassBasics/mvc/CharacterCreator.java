package ClassBasics.mvc;

import java.util.Scanner;

/**
 * A "View" class that collects character details from a user
 * @author echalmers
 *
 */
public class CharacterCreator {

	Scanner keyboard = new Scanner(System.in);
	
	/**
	 * Prompts the user for their character's name
	 * @return the name
	 */
	public String getCharacterName() {
		System.out.print("enter character name: ");
		return keyboard.nextLine();
	}
	
	/**
	 * Prompts the user for their character's strength score
	 * @return the strength score
	 */
	public int getCharacterStrength() {
		System.out.print("enter character strength score: ");
		return keyboard.nextInt();
	}
	
	/**
	 * Prompts the user for their character's dexterity score
	 * @return dexterity
	 */
	public int getCharacterDexterity() {
		System.out.print("enter character dexterity score: ");
		return keyboard.nextInt();
	}
	
}
