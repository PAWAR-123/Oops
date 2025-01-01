package oopslogic;

public class Shapecalculator {
	
public int calculateArea(int sideLength) {
	if(sideLength<0) {
		System.out.println("invalid input ");
		return sideLength ;
	}
	System.out.println("side  square of "+sideLength);
	int square=(sideLength* sideLength);
	return square;
}

public int calcualteArea(int length, int width)

{
	if(length<0 && width<0) {
		System.out.println("negative not invalid input here ");
		return length ;
	}
	System.out.println("rectangle square of length"+length+"and width "+width);
	int arearectangle=length*width;
	return arearectangle;
}

public double calculateArea(double radius) {
	if(radius <0) {
		System.out.println("invalid input ");
		return radius ;
	}
	System.out.println("circle area of radius "+radius);
	double areacircle=(3.14*(radius* radius));
	return areacircle;
}

public static void main(String[] args) {
 Shapecalculator s1 =new Shapecalculator();
 System.out.println(s1.calculateArea(7.0));
 
 System.out.println(s1.calculateArea(-5));
 System.out.println(s1.calcualteArea(5, 10));
 
 // this is the method overloading and constructor overloading concept in java 
 
}
	
	
	
}
