package review;

public abstract class Animal { // abstract class - can't be instantiated
	
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract void makeSound(); // abstract method - all child classes are forced to override with their own version
}
