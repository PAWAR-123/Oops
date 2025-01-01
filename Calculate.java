package newopps;

public interface Calculate {
	public void calculate(int...a);
	

}
class SimpleCalculator implements Calculate{

	@Override
	public void calculate(int... a) {
		int sum=0;
		for(int A: a) {
			sum=sum+A;
			
		}
		System.out.println("sumof number is "+sum);
		
	}
	
}
