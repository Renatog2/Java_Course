package entities;

public class Account {
	private Integer number;
	private String holder;
	protected Double balance;
	
	
	//Constructors
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	
	//Getters and Setters
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	
	//Methods
	public void withdraw(double amount) {
		balance -= (amount + 5.0);
	}
	
	public void deposit(double amout) {
		balance += amout;
	}
	
	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
	}
}
