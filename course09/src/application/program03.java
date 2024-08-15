package application;

import java.util.Locale;
import java.util.Scanner;

import util.people03;

public class program03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		double avg;
		double perc = 0.0;
		int cont = 0;
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		people03[] vect = new people03[sc.nextInt()];
		for (int i=0; i<vect.length; i++) {
			System.out.println("Dados da "+ (i+1) +"a pessoa: ");
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new people03(nome, idade, altura);
		}
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getAltura();
		}
		avg = (sum / vect.length);
		System.out.printf("\nAltura média: %.2f\n", avg);
		for (int i=0; i<vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				cont++;
			}
		}
		perc = ((100 / vect.length)* cont);
		System.out.println("Pessoas com menos de 16 anos: " + perc + "%");
		for (int i=0; i<vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		
		sc.close();
	}
}
