package oopslogic;

public interface SIMCardInterface {
	void phonenumber();
	void networkprovider();
	void activation();
	void deactivation();
	
	

}
interface  MobilePhoneInterface{
	void inserting(SIMCardInterface s);
	void removing(SIMCardInterface s);
	void makecall(SIMCardInterface s);
	void sendtextmessage(SIMCardInterface s);
	
	
	
	
}
class MobilePhone implements MobilePhoneInterface {

	@Override
	public void inserting(SIMCardInterface s) {
		s.phonenumber();
		s.networkprovider();
		System.out.println(s.getClass().getSimpleName()+" inserting a sim card into the mobile phone");
	}

	@Override
	public void removing(SIMCardInterface s) {
	
		s.deactivation();
		
		System.out.println(s.getClass().getSimpleName()+"Remove the SIM card from the mobile phone.");
		
	}

	@Override
	public void makecall(SIMCardInterface s) {
	
		s.networkprovider();
		System.out.println(s.getClass().getSimpleName()+"Make a call and send a text message using the inserted SIM card");
		
		
	}

	@Override
	public void sendtextmessage(SIMCardInterface s) {
		s.networkprovider();
	
		
	System.out.println("send atext message ");
		
	}
	
	
}
class Jio implements SIMCardInterface{

	@Override
	public void phonenumber() {
		System.out.println(" jio number 7057956081");
		
	}

	@Override
	public void networkprovider() {
		System.out.println("jio network provider");
		
	}

	@Override
	public void activation() {
		System.out.println("number is activation");;
		
	}

	@Override
	public void deactivation() {
		System.out.println("number is not activation");
		
	}
	
}
class Airtel implements SIMCardInterface{

	@Override
	public void phonenumber() {
		System.out.println("airtel number 99999977766 ");
		
		
	}

	@Override
	public void networkprovider() {
		System.out.println("airtel network providers");
		
	}

	@Override
	public void activation() {
		System.out.println("number airtel activation");
		
	}

	@Override
	public void deactivation() {
		System.out.println("number airtel deactivation");
		
	}
	
}
class BSNL implements SIMCardInterface{

	@Override
	public void phonenumber() {
		System.out.println("bsnl  number  888666777");
		
	}

	@Override
	public void networkprovider() {
		System.out.println("bsnl network providers ");
		
		
	}

	@Override
	public void activation() {
		System.out.println("bsnl number activation ");
		
	}

	@Override
	public void deactivation() {
		System.out.println("bsnl number deactivation");
		
	}
	
}
