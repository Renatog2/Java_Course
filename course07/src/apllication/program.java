package apllication;

import java.util.Locale;
import java.util.Scanner;
import util.account;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		account account = new account(number, name);
		System.out.print("Do you have a inicial deposit(y/n)? ");
		if(sc.next().equals("y")) {
			System.out.print("Enter value of deposit: ");
			account.deposit(sc.nextDouble());
		}
		
		System.out.println();
		System.out.println("Account Information: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}
}
