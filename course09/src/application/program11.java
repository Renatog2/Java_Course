package application;

import java.util.Locale;
import java.util.Scanner;

public class program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int tam;
		double menorAlt = 0.0;
		double maiorAlt = 0.0;
		int contMulheres = 0;
		int contHomens = 0;
		double mulheresAlt = 0.0;
		double avg = 0.0;
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		tam = sc.nextInt();
		double[] vectAlt = new double[tam];
		String[] vectGen = new String[tam];
		for(int i=0; i<tam; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			vectAlt[i] = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			vectGen[i] = sc.next();
			menorAlt = vectAlt[i];
		}
		for(int i=0; i<tam; i++) {
			if(vectAlt[i] < menorAlt) {
				menorAlt = vectAlt[i];
			}
			if(vectAlt[i] > maiorAlt) {
				maiorAlt = vectAlt[i];
			}
			if(vectGen[i].equals("F")) {
				contMulheres++;
				mulheresAlt += vectAlt[i];
			}
		}
		System.out.println("Menor altura = " + menorAlt);
		System.out.println("Maior altura = " + maiorAlt);
		avg = mulheresAlt/contMulheres;
		System.out.printf("Media das alturas das mulheres = %.2f\n", avg);
		contHomens = tam - contMulheres;
		System.out.println("Numero de homens = " + contHomens);
		
		
		sc.close();
	}
}
