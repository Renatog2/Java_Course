package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	
	//Constructors
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
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
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	
	//Methods
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws DomainException {
		if(amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		
		if(amount > balance) {
			throw new DomainException("Not enough balance");
		}
		
		balance -= amount;
	}
	
	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + ", withdrawLimit=" + withdrawLimit + "]";
	}
}
