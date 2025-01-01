package oops.com;

public class Student {
	int rollNumber;
	String studentName;
	String studentAddress;
	static String collegeName ="sit";
	static String coursename="java";
	
	public void setStudentData(int rollNumber,String studentname, String StudentAddress) {
		this.rollNumber=rollNumber;
		this.studentName=studentname;
		this.studentAddress=StudentAddress;
		
	}

	public String toString() {
		return "Student [rollNumber=" + this.rollNumber + ", studentName=" + this.studentName + ", studentAddress="
				+ this.studentAddress + ", College Name " + Student.collegeName + ", Course Name " + Student.coursename
				+ " ]";
	
	
	
	}
}
