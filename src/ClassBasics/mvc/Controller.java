package ClassBasics.mvc;
import java.io.FileNotFoundException;

import ClassBasics.mvc.Character;

public class Controller {

	public static void main(String[] args) throws FileNotFoundException {

		// create a character object
		Character king = new Character("king", 10, 2);
		
		// save it
		king.save();
		
		// create a new instance of Character by loading the saved data
		Character king2 = new Character("king.txt");


	}

}
