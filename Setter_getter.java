package oops.com;

public class Setter_getter {
	private int rollnumber;
	private String name;
	private int fees;
	public Setter_getter(int rollnumber, String name, int fees) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Setter_getter [rollnumber=" + rollnumber + ", name=" + name + ", fees=" + fees + "]";
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	

}
