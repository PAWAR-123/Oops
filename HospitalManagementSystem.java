package oopslogic;

public class HospitalManagementSystem {

	public static void main(String[] args) {
		HospitalStaff f1=new HospitalStaff("reddy", 24, "sergon");
		f1.work();
		System.out.println();
		
		Doctor c1=new Doctor("supa", 22, "doctor", "mbbs");
		c1.work();
		System.out.println();
		Nurse n=new Nurse("supa", 23, "nurse", 44);
		n.work();
	}

}
