package oops.com;

public class Test2 {
	public static void main(String[] args) {
		
		Employee2 m1=new Employee2(-1, "reddy", 43000);
	
	  if(m1.employeeSalary>60000) {
		  System.out.println("developer");
	  }else if(m1.employeeSalary>=40000 && m1.employeeSalary<60000) {
		  System.out.println("Designer");
		  
	  }else {
		  System.out.println("teacher");
		  
	  }
	}

}
