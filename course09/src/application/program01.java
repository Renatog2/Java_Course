package application;

import java.util.Locale;
import java.util.Scanner;

public class program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int[] vect = new int [sc.nextInt()];
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i=0; i<vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		
		sc.close();
	}
}
