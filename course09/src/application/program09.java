package application;

import java.util.Locale;
import java.util.Scanner;

public class program09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int tam;
		int idade = 0;
		int pos = 0;
		
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		tam = sc.nextInt();
		String[] vectNomes = new String [tam];
		int[] vectIdades = new int [tam];
		for(int i=0; i<tam; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			sc.nextLine();
			System.out.print("Nome: ");
			vectNomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			vectIdades[i] = sc.nextInt();
		}
		for(int i=0; i<tam; i++) {
			if(idade < vectIdades[i]) {
				idade = vectIdades[i];
				pos = i;
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + vectNomes[pos]);
		
		
		sc.close();
	}
}
