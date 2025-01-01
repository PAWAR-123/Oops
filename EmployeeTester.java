package oops.com;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee3 p1=new Employee3("shaktiman",30,"sales",50000, "good");
		p1.updatesalary();
		System.out.println(p1);
		
		Employee3 p2=new Employee3("ganagadhar",-25,"Hr",47000, "good");
		System.out.println(p2);
		

	}

}
