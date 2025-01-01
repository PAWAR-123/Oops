package oops.com;

public class Circle extends Shape {
	private double radius;
	public Circle(String colour, double radius) {
		super(colour);
		this.radius=radius;
		

		
		
	}
	public double area() {
		return 3.14*radius* radius;
	}
	
	

}
