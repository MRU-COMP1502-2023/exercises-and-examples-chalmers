package inheritance;

public class Dog extends Vertebrate {

	private boolean shedsOnCarpet;
	private String name;
	
	public Dog(String name, boolean sheds) {
		super(50);
		this.name = name;
		this.shedsOnCarpet = sheds;
	}
	
}
