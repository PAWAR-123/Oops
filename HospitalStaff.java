package oopslogic;

public class HospitalStaff {
	
	private String name;
	private int age;
	private String role;
	
	public HospitalStaff(String name, int age, String role) {
		this.setName(name);
		this.age=age;
		this.setRole(role);
		
		
	}
	public void work() {
		System.out.println("role is :"+this.getRole());
		System.out.println("name is :"+this.getName());
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
class Doctor extends HospitalStaff{
	private String specialization;
	
	public Doctor( String name, int age, String role,String specialization) {
		super(name,age,role);
		this.specialization=specialization;
	}
	@Override
	public void work() {
		System.out.println("roll is :"+super.getRole());
		System.out.println("name is "+super.getName());
		System.out.println("specialization is :"+this.specialization);
	}
	
}
class Nurse extends HospitalStaff{
	private int yearsOfExperience;
	
	public Nurse(String name, int age, String role,int yearsOfExperience ) {
		super(name, age, role);
		this.yearsOfExperience=yearsOfExperience;
	}
	@Override
	public void work() {
		System.out.println("role is :"+super.getRole());
		System.out.println("name is :"+super.getName());
		System.out.println("yearsOfExperience is :"+this.yearsOfExperience);
		
	}
	
}
