package entities;

public class product2 {
	private String name;
	private double price;
	private int quantity;
	
	//Construtor
	public product2(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Construtor de Sobrecarga
	public product2(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Construtor Padrão
	public product2() {
	}
	
	
	
	//Getters e Setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	
	
	//Metodos
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
