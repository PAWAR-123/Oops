package oopslogic;

public class Account {
	private String accountNumber;
	private double balance;
	
	//parameterized construtor;
	public Account(String accountNumber, double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
	//getter for accountNumber
	public String getAccountNumber() {
		return accountNumber;
	}
	
	//Getter gor balance
	public double getBalance() {
		return balance;
		
	}
	public Account generateStatement() {
		System.out.println("Account Statement");
		System.out.println("Account number is "+accountNumber);
		System.out.println("current balance is "+balance );
		return this;
	}

}
class SavingsAccount extends Account{
	private double interestRate;
	
	//parametirized constructor 
	public SavingsAccount(String accountNumber,double balance,double interestRate) {
		super(accountNumber, balance);
		this.interestRate=interestRate;
		
	}
	 @Override
	    public SavingsAccount generateStatement() {
	        System.out.println("Savings Account Statement:");
	        System.out.println("Account Number: " + getAccountNumber());
	        System.out.println("Current Balance: $" + getBalance());
	        System.out.println("Interest Rate: " + interestRate + "%");
	        return this;
	    }
}
class checkingAccount extends Account{
	private double overdraftLimit;
	
	public checkingAccount(String accountNumber,double balance,double overdraftLimit) {
		super(accountNumber , balance );
		this.overdraftLimit=overdraftLimit;;
		
	}
	 @Override
	    public checkingAccount generateStatement() {
	        System.out.println("Checking Account Statement:");
	        System.out.println("Account Number: " + getAccountNumber());
	        System.out.println("Current Balance: $" + getBalance());
	        System.out.println("Overdraft Limit: $" + overdraftLimit);
	        return this;
	    }
}
