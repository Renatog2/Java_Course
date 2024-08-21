package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private Date manufacturedDate;
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	// Constructors
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, Date manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}
	
	
	//Methods
	public Date getManufacturedDate() {
		return manufacturedDate;
	}
	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	
	// Methods
	@Override
	public String priceTag() {
		return getName() + " (used) $ " + String.format("%.2f", getPrice()) + " (Manufacture date: " + sdf.format(getManufacturedDate()) + ")";
	}

	@Override
	public String toString() {
		return "UsedProduct [manufacturedDate=" + manufacturedDate + ", Name=" + getName() + ", Price=" + getPrice() + "]";
	}
}
