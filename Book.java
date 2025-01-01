package oops.com;
import java.util.*;
public class Book {
private String booktile;
private String Auther;

public Book(String booktile,String Auther) {
	this.booktile=booktile;
	this.Auther=Auther;
	
}

public String toString() {
	return "book [booktile "+booktile+"Auther  "+Auther+"]";
}

public static  Book getbookobject() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the book tile ");
	String tile=sc.nextLine();
	System.out.println("enter the book name ");
	String book=sc.nextLine();
	
	return new Book("tile","book");
	
}
	

}
