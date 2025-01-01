package learn_collecton;

public class ZooManagement {

	public static void main(String[] args) {
		Lion l1=new Lion("lion", 14, 17);
		System.out.println("Lion");
		l1.displayInfo();
		l1.displayManeLength();
		l1.makeSound();
		
		Elephant e1=new Elephant("elephant", 15, 12.0F);
		System.out.println("elephant");
		e1.displayInfo();
		e1.displayTuskLength();
		e1.makeSound();

	}

}
