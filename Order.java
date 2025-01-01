package oopslogic;

public class Order {
	private int orderId;
	private String itemName;
	private double itemPrice;
	
	public Order(int orderid, String itemName, double itemPrice) {
		this.orderId=orderid;
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		
		
		
	}
	public String toString() {
		return " orderId  "+orderId+"  itemName "+itemName+"  itemPrice "+itemPrice+" ";
		
	}

}
class Customer{
	private int customerId;
	private String customerName;
	private String customerAddress;
	private Order order;
	
public Customer(int customerId, String customerName, String customerAddress,Order order) {
	this.customerId=customerId;
	this.customerName=customerName;
	this.customerAddress=customerAddress;
	this.order=order;
		
	}

public String toString() {
	return " customerId  "+customerId+"  customerName "+customerName+"  customerAddress "+customerAddress+" order "+order;
	
}
	
	
	
}
