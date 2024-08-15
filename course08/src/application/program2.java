package application;

import java.util.Locale;
import java.util.Scanner;

import util.product;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		product[] vect = new product[n];
		double sum = 0.0;
		double avg;
		
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new product(name,price);
		}
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		avg = sum / vect.length;
		System.out.printf("AVERAGE = %.2f", avg);
		sc.close();
	}
}
