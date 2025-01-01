package oopslogic;

public class ShapeDemo {

	public static void main(String[] args) {
		for(int i=0; i<1; i++) {
		Shape shape=new Shape();
		shape.draw();
		shape.erase();
		System.out.println();
		Circle circle=new Circle();
		circle.draw();
		circle.erase();
		System.out.println();
		
		Shape s1=new Triangle();
		s1.draw();
		s1.erase();
		System.out.println();
		
		Square e=new Square();
		e.draw();
		e.erase();
		}
	}

}
