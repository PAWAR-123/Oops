package oopslogic;

public class StudentTester {

	public static void main(String[] args) {
		ScienceStudent s1=null;
		s1=new ScienceStudent(50, 50, 50, "reddy", "10th");
		
	System.out.println(s1.studentname);
	System.out.println(s1.studentclass);
	System.out.println(s1.getPercentage());
	System.out.println(Student.totalNoOfStudents);
	System.out.println("====================");
	HistoryStudent s2=new HistoryStudent(80, 80, "sheeta", "12th");
	System.out.println(s2.studentname);
	System.out.println(s2.studentclass);
	System.out.println(s2.getPercentage());
	System.out.println(Student.totalNoOfStudents);

	}

}
