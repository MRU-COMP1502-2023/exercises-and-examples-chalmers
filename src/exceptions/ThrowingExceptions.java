package exceptions;

public class ThrowingExceptions {

	public static void main(String[] args) throws NegativeAreaException {
		computeRadius(-10);

	}

	public static double computeRadius(double area) throws NegativeAreaException {
		if (area < 0) {
			throw new NegativeAreaException(area);
		}
		return Math.sqrt(area / Math.PI);
	}

}
