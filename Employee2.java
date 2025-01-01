package oops.com;

public class Employee2 {
	public int employeenumber;
	public String employeename;
	public double employeeSalary;
	public Employee2(int employeenumber, String employeename, double employeeSalary) {
		super();
		
		if(employeenumber<0) {
			System.err.println("id must be positive ");
			
		}if(employeeSalary<0) {
			System.err.println("salary can not be negative ");
			
		}if(employeename=="Null") {
			System.out.println("name must be intialize with any default value ");
			
		}
		
		
		this.employeenumber = employeenumber;
		this.employeename = employeename;
		this.employeeSalary = employeeSalary;
	}
	

}
