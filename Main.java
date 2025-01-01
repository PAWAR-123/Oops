package oopslogic;

public class Main {

	public static void main(String[] args) {
		Address d1=new Address("pune","pune " , "maharashtara" );
		System.out.println(d1);
		Employees e1=new Employees(123, "sachin",d1);
		System.out.println(e1);

	}

}
