package oops.com;

public class Employee3 {
private String name;
 private int age;
 private String department;
 private  double salary;
 private String performance;
 
public Employee3(String name, int age, String department, double salary, String performance) {
	super();
	if(age<0) {
		System.out.println("age must be positive integer");
	
	}
	this.name = name;
	this.age = age;
	this.department = department;
	this.salary = salary;
	this.performance = performance;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String getPerformance() {
	return performance;
}

public void setPerformance(String performance) {
	this.performance = performance;
}
  
 public double updatesalary() {
if(performance=="good") {
	this.salary+=10000;
	
}else if(performance=="average") {
	this.salary+=5000;
	
}else if(performance=="null") {
	System.out.println("no bonus is added");
	
	
}
	 
	return this.salary; 
 }

@Override
public String toString() {
	return "Employee3 [name=" + name + ", age=" + age + ", department=" + department + ", salary=" + salary
			+ ", performance=" + performance + "]";
}
 
 

}
