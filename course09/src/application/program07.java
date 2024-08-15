package application;

import java.util.Locale;
import java.util.Scanner;

public class program07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		double avg;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		double[] vect = new double[sc.nextInt()];
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		for(int i=0; i<vect.length; i++) {
			sum += vect[i];
		}
		avg = (sum / vect.length);
		System.out.printf("\nMEDIA DO VETOR = %.3f\n", avg);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i=0; i<vect.length; i++) {
			if(vect[i] < avg) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
}
