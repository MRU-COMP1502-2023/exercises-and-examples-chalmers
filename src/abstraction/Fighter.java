package abstraction;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Fighter extends Character {

	int speed;

	public Fighter(String name, int health, int speed) {
		super(name, health);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	@Override
	public void save(String filename) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(filename);
		writer.println(this.getName() + "," + this.getHealth() + "," + this.getSpeed());
		writer.close();
	}

	@Override
	public String toString() {
		return this.getName() + ", the fighter";
	}
	
	
}
