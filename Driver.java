package oops;

public class Driver {
	private String name;
	private int age;
	
	//Constructor
	public Driver(String name, int age) {
		if(name ==null || name.isEmpty()|| age<=0) {
			System.out.println("invalid input ");
			
		}
		this.name=name;
		this.age=age;
		
	}
	//Getter method
	public String getName() {
		return name;
		
	}
	public int getAge() {
		return age;
		
	}
	
	//setter methods
	public void setName(String name) {
		if(name==null || name.isEmpty()) {
			System.out.println("invalid input ");
			
		}
		this.name=name;
		
	}
	public void setAge(int age) {
		if(age <= 0) {
			System.out.println("invalid input ");
		}
		this.age=age;
		
	}
	public String toString() {
		return "Driver Name:"+name+ "\nDrive Age"+age;
		
	}

}
class Cars{
private String brand;
private String model;
private int year;
private Driver driver;

	
//	parameterized constructor 
public Cars(String brand , String model, int year, Driver driver) {
	if(brand ==null || brand.isEmpty()|| model==null||model.isEmpty()) {
		System.out.println("invalid input ");
		
	}
	this.brand=brand;
	this.model=model;
	this.year=year;
	this.driver=new Driver(driver.getName(), driver.getAge());
}
public Cars(Cars other) {
this.brand=other.brand;
this.model=other.model;
this.year=other.year;
this.driver=new Driver(other.driver.getName(), other.driver.getAge());

}

//Getter and setter method
public String getBrand() {
	return brand;
	
}
public void setBrand(String brand) {
	if(brand==null || brand.isEmpty()) {
		System.out.println("invalid input ");
		
	}
	this.brand=brand;
	
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	if(model ==null || model.isEmpty()) {
		System.out.println("invalid input ");
		
	}
	this.model=model;
	
}
public int getYear() {
	return year;
	
}
public void setYear(int year) {
	if(year<= 0) {
		System.out.println("invalid input ");
		
	}
	this.year=year;
	
}
public Driver getDriver() {
	return driver;
}
public void setDriver(Driver driver) {
	if(driver == null) {
		System.out.println("invalid input ");
		
	}
	this.driver=new Driver(driver.getName(), driver.getAge());
	
}
public void changeDriver(Driver newDriver) {
	this.driver=new Driver(newDriver.getName(), newDriver.getAge());
	
}
public String toString() {
	return "car Brand"+brand+"\n car model"+model+"\n car year "+year+"\n"+driver.toString();
	
}

}

