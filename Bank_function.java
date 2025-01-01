package oops.com;
import java.util.*;




public  class Bank_function {
	int amount=0;
	int choice;
	int accountcreated=0;
	public void menu() {
		System.out.println("----bank account manu----\n");
		System.out.println("1. create account\n");
		System.out.println("2. deposite money\n");
		System.out.println("3. withdraw money\n");
		System.out.println("4. check balance\n");
		System.out.println("5. Exit\n");
	}
	
	public void createaccount( ) {
		this.amount=2000;
		System.out.println("Account created successfull with an intial balance of rs 2000\n");
		
		
	}
	public void deposite() {
		
		System.out.println("Enter the amount to deposite");
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		if(amount<=0) {
			System.out.println("invalid amount to deposite");
			
		}else {
			this.amount=amount;
			System.out.println(amount+"deposited successfully");
			System.out.println("your total balance is :"+(this.amount+=amount));
			
		}
		
		
	
		
	}
	public void withdraw() {
		int amount;
		System.out.println("Enter the amount to withdraw");
		Scanner sc=new Scanner(System.in);
		amount=sc.nextInt();
		if(amount<=0) {
			System.out.println("invalid amount to withdraw");
			
		}else if(amount > this.amount) {
			System.out.println("insufficient balance");
			
		}else {
			this.amount-=amount;
			System.out.println(amount+"withdraw successfully");
			System.out.println("your total balance is "+this.amount);
			
		}
	}
	void checkbalance(int balance) {
		System.out.println("your current balanace is "+balance);
	}
	
	
	
	
	public static void main(String[] args) {
		boolean accountcreated=false;
		Bank_function b1=new Bank_function();
		
		while(true) {
			b1.menu();
			System.out.println("enter the your choice");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				if(!accountcreated) {
					b1.createaccount();
					accountcreated=true;
					
				}else {
					System.out.println("account is alredy creared");
					
				}
				break;
			case 2:
				if(!accountcreated) {
					b1.deposite();
					
				}else {
					System.out.println("creare your account first");
					
				}
				break;
			case 3:
				if(!accountcreated) {
					b1.withdraw();
				}else {
					System.out.println("no account found");
					
				}
				break;
			case 4:
				if(!accountcreated) {
					b1.checkbalance(0);
					
				}else {
					System.out.println("no account found ");
					
				}
				break;
			case 5:
				System.out.println("Exiting.... than you for using our banking system");
			
				
			}
		}
		
	}

}
