package review;

public class RoboCat extends Animal {

	int name; // this int version of name hides the name attribute from the parent class
	
	public RoboCat(int name) {
		super("RoboCat #" + name);
		this.name = name;
	}
	
	@Override
	public void makeSound() {
		System.out.println("beep boop");
	}
}
