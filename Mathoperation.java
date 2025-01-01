package oopslogic;

public class Mathoperation {
	
	
	
	public int  add(int num1, int num2) {
		int sum=num1+num2;
		System.out.println("integer sum method called");
		return sum;
		
		
	}
	
	public double add(double num1 , double num2) {
		double sum=num1+num2;
		System.out.println("double sum method called");
		return sum;
	}
	
	public double multiply(double  num1,double  num2) {
		double mul=num1*num2;
		System.out.println("double multiply called");
		return mul;
	}
	
	public int multiply(int num1, int num2) {
		int mul=num1*num2;
		System.out.println("called integer multiply");
		return mul;
	}
	public static void main(String[] args) {
		Mathoperation m1=new Mathoperation();
		System.out.println(m1.add(10.0, 30.0));
	
	}
	

}
