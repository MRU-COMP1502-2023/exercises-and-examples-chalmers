package ClassBasics.mvc;
import java.io.FileNotFoundException;

import ClassBasics.mvc.Character;
import ClassBasics.mvc.CharacterCreator;

public class Controller {

	public static void main(String[] args) throws FileNotFoundException {

		// make an instance of the CharacterCreatorObject
		CharacterCreator creator = new CharacterCreator();
		
		// get character details
		String name = creator.getCharacterName();
		int strength = creator.getCharacterStrength();
		int dexterity = creator.getCharacterDexterity();
		
		// use the details to create a Character object
		Character character = new Character(name, strength, dexterity);
		
		// save the Character
		character.save();
		System.out.println("character saved");
	}

}
