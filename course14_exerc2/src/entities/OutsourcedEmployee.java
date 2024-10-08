package entities;

public class OutsourcedEmployee extends Employee {
	private Double additionalCharge;
	
	
	// Constructors
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}



	// Getters and Setters
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	
	// Methods
	@Override
	public double payment() {
		return super.payment() + (additionalCharge * 1.1);
	}
	
	@Override
	public String toString() {
		return "OutsourcedEmployee [additionalCharge=" + additionalCharge + ", Name=" + getName() + ", Hours=" + getHours() +
				", ValuePerHour=" + getValuePerHour() + "]";
	}
}
