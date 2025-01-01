package oopslogic;

public interface AdvancedArithmetic {

public abstract int  divisorm(int x );
	
	
	


}
class  MyCalculator implements AdvancedArithmetic{

	@Override
	public int divisorm(int x ) {
	  int sum=0;
		if(x<0) {
		  System.out.println("invalid input ");
		  return x;
	  }
		if(x==0) {
			System.out.println("number should be positive number ");
			return x;
		}
	  for(int i=1; i<=x; i++) {
		  if(x%i==0) {
			  sum=sum+i;
			 
		  }
	  }
		return sum;
	}
	
}
