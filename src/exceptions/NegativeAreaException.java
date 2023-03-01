package exceptions;

public class NegativeAreaException extends Exception{

	public NegativeAreaException() {
		super("area cannot be negative");
	}

	public NegativeAreaException(double area) {
		super("area " + area + " is invalid");
	}
}


