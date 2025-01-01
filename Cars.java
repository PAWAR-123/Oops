package oopslogic;

 abstract class Cars {
	 String brand;
	 String model;
	 int mileage;
	 int top_speed;
	 int yearOfManufacturing;
	 
	 public Cars() {
		brand="Default Brand" ;
		model="Default Model";
		mileage=0;
		top_speed=0;
		yearOfManufacturing=0;
		
	 }
	 public String carBrand() {
		 brand="Tesla";
		 return brand;
		 
	 }
	 public String carModel() {
		 model="Model S";
		 return model;
		 
	 }
	 public int carMileage() {
		 mileage=400;
		 return mileage;
		 
	 }
	 
	 public int carTopSpeed() {
		 top_speed=250;
		 return top_speed;
		 
	 }
	 public int carYear() {
		 yearOfManufacturing=2021;
		 return yearOfManufacturing;
	 }
	 public abstract void display();
	 	

}
 class Tests extends Cars{

	@Override
	public void display() {
		 System.out.println("Car Details:");
	        System.out.println("Brand: " + carBrand());
	        System.out.println("Model: " + carModel());
	        System.out.println("Mileage: " + carMileage() + " km");
	        System.out.println("Top Speed: " + carTopSpeed() + " km/h");
	        System.out.println("Year of Manufacturing: " + carYear());
	}
	 
 }
