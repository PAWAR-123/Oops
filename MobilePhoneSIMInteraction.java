package newopps;

public class MobilePhoneSIMInteraction {
public static void main(String[] args) {
		SIMCardInterface  jiosim=new Jio ("12345657");
		SIMCardInterface  airtel=new Airtel ("55566677889");
		SIMCardInterface  bsnl=new BSNL ("1234567890");
		
		
 MobilePhone phone = new MobilePhone();
 phone.insertSIM(jiosim);
phone.makeCall();
phone.sendText("1222222","hello from jio");
phone.removeSIM();
System.out.println("+++++++++++++++++++++++++++++++++");

// Insert Airtel SIM and perform actions
phone.insertSIM(airtel);
phone.makeCall("8887776665");
phone.sendText("8887776665", "Hello from Airtel!");
phone.removeSIM();
System.out.println("++++++++++++++++++++++++++++++++++++++++++");


// Insert BSNL SIM and perform actions
phone.insertSIM(bsnl);
phone.makeCall("7776665554");
phone.sendText("7776665554", "Hello from BSNL!");
phone.removeSIM();
	}
	
}
