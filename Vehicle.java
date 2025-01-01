package oopslogic;

public abstract class Vehicle {
	abstract void start();
	
	public void stop() {
		System.out.println("vehicle stop.....");
	}

}
class Car extends Vehicle{

	@Override
	void start() {
		System.out.println("car start ...");
		
	}
	@Override
	public void stop() {
		System.out.println("car stop.....");
	}
	
	
	
}
 class Bike extends Vehicle{

	@Override
	void start() {
		System.out.println("bike start...");
		
	}
	
	
}
