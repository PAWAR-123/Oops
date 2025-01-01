package oops.com;

public class Employeee {
	public String name;
	public double salary;
	public Employeee(String name, double salary) {
		this.name=name;
		this.salary=salary;
		
	}
	public void work() {
		System.out.println("person name is "+name);
		System.out.println(name+" is working ");
		
	}

}
class Manager extends Employeee{
	public String deparment;
	
public 	Manager(String name, double salary,String deparment){
	super(name,salary);
	this.deparment=deparment;
		
	}
public void manage() {
	System.out.println(name+"is managing "+deparment);
	
}
public static void main(String[] args) {
	Employeee e1=new Employeee("vikas",1222);
	e1.work();
	
	Manager e2=new Manager("vikas",1333,"it");
	e2.manage();
			
}
	
}

