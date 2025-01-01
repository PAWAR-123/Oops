package oopslogic;

public class Animal {
	private String species;
	
	//parameterized constructor
	public Animal(String species ) {
		this.species=species;
	}
	
	//Getter for species;
	public String getSpecies() {
		return species;
	}
	public void makeSound() {
		System.out.println("Generic animal sound");
		
	}
	@Override
	public String toString() {
		return "Animal species;"+species;
	}
	public Animal reproduce() {
		System.out.println("Generic reproduction method for all animal ");
		
		return new Animal("unknown");
	}

}
  class Mammal extends Animal{
	private boolean hasFur;
	
	public Mammal(String species,boolean hasFur) {
		super(species);
		this.hasFur=hasFur;
		
	}
	 @Override
	    public void makeSound() {
	        System.out.println("Mammal sound: Roar or growl.");
	    }
	 
	 @Override
	    public String toString() {
	        return "Mammal species: " + getSpecies() + ", Has Fur: " + hasFur;
	    }
	 
	 @Override
	    public Mammal reproduce() {
	        System.out.println("Mammals give birth to live young.");
	        return new Mammal(getSpecies(), hasFur);
	    }
	 public void nurseYoung() {
	        System.out.println(getSpecies() + " is nursing its young.");
	    }
}
  class Bird extends Animal{
	 private boolean canFly;
	 
	 public Bird(String species, boolean canFly) {
	        super(species);
	        this.canFly = canFly;
	    }
	 @Override
	    public void makeSound() {
	        System.out.println("Bird sound: Chirp or tweet.");
	    }
	 @Override
	    public String toString() {
	        return "Bird species: " + getSpecies() + ", Can Fly: " + canFly;
	    }
	 
	 @Override
	    public Bird reproduce() {
	        System.out.println("Birds lay eggs as a means of reproduction.");
	        return new Bird(getSpecies(), canFly);
	    }
	 
	 public void buildNest() {
	        System.out.println(getSpecies() + " is building a nest.");
	    }
  }
