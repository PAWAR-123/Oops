package oopslogic;

public class Testing3 {

	public static void main(String[] args) {
		Jio j1=new Jio();
		MobilePhone m1=new MobilePhone();
		m1.inserting(j1);
		m1.makecall(j1);
		m1.sendtextmessage(j1);
		m1.removing(j1);
		System.out.println("============================");
		Airtel a1=new Airtel();
		m1.inserting(a1);
		m1.makecall(a1);
		m1.sendtextmessage(a1);
		m1.removing(a1);
		System.out.println("====================");
		BSNL s1=new BSNL();
		m1.inserting(s1);
		m1.makecall(s1);
		m1.sendtextmessage(s1);
		m1.removing(s1);
		
		
		
	}

}
