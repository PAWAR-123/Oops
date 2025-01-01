package oops.com;

public class InventoryItem {
	private String itemName;
	private double pricePerunit;
	private int quantityInStock;
	public InventoryItem(String itemName, double pricePerunit, int quantityInStock) {
		super();
		this.itemName = itemName;
		this.pricePerunit = pricePerunit;
		this.quantityInStock = quantityInStock;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPricePerunit() {
		return pricePerunit;
	}
	public void setPricePerunit(double pricePerunit) {
		this.pricePerunit = pricePerunit;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	
public double calculateTotalValue() {
	
	if(this.pricePerunit<0) {
		System.err.println("Indicating invalid price ");
		
	}else if(this.quantityInStock<0)  {
		System.err.println("indicating invalid quantity");
	}else if(this.itemName=="null") {
	System.out.println("indicating invalid item name ");
	
	}
	return this.pricePerunit*=this.quantityInStock;	
}

}
