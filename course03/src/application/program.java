package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		product product = new product();
		
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.println();
		System.out.print("Gross salary: ");
		product.grossSalary = sc.nextDouble();
		System.out.println();
		System.out.print("Tax: ");
		product.tax = sc.nextDouble();
		System.out.println();
		System.out.println("Employee: " + product);
		System.out.println();

		System.out.print("Wich percentage to increase salary?: ");
		product.increaseSalary(sc.nextDouble());
		System.out.println();
		System.out.println("Updated Data: " + product);
		sc.close();
	}
}
