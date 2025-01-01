package oopslogic;

public class Ticket {
	public String source;
	public String destination;
	public int price;
	public Ticket(String source, String destination, int price) {
		super();
		this.source = source;
		this.destination = destination;
		this.price = price;
	}
	
	public void displayTicketDetails()
	{
		System.out.println("source :"+source);
		
		System.out.println("destination :"+destination);
		System.out.println("price :"+price);
		
	}
	
}
class TrainTicket extends Ticket{
	public TrainTicket(String source, String destination, int price) {
		super(source, destination, price);

	}

	public int number;
	
}
