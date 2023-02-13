package inheritance;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import ClassBasics.mvc.Character;

public class Mage extends Character{
	
	private int mana;
	private ArrayList<String> spells = new ArrayList<String>();
	
	public Mage(String name, int strength, int dexterity, int mana) {
		super(name, strength, dexterity);
		this.mana = mana;
	}
	
	@Override
	public void save(String filename) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(filename);
		writer.printf("%s,%s,%s,%s,%s", this.getName(), this.getStrength(), this.getDexterity(), this.mana, this.spells);
		writer.close();
	}
	
}
