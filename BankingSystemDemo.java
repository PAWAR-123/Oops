package newopps;

public class BankingSystemDemo {

	public static void main(String[] args) {
		//create bank instance 
		Bank sbi=new SBI(0);
		Bank hdfc=new HDFC();
		Bank icici=new ICICI();
		
		//create a customer instance
		Customer customer =new Customer("vikas pawar");
		
		// Interact with SBI
        System.out.println("--- Interacting with SBI ---");
        customer.deposite(sbi, 5000);
        customer.checkBalance(sbi);
        customer.withdraw(sbi, 2000);
        customer.checkBalance(sbi);

//     // Interact with HDFC
//        System.out.println("--- Interacting with HDFC ---");
//        customer.deposite(hdfc, 10000);
//        customer.checkBalance(hdfc);
//        customer.withdraw(hdfc, 3000);
//        customer.checkBalance(hdfc);
//
//        System.out.println("--- Interacting with ICICI ---");
//        customer.deposite(icici, 15000);
//        customer.checkBalance(icici);
//        customer.withdraw(icici, 5000);
//        customer.checkBalance(icici);
//		
	}

}
