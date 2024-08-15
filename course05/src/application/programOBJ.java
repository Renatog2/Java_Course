package application;

import java.util.Locale;
import java.util.Scanner;
import util.calculator;

public class programOBJ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		calculator calc = new calculator();
		
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circumferente: %.2f%n", c);
		System.out.printf("Volumn: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		
		sc.close();
	}
}
