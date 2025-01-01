package oops.com;

public class Employee1 {
	private String firstname;
	private String lastname;
	private  int employid;
	private double salary;
	private int noOfProject;
	

	
	public Employee1(String firstname, String lastname, int employeeid, double salary,int noOfProject) {
	this.firstname=firstname;
	this.lastname=lastname;
	this.employid=employeeid;
	this.salary=salary;
	this.noOfProject=noOfProject;
	
		
	}
	public void calculatesalary() {
		if(noOfProject<0) {
			System.err.println("invalid noofproject");
			System.out.println(this.salary);
		   
		}
		if(noOfProject> 5 && noOfProject<10 ) {
			this.salary=this.salary+5000;
			System.out.println(this.salary);
		}else if(noOfProject>10 && noOfProject<20) {
			this.salary=this.salary+10000;
			System.out.println(this.salary);
		}else if(noOfProject>20){
			this.salary=this.salary+15000;
			System.out.println(this.salary);
		}
	}
	@Override
	public String toString() {
		return "Employee1 [firstname=" + firstname + ", lastname=" + lastname + ", employid=" + employid + ", salary="
				+ salary + ", noOfProject=" + noOfProject + "]";
	}
	
}
