package entities;

public class ImportedProduct extends Product {
	private Double customsFee;
	
	
	// Constructors
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	
	// Getters and Setters
	public Double getCustomsFee() {
		return customsFee;
	}
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	
	// Methods
	@Override
	public String priceTag() {
		return getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", getCustomsFee())+")";
	}
	
	public double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String toString() {
		return "ImportedProduct [customsFee=" + customsFee + ", Name=" + getName() + ", Price=" + getPrice() + "]";
	}	
}
