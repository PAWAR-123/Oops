package oopslogic;

public class BankManagementSystem {
	public static void main(String[] args) {
		
		SavingsAccount s1=new SavingsAccount ("SA12345",1500.0,3.5);
		s1.generateStatement();
		
		System.out.println();
		
		checkingAccount c1=new checkingAccount("CA54321",2000.00,500.00);
		
		c1.generateStatement();
	}

}
