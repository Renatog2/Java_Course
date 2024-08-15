package application;
import java.util.Locale;
import java.util.Scanner;
import entities.triangle;

public class programOBJ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double areaX, areaY;
		triangle x, y;
		x = new triangle();
		y = new triangle();
		
		
		System.out.println("Digite as medidas do triangulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite as medidas do triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		sc.close();
		
		
		areaX = x.area();
		areaY = y.area();
		System.out.printf("Area triangulo X: %.4f%n", areaX);
		System.out.printf("Area triangulo Y: %.4f%n", areaY);
		if(areaX > areaY) {
			System.out.println("Maior area: X");
		}else{
			System.out.println("Maior area: Y");
		}
	}
}
