package abstraction;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Mage extends Character implements MagicUser {
	
	int mana;

	public Mage(String name, int health, int mana) {
		super(name, health);
		this.mana = mana;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	@Override
	public void save(String filename) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(filename);
		writer.println(this.getName() + "," + this.getHealth() + "," + this.getMana());
		writer.close();
		
	}

	@Override
	public String toString() {
		return this.getName() + ", the mage";
	}
	
	

}
