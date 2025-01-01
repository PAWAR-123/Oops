package oops.com;

public class Employee4 {
	 int id=100;
	public static void main(String args[]) {
		int val=200;
		Employee4 e1=new Employee4();
		e1.id=val;
		update(e1);
		System.out.println(e1.id);
		
		Employee4 e2=new Employee4();
		e2.id=900;
		
		switchEmployees(e2,e1);
		System.out.println(e1.id);
		System.out.println(e2.id);
		
	}
	public static void update(Employee4 e) {
	e.id=500;
	e=new Employee4();
	e.id=400;
	System.out.println(e.id);
	
	}
	public static void switchEmployees(Employee4 e1,Employee4 e2) {
	int temp=e1.id;
	e1.id=e2.id;
	e2=new Employee4();
	e2.id=temp;
	
	}

}

