package application;

import java.util.Locale;
import java.util.Scanner;

public class program {
	//Essa é uma constante e o valor nunca vai mudar
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumferente: %.2f%n", c);
		System.out.printf("Volumn: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * (radius * radius * radius) / 3.0;
	}
}
