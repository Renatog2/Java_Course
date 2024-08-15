package application;

import java.util.Locale;
import java.util.Scanner;
import entities.product2;

public class program2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		product2 product2 = new product2(name, price);
		System.out.println("Product data: " + product2);
		product2.setName("Computer");
		System.out.println("Updated name: " + product2.getName());
		product2.setPrice(1200.00);
		System.out.println("Updated price: " + product2.getPrice());
		
		
		System.out.println();
		System.out.printf("Enter the number of products to be added in stock: ");
		product2.addProducts(sc.nextInt());
		System.out.printf("Updated data: " + product2);
		
		System.out.println();
		System.out.printf("Enter the number of products to be removed from stock: ");
		product2.removeProducts(sc.nextInt());
		System.out.printf("Updated data: " + product2);
		
		
		sc.close();
	}
}
