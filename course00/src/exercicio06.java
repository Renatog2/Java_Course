import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Double A = 0.00;
		Double B = 0.00;
		Double C = 0.00;
		Double pi = 3.14159;
		Double area = 0.00;
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Digite os valores:");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		sc.close();

		
		area = (A * C) / 2;
		System.out.printf("TRIANGULO: %.3f\n", area);
		area = C * C * pi;
		System.out.printf("CIRCULO: %.3f\n", area);
		area = ((A + B) / 2) * C;
		System.out.printf("TRAPEZIO: %.3f\n", area);
		area = B * B;
		System.out.printf("QUADRADO: %.3f\n", area);
		area = A * B;
		System.out.printf("RETANGULO: %.3f", area);
	}
}
