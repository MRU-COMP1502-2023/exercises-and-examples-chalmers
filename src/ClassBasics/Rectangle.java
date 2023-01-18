package ClassBasics;

public class Rectangle {

	private float length;
	private float width;
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	public float getLength() {
		return this.length;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setLength(float newLength) {
		if (newLength < 0) {
			System.out.println("warning: negative length supplied");
		}
		this.length = newLength;
	}
	
	public void setWidth(float newWidth) {
		if (newWidth < 0) {
			System.out.println("warning: negative width supplied");
		}
		this.width = newWidth;
	}
	
	public float getArea() {
		return this.length * this.width;
	}
}
