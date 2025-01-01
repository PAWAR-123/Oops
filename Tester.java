package oops.com;

public class Tester {
	public static void main(String[] args) {
		Student1 student=new Student1(111,"reddy",7057956081L);
		System.out.println("student details");
		student.display();
		
		System.out.println("------------------------------------------------------");
		
		jobGuaranteeStudent student1=new jobGuaranteeStudent(102,"smith",88999777555L,true);
		System.out.println("job gaurantee student details ");
		student1.displayStudentInfo();
		
		
		
		
		
	}

}
