package oops.com;

public class Setter_demo {
	public static void main(String[] args) {
		Setter_getter s1=new Setter_getter(12,"reddy",1000);
		System.out.println(s1);
		s1.setName("radhika");
		System.out.println(s1);
		System.out.println(s1.getName());
		int fees=s1.getFees();
		if(fees>=12000) {
			System.out.println("student are allowed to college exam ");
		}else if(fees<12000) {
			System.out.println("pay the fess of college then give exam");
			
		}
		
		
	}

}
