package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vect = new double [n];
		double sum = 0.0;
		double avg;
		
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		avg = sum/n;
		System.out.printf("AVERAGE HEIGHT = %.2f", avg);
		sc.close();
	}
}
