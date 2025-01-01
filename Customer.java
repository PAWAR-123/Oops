package oops.com;

public class Customer {
	private String name;
	private int id;
	
	public Customer (String name, int id ) {
		
		this.name=name;
		this.id=id;
		
	}
	public void setId(int id) {
		this.id=id;
		
	}
	public int getId() {
		return id;
		
	}
	class Test{
		public static void main(String[] args) {
			int val=100;
			Customer c=new Customer("ravi", 2);
			m1(c);
			System.out.println(c.getId());
			
			
			
		}
		public static void m1(Customer c) {
			
			c.setId(5);
		c=new  Customer("rahul",7);
		c.setId(9);;
		System.out.println(c.getId());
		
		}
	}

}
