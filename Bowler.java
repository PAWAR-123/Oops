package oops.com;

public class Bowler {
	private String name;
	private int  wickets;
	private int matches;
	private int balls_bowled;
	private int runs_conceded;
	
	
	public void bowlerDetails(String name,int wickets,int matches,int balls_bowled,int runs_conceded)
	{
		if(wickets<0 || matches<0||balls_bowled<0||runs_conceded<0) {
			System.out.println("Error Negative values not allowed");
			return;
		}
		if((runs_conceded>0 || balls_bowled> 0)&& matches==0){
			System.out.println("Error runs conceded or balls bowled cannot be grether the 0");
		}
		
		this.name=name;
		this.wickets=wickets;
		this.matches=matches;
		this.balls_bowled=balls_bowled;
		this.runs_conceded=runs_conceded;
			
	}
	public void computeBowlingAverage() {
		if(wickets<=0) {
			System.out.println("Erroe wickets must be greather than 0");
		}
		double average=(runs_conceded/wickets);
		System.out.println("Enter the name of boweler"+name);
		System.out.println("enter the wickets"+wickets);
		System.out.println("Enter the matches"+matches);
		System.out.println("balls bowled "+balls_bowled);
		System.out.println("runs concede is"+runs_conceded);
		
		
		System.out.println(name);
		System.out.println(average);
		
		
		
		
		
		
	}
	
	public void computeStrikeRate() {
		double strike_rate=runs_conceded/balls_bowled;
		System.out.println("==========================");
		System.out.println(name);
		System.out.println(strike_rate);
		
	}
	public void showStatistics() {
		if(balls_bowled<=0) {
			System.out.println("Erroe balls bowled must be greater then 0");
			
		}
		System.out.println("============================");
		System.out.println(name);
		System.out.println(wickets);
		System.out.println(matches);
		System.out.println(balls_bowled);
		System.out.println(runs_conceded);
		
	}

}
