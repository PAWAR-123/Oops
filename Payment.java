package oopslogic;

public class Payment {
	public void processPayment() {
		System.out.println("processing payment");
		
	}

}
class CreditCardPayment extends Payment{
	@Override
	public void processPayment() {
		System.out.println("processing creadet card payment");
		
	}
}
class PayPalPayment extends Payment{
	@Override
	public void processPayment() {
		System.out.println("processing paypal  payment");
		
	}
	
}
class BankTransferPayment extends Payment{
	
	@Override
	public void processPayment() {
		System.out.println("processing bank transfer  payment");
		
	}
}
