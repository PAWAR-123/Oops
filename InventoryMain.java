package oops.com;

public class InventoryMain {
public static void main(String[] args) {
	InventoryItem name = new InventoryItem("Apples",10, 15);
	System.out.println(name.calculateTotalValue());
	InventoryItem name1 = new InventoryItem("Apples",-5.0, 15);
	System.out.println(name1.calculateTotalValue());
}

}
