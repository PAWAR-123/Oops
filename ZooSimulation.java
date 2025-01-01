package oopslogic;

public class ZooSimulation {

	
	
	public static void main(String[] args) {
	Mammal lion=new Mammal("lion",true);
	System.out.println(lion.toString());
	lion.makeSound();
	lion.nurseYoung();
	
	Mammal babyLion=lion.reproduce();
	System.out.println("baby lion "+babyLion.toString());
	
	System.out.println();
	
	Bird eagle=new Bird("eagle",true);
	System.out.println(eagle.toString());
	eagle.makeSound();
	eagle.buildNest();
	
	Bird babyEagel=eagle.reproduce();
	System.out.println("baby eagle "+babyEagel.toString());

	}

}
