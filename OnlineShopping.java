package oops.com;



class product{
	protected String name;
	protected double price;
	
	public product(String name, double price) {
		this.name=name;
		this.price=price;
		
	}
	public void displayInfo() {
		System.out.println("name is "+this.name);
		System.out.println("price is "+this.price);
		
	}
	public double calculateTotalCost(int quantity) {
		return this.price* quantity;
	}
	
	
}

class Electronic extends product{
	private String brand;
	public Electronic(String name, double price, String brand) {
		super(name,price);
		this.brand=brand;
		
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("brand is "+this.brand);
		
	}
}
class Clothing extends product{
	private String size;
	public Clothing (String name, double price, String size) {
	super(name,price);
	this.size=size;
	
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("size is "+this.size);
		
	}
}



public class OnlineShopping {

	public static void main(String[] args) {
		Electronic phone = new Electronic("phone",599.9,"apple");
		Clothing shirt=new Clothing("t shirt",6.666,"m");
		
		phone.displayInfo();
		System.out.println("Total cost for "+phone.calculateTotalCost(2));
		System.out.println("===================");
		shirt.displayInfo();
		
		
		System.out.println("Total cost for "+shirt.calculateTotalCost(5));
		
	}

}
