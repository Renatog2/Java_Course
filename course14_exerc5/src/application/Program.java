package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.People;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<People> list = new ArrayList<>();
		double total = 0;
		
		System.out.print("Enter the number of tax payers: ");
		int qtd = sc.nextInt();
		
		for(int i=1; i<=qtd; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char op = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if(op == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				list.add(new Individual(name, income, health));
			} else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, income, employees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for(People people : list) {
			System.out.println(people.getName() + ": $" + String.format("%.2f", people.taxPaid()));
			total += people.taxPaid();
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", total));
		
		
		sc.close();
	}
}
