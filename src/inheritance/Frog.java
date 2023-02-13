package inheritance;

public class Frog extends Vertebrate{

	private boolean poisonous;
	
	public Frog(boolean poisonous) {
		super(10);
		this.poisonous = poisonous;
	}
	
	public boolean getPoisonous() {
		return this.poisonous;
	}
}
