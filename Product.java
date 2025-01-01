package learn_collecton;

public class Product {
	protected String name;
	protected double price;
	
	public Product(String name, double price) {
		this.name=name;
		this.price=price;
		
	}
	public void displayInfo() {
		System.out.println("product name is "+this.name);
		System.out.println("product price is "+this.price);
		
		
	}
	public double calculateTotalCost(int quantity) {
		
		System.out.println(this.price);
		return (quantity * this.price);
	}

}
class Electronic extends Product{
	private String brand;
	public Electronic(String name, double price, String brand) {
		super(name, price);
		this.brand=brand;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("brand name is "+this.brand);
		
	}
	@Override
	public String toString() {
		return "Electronic [name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}
	
}
class Clothing extends Product{
	private String size;
	public Clothing(String name, double price, String size) {
		super(name, price);
		this.size=size;
		
	}
	public void displayInfo()
	
      {
		
		super.displayInfo();
		System.out.println("product size is "+this.size);
		
		
		}
	@Override
	public String toString() {
		return "Clothing [name=" + name + ", price=" + price + ", size=" + size + "]";
	}
	
}
