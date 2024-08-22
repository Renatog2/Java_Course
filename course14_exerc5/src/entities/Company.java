package entities;

public class Company extends People {
	private Integer employeesQuantity;
	
	
	// Constructors
	public Company() {
		super();
	}
	
	public Company(String name, Double annualIncome, Integer employeesQuantity) {
		super(name, annualIncome);
		this.employeesQuantity = employeesQuantity;
	}
	
	
	// Getters and Setters
	public Integer getEmployeesQuantity() {
		return employeesQuantity;
	}
	public void setEmployeesQuantity(Integer employeesQuantity) {
		this.employeesQuantity = employeesQuantity;
	}
	
	
	// Methods
	@Override
	public double taxPaid() {
		if(employeesQuantity < 10) {
			return (getAnnualIncome() * 1.16) - getAnnualIncome();
		} else {
			return (getAnnualIncome() * 1.14) - getAnnualIncome();
		}
	}

	@Override
	public String toString() {
		return "Company [employeesQuantity=" + employeesQuantity + ", Name=" + getName() + ", AnnualIncome=" + getAnnualIncome() + "]";
	}
}
