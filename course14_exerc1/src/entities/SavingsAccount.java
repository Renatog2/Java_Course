package entities;

public class SavingsAccount extends Account{
	private Double interestRate;
	
	
	//Constructors
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	
	//Getters and Setters
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	//Methods
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	/*O @Override neste método significa que ele é uma reescrita de um método de mesmo nome na Super classe.
	 * No caso desse exercício significa que conta poupança não tem taxa no saque, diferente de uma conta da Super Classe*/
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	//Aqui um exemplo onde eu uso o método withdraw da Super classe, com um extra dessa classe
	public final void withdrawFinal(double amount) {
		super.withdraw(amount);
		balance -= 5.0;
	}
	
	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + ", number=" + getNumber() + ", holder=" + getHolder() + ", balance=" + getBalance() + "]";
	}
}
