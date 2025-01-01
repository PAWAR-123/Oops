package oops.com;

public class Test {
	 static int x=100;  //non static variable 
	
	public static void main(String args[]) {
		Test t1=new Test();
		Test t2=new Test();
		
		++t1.x;
		System.out.println(t1.x);
		--t2.x;
		System.out.println(t2.x);
		
		
		
		
	}

}
