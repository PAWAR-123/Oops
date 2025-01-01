package oopslogic;

public class PaymentDemo {
	public static void processMultiplePayments(Payment...payment) {
		for(Payment payments:payment) {
			payments.processPayment();
		}
	}

	public static void main(String[] args) {
		
		Payment genericPayment=new Payment();
		genericPayment.processPayment();
		System.out.println();
		
		Payment creditCardPayment = new CreditCardPayment();
		creditCardPayment.processPayment();
		System.out.println();
		
		
		Payment payPalPayment = new PayPalPayment();
        Payment bankTransferPayment = new BankTransferPayment();
        
        System.out.println("Processing multiple payments:");
        processMultiplePayments(genericPayment, creditCardPayment, payPalPayment, bankTransferPayment);

	}

}
