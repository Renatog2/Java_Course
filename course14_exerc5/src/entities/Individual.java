package entities;

public class Individual extends People {
	private double healthExpenditures;
	
	
	// Constructors
	public Individual() {
		super();
	}
	
	public Individual(String name, Double annualIncome, double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	
	// Getters and Setters
	public double getHealthExpenditures() {
		return healthExpenditures;
	}
	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	
	// Methods
	@Override
	public double taxPaid() {
		if(getAnnualIncome() < 20000.00) {
			return ((getAnnualIncome() * 1.15) - getAnnualIncome()) - (healthExpenditures / 2);
		} else {
			return ((getAnnualIncome() * 1.25) - getAnnualIncome()) - (healthExpenditures / 2);
		}
	}
	
	@Override
	public String toString() {
		return "Individual [healthExpenditures=" + healthExpenditures + ", Name=" + getName() + ", Income=" + getAnnualIncome() + "]";
	}
}
