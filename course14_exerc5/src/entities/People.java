package entities;

public abstract class People {
	private String name;
	private Double annualIncome;
	
	
	// Constructors
	public People() {
		
	}
	
	public People(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	
	// Methods
	public abstract double taxPaid();
	
	@Override
	public String toString() {
		return "People [name=" + name + ", annualIncome=" + annualIncome + "]";
	}
}
