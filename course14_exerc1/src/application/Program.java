package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account pf = new Account(111, "Jhon", 5000.00);
		BusinessAccount pj = new BusinessAccount(222, "Jhon & Cia", 10000.00, 1000.00);
		SavingsAccount pf3 = new SavingsAccount(555, "Ron", 5000.00, 0.05);
		
		//Além das declarações padrões é possível misturar os tipos, devido a relação ser 1 - 1
		//Esses são exemplos de UPCASTING
		Account pj2 = new BusinessAccount(333, "Matrix Revo", 50000.00, 5000.00);
		Account pf2 = new SavingsAccount(444, "Anna", 5000.00, 0.01);
		
		System.out.println(pf);
		System.out.println(pj);
		System.out.println(pj2);
		System.out.println(pf2);
		System.out.println();
		
		//Esses são exemplos de DOWNCASTING
		//Aqui é feito um teste para garantir que pf é realmente um BusinessAccount, pois caso não seja irá gerar um erro de cast na execução
		if(pf instanceof BusinessAccount) {
			System.out.println("BusinessAccount");
			BusinessAccount pj3 = (BusinessAccount)pf;
			System.out.println(pj3);
			System.out.println();
		} else {
			System.out.println("Not a BusinessAccount");
			System.out.println();
		}
		
		//Execução da mesma operação, porém com o método de Sobreposição e herança
		pf.withdraw(200.00);
		pf2.withdraw(200.00);
		pf3.withdrawFinal(200.00);
		System.out.println("PF: " + pf.getBalance());
		System.out.println("PF2: " + pf2.getBalance());
		System.out.println("PF3: " + pf3.getBalance());
		System.out.println();
		
		
	}
}
