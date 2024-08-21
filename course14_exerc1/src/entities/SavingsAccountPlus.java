package entities;

public class SavingsAccountPlus extends SavingsAccount{
	/*A palavra Final impede qualquer tipo de sobreposição de um método, serve também para classes. Tirar o comentário abaixo e observar erro no compilador.
	 * Final também ajuda na questão de desempenho bem como evita um problema que pode vir a ocorrer devido a sobreposição da sobreposição da sobreposição...
	 */
	
	/*
	@Override
	public void withdrawFinal(double amout) {
		super.withdraw(amout);
		balance -= 2.0;
	}
	
	@Override
	public void withdrawFinal(double amout) {
		super.withdraw(amout);
		balance -= 2.0;
	}
	*/
}
