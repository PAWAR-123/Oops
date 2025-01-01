package oops.com;

public class Employeedemo {
	public static void main(String[] args) {
		Employee s1=new Employee(12000.0);
	System.out.println(s1);
	System.out.println("after 1 year upadtes salary is ");
	s1.setemployeesalary(s1.getemployeesalary());
	System.out.println(s1.getemployeesalary()+1000);
	
	
	
		s1.toString();
	}

}
