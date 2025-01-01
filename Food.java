package oopslogic;

public abstract class Food {
	public double proteins;
	public double fats;
	public double carbs;
	
	public int tastyScore;
	public abstract void getMacroNutrients();
	public abstract void  getType();
	public void getTaste() {
		System.out.println("Taste:"+ tastyScore);
		
	}
	

}
class Egg extends Food{
	String type="non_vegitarian";
	
public Egg(double proteins,double fats,double carbs ) {
	this.proteins=proteins;
	this.fats=fats;
	this.carbs=carbs;
	this.tastyScore=7;
	
}
	@Override
	public void getMacroNutrients() {
	System.out.println("An egg has "+this.proteins+"gms of protein"+this.fats+"gm of fats and "+this.carbs+"gms of varbohydrates");
	
		
	}
	@Override
	public void getType() {
		 System.out.println("Egg is " + this.type);
	}
	
}
class Bread extends Food{
	String type="vegitarian";
	public Bread(double protiens, double fats, double carbs) {
		this.proteins=protiens;
		this.fats=fats;
		this.carbs=carbs;
		this.tastyScore=8;
		
		
	}
	@Override
	public void getMacroNutrients() {
		 System.out.println("A slice of bread has " + this.proteins + " gms of protein, " + this.fats + 
                 " gms of fats and " + this.carbs + " gms of carbohydrates.");
		
	}
	@Override
	public void getType() {
		  System.out.println("Bread is " + this.type);
		
	}
}
