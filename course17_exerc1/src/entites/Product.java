package entites;

public class Product {
	private String name;
	private Double price;
	private Integer quantity;
	
	
	// Constructors
	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	
	// Methods
	public double total() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
