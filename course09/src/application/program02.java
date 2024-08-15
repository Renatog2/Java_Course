package application;

import java.util.Locale;
import java.util.Scanner;

public class program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		double avg;
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		double[] vect = new double [sc.nextInt()];
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		System.out.print("VALORES =");
		for(int i=0; i<vect.length; i++) {
			System.out.printf(" %.1f", vect[i]);
			sum += vect[i];
		}
		avg = (sum / vect.length);
		System.out.printf("\nSOMA = %.2f", sum);
		System.out.printf("\nMEDIA = %.2f", avg);
		
		
		sc.close();
	}
}
