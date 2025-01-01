package oops.com;

public  class Bank {
	private double amount=1000;
	
	public void deposite(double amount) {
		
		if(amount<0) {
			System.out.println("you cant deposite amount");
		}
		else {
		System.out.println("amount deposite successfully"+amount);
		this.amount=this.amount+amount;
		System.out.println("total available balance is "+this.amount);
		
	}
	}
	
	public void withdraw(double amount) {
		if(amount > this.amount) {
			System.out.println("inefficieant balance ");
			
			
		}else {
			this.amount=this.amount-amount;
			System.out.println("amount successfully withdraw "+amount);
			System.out.println("available balance is "+this.amount);
			
		}
	}
	
}
