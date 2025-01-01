package oops.com;

public class Employee {
	private double employeeSalary;
	
public Employee(double EmployeeSalary) {
	this.employeeSalary=EmployeeSalary;
}

public double getemployeesalary() {
	return this.employeeSalary;
}

public void setemployeesalary(double salary) {
	this.employeeSalary=salary;
}

public String toString() {
	return "Employeesalary[ employeesalay "+ this.employeeSalary +"]";
}

}
