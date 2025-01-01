package oopslogic;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		try {
			System.out.println("test cas 1: negative salary");
			FullTimeEmployee employee1=new FullTimeEmployee(101,"reddy",-500,200);
		}catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("test case 2: empty employee name ");
			 FullTimeEmployee employee2 = new FullTimeEmployee(102, "", 5000, 2000);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		FullTimeEmployee e =new FullTimeEmployee(103,"Alice smith", 8000, 3000);
		

	}

}
