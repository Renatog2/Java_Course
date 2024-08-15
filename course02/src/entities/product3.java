package entities;

public class product3 {
	private String name;
	private double price;
	private int quantity;
	
	
	
	//Right Click -> Source -> Generate Constructor using Fields
	public product3(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public product3(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public product3() {
		super();
	}
	
	
	
	//Right Click -> Source -> Generate Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	
	
	//TODO
	public double totalValueInStock() {
		return (quantity * price);
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
	}
}
