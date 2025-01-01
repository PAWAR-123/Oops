package oopslogic;

public class Constructoroverloading {
public 	int x;
public String name;
public double fees;

public Constructoroverloading() {
	System.out.println("default constructor called");
	
}
public Constructoroverloading(int y) {
	
	this.x=y;
	System.out.println("one parameter constructor called");
	
}
public Constructoroverloading(int x, String name) {
	System.out.println("two parameterize construtor called");
	this.x=x;
	this.name=name;
}
public Constructoroverloading(int x, String name, double fees) {
	System.out.println("three parameterize constructor called ");
	this.x=x;
	this.name=name;
	this.fees=fees;
	
}
public static void main(String[] args) {
	Constructoroverloading c1=new Constructoroverloading(12, "vikas ");
	if(c1.name=="vikas") {
		System.out.println("name match "+c1.name);
	}

	
	
}	
	
	

}
