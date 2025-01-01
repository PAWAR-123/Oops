package oops.com;

public class MotorcycleInheritanceExample {
public static void main(String[] args) {
	SportMotorcycle ducati=new SportMotorcycle("ducati",2023,1200, true);
	ducati.startEngine();
	ducati.activateRaceMode();
	ducati.displaySportMotorcycleDetails();
	
}	

}
class Vehicle{
	String brand;
	int year;
	
	public Vehicle(String brand, int year) {
		this.brand=brand;
		this.year=year;
		
	}
	public void displayVehicleDetails() {
		System.out.println("brand is "+this.brand);
		System.out.println("year is "+this.year);
		
	}
}
class Motorcycle extends Vehicle{
	int engineCapacity;
	public Motorcycle(String brand, int year, int engineCapacity ) {
		super(brand, year);
		this.engineCapacity=engineCapacity;
	}
	public void startEngine() {
		System.out.println("Engine started"+this.engineCapacity+"cc");
		
	}
}
class SportMotorcycle extends Motorcycle{
	boolean raceMode;
	public SportMotorcycle(String brand , int year, int engineCapacity, boolean raceMode) {
		super(brand, year, engineCapacity);
		this.raceMode=raceMode;
		
	}
	public void activateRaceMode() {
		raceMode=true;
		System.out.println("race mode activated");
		
	}
	public void displaySportMotorcycleDetails() {
		super.displayVehicleDetails();
		System.out.println("Engine Capacity "+engineCapacity+"cc");
		System.out.println("race mode "+(raceMode?"on":"off"));
		
	}
	
}

