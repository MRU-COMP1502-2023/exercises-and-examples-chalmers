package inheritance;

public class Frog extends Vertebrate{

	private boolean poisonous;
	
	public Frog(boolean poisonous) {
		this.poisonous = poisonous;
		this.setNumberOfVertebrae(10);
	}
	
	public boolean getPoisonous() {
		return this.poisonous;
	}
}
