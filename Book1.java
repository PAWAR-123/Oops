package oops.com;

public class Book1 {
	public String title;
	public String author;
	public double price;
	public Book1(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void printDetails() {
		
		System.out.println(this.title);
		System.out.println(this.author);
		System.out.println(this.price);
		
	}
	public void applyDiscount(double discount) {
		
		
		if(discount<0) {
			 System.out.println("negative ");
		 }
		else {
			price-=price*(discount/100);
			
		}
	}

}
