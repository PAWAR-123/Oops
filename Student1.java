package oops.com;

public class Student1 {
	private int studentid;
	private String name;
	private long mobile;
	// constructor of student1 class that intialize attribute vale of classs 
public Student1(int studentid, String name, long mobile) {
	this.studentid=studentid;
	this.name=name;
	this.mobile=mobile;
	
}
public void display() {
	System.out.println("studentid"+studentid);
	System.out.println("student name is "+name);
	System.out.println("student mobile number"+mobile);
	
}

}
class jobGuaranteeStudent extends Student1{
	boolean placementGuarantee;
	
	//constructor of jobGuarantee class that inheritate all propertise of parent class extends keyword using 
	public jobGuaranteeStudent(int studentid, String name, long mobile,boolean placementGuarantee) {
	super(studentid, name, mobile); // parent class constructor called using super keyword
	
	
	this.placementGuarantee=placementGuarantee;
	
	}
public void displayStudentInfo() {
	display();
	System.out.println("placementGuarantee "+(placementGuarantee?"yes":"no"));
}
	
	
}
