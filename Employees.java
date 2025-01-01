package oopslogic;

public interface Employees {
public abstract double calculateSalary() ;
public abstract void generatePayroll();




}
class FullTimeEmployee implements Employees{
	
	private int employeeId  ;
	private String employeeName ;
	private double monthlySalary ;
	private double benefits ;
	
	public  FullTimeEmployee(int employeeId ,String employeeName ,double monthlySalary,double benefits) {
		if(monthlySalary<0) {
			throw new IllegalArgumentException("Error: monthly  salary cannot be negative ");
			
		}
		if(employeeName==null) {
			throw new IllegalArgumentException("Error:EmployeeName can not be emplty");
			
		}
		
		
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.monthlySalary=monthlySalary;
		this.benefits=benefits;
		
		
	}

	@Override
	public double calculateSalary() {
		
		return monthlySalary+benefits;
	}

	@Override
	public void generatePayroll() {
		System.out.println("\n Employee payroll Information ");
		System.out.println("Employee id "+employeeId);
		System.out.println("Employee name"+employeeName);
		System.out.println("Monthly Salary "+monthlySalary);
		System.out.println("Benefits "+benefits);
		System.out.println("total salary"+calculateSalary());
		
	}
	
}
