package application;

import java.util.Locale;
import java.util.Scanner;

import entites.product;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		product product = new product();
		
		
		System.out.print("Enter the Student Name: ");
		product.name = sc.nextLine();
		System.out.print("Enter the first Test grade: ");
		product.test1 = sc.nextDouble();
		System.out.print("Enter the second Test grade: ");
		product.test2 = sc.nextDouble();
		System.out.print("Enter the third Test grade: ");
		product.test3 = sc.nextDouble();
		System.out.println();
		
		System.out.printf("FINAL GRADE = %.2f\n", product.note());
		System.out.println(product.status());
		sc.close();
	}
}
