package oopslogic;

 interface  Flayable {
	abstract  void fly();

}
 class Bir implements Flayable{

	@Override
	public void fly() {
		System.out.println("Bird is flying ");
			
	}
	 
 }
 class Airplane implements Flayable{

	@Override
	public void fly() {
	System.out.println("Airpalne is flying ....");
	
	
		
	}
	 
 }
 
