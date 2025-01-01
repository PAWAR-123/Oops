package oops.com;

public class Class_demo {
	private int id;
	
	public Class_demo(int id) {
		this.id=id;
		
	}
	public Class_demo get() {
		return new Class_demo(5);
	}
public static void main(String[] args) {
	Class_demo d1=new Class_demo(122);
	System.out.println(d1.get());
	
}
}
