package application;

import java.util.Locale;
import java.util.Scanner;

public class program05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int pos = 0;
		double max = 0.0;
		double ant = 0.0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		double[] vect = new double[sc.nextInt()];
		for (int i =0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		for (int i=0; i<vect.length; i++) {
			if(ant < vect[i]) {
				pos = i;
				max = vect[i];
			}
			ant = vect[i];
		}
		System.out.println("MAIOR VALOR = " + max);
		System.out.println("POSICAO DO MAIOR VALOR = " + pos);
		
		
		sc.close();
	}
}
