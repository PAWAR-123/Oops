package oops.com;

public class Tester1 {
	public static void main(String[] args) {
		Shape s1=new Shape("red");
		System.out.println("detail of colour is ");
		s1.displaycolour();
		
		System.out.println("===================");
		Circle c1=new Circle("blue",24);
		System.out.println(c1.area());
		
	}

}
