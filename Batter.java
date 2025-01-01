package oops.com;

public class Batter {
private String name;
private int runs;
private int matches;
private float batting_avg;


public void batterDetails(String name,int runs, int matches) {
	
	this.name=name;
	this.runs=runs;
	this.matches=matches;
	
	
}
public void computeBattingAverage() {
	
	if(runs<=0 ||matches<=0) {
		System.out.println("greater");
		return;
	}
	if(runs>0 && matches==0) {
		System.out.println("greather");
		return;
	}
	
	double batting_avg=runs/matches;
	
	System.out.println("name "+name);
	System.out.println("batting_avg"+batting_avg);
	
	
	
	
	
}
public void getStatistics() {
	if(runs<=0 ||matches<=0) {
		System.out.println("run and matche greater then 0");
	return ;
	}
	if(runs>0 && matches==0) {
		System.out.println("erro");
		return ;
	}
	
	System.out.println("name "+name);
	System.out.println("runs"+runs);
	System.out.println("matches"+matches);
	
}

}
