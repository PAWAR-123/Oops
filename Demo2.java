package oops.com;

public class Demo2 {
	public static void main(String[] args) {
		Book1 b1=new Book1("1984","george orwell",14.391)
		
				;
	
		
		b1.printDetails();
		
		Book1 b2=new Book1("negative price book","no author ",-5.0);
		b1.applyDiscount(-5);
		b1.printDetails();
	}

}
