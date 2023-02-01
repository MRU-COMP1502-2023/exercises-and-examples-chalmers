package ClassBasics.mvc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This class represents a character for a game
 * @author echalmers
 */
public class Character {
	
	String name;
	int strength;
	int dexterity;
	
	/**
	 * constructor
	 * @param name - the character's name
	 * @param strength - the strength score
	 * @param dexterity - the dexterity score
	 */
	public Character(String name, int strength, int dexterity) {
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;		
	}
	
	/**
	 * Alternate constructor - loads a previously saved Character object
	 * @param filename - file to load from (generated by Character.save())
	 * @throws FileNotFoundException
	 */
	public Character(String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner scanner = new Scanner(file);
		String line = scanner.nextLine();
		String[] values = line.split(",");
		
		// first value is name
		this.name = values[0];
		
		// second value is strength score
		this.strength = Integer.parseInt(values[1]);
		
		// third value is dexterity score
		this.dexterity = Integer.parseInt(values[2]);
	}

	public int getDexterity() {
		return dexterity;
	}

	public String getName() {
		return name;
	}

	public int getStrength() {
		return strength;
	}
	
	/**
	 * saves the character data to a file
	 * @param filename - file to save to
	 * @throws FileNotFoundException
	 */
	public void save(String filename) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(filename);
		writer.printf("%s,%s,%s", this.name, this.strength, this.dexterity);
		writer.close();
	}
	
	/**
	 * saves character data to a file named after the character
	 * @throws FileNotFoundException
	 */
	public void save() throws FileNotFoundException {
		String filename = this.name + ".txt";
		this.save(filename);
	}
}
