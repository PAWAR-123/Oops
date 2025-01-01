package oops.com;

public class TestDemo {

	public static void main(String[] args) {
		Bowler b1=new Bowler();
		b1.bowlerDetails("sachin",10 , 5, 750, 473);
		b1.computeBowlingAverage();
b1.computeStrikeRate();
b1.showStatistics();
	}

}
