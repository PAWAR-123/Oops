package oopslogic;

public class Zomato {

	public static void main(String[] args) {
		Order d1=new Order(123, "jellebi", 230);
		Customer c1=new Customer(144, "vikas", "pune ", d1); 
		System.out.println(c1);

	}

}
