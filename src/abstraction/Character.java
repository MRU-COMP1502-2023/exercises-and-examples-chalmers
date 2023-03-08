package abstraction;

public abstract class Character implements Saveable {
	
	String name;
	int health;
	
	public Character(String name, int health) {
		this.name = name;
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}
	
	public abstract String toString();
}
