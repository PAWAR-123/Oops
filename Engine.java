package oops;

public class Engine {
	private String model;
	
	//constructor
	public Engine(String model) {
		if(model==null || model.isEmpty()) {
		throw new IllegalArgumentException("eror invalid input ");
		
			
		}
		this.model=model;
		
	}
	// getter method 
	public String getModel() {
		return model;
		
	}
	
	//override toString method;
	public String toString() {
		return "Engine model:"+model;
		
	}

}
 class Car{
	 private String make;
	 private String model;
	 private String engine;
	
	 //constructor
	 public Car(String make, String model, String engine) {
		 if(make==null || make.isEmpty()|| model==null ||model.isEmpty()) {
			 throw new IllegalArgumentException("error invalid input");
		 }
		 this.make=make;
		 this.model=model;
		 this.engine=engine;
		 
		 
	 }
	 //override toString method
	 
	 public String toString() {
		 return "Car Make:"+make+",model "+model+","+engine.toString();
	 }
	 
	
}
 
