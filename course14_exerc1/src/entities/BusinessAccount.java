package entities;

public class BusinessAccount extends Account{
	private Double loanLimit;
	
	
	//Constructors
	/*Como a Classe Business Acount extende da Classe Account, ao passar os argumentos no Super, é garantido que os campos vão ser corretamente preenchidos
	 * Para passar um super vazio, ou com argumentos, é necessário um construtor equivalente na Super classe*/
	public BusinessAccount() {
		super();
	};
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	
	//Getters and Setters
	public void loan(Double amout) {
		loanLimit += amout;
	}
	public Double getLoanLimit() {
		return loanLimit;
	}
	
	
	//Methods
	/*Para conseguir fazer essa operação, é necessário que o campo balance seja public ou protected devido a herança.
	 * Por uma questão de lógica um saldo de conta não pode ter acesso publico, então ele está como protected*/
	public void setLoanLimit(double amount) {
		if (amount <= loanLimit) {
			balance += (amount - 10.0);
		}
	}
	
	@Override
	public String toString() {
		return "BusinessAccount [loanLimit=" + loanLimit + ", number=" + getNumber() + ", holder=" + getHolder() + ", balance=" + getBalance() + "]";
	}
}
