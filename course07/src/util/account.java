package util;

public class account {
	private int accountNumber;
	private String owner;
	private double balance;
	
	
	//Constructors
	public account(int accountNumber, String owner) {
		super();
		this.accountNumber = accountNumber;
		this.owner = owner;
	}
	
	
	//Getters and Setters
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	//Methods
	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw (double value) {
		this.balance -= (value + 5);
	}
	
	public String toString() {
		return("Account Number: " + accountNumber + ", Owner: " + owner + ", Current balance: $" + String.format("%.2f", balance));
	}
}
