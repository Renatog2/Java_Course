package application;

import java.util.Locale;
import java.util.Scanner;
import util.calculatorStatic;

public class programStaticOBJ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = calculatorStatic.circumference(radius);
		double v = calculatorStatic.volume(radius);
		
		System.out.printf("Circumferente: %.2f%n", c);
		System.out.printf("Volumn: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calculatorStatic.PI);
		
		
		sc.close();
	}
}
