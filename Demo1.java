package oops.com;
import java.util.*;
public class Demo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many object ");
		int object=sc.nextInt();
		
		for(int i=0; i<object; i++) {
			Book obj=Book.getbookobject();
			System.out.println(obj);
			
		}
		
	}

}
