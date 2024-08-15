import java.util.Locale;
import java.util.Scanner;

public class debug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		double largura = 0.00;
		double comprimento = 0.00;
		double metroQuadrado = 0.00;
		double area = 0.00;
		double preco = 0.00;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a Largura:");
		largura = sc.nextDouble();
		System.out.println("Digite o comprimento:");
		comprimento = sc.nextDouble();
		System.out.println("Digite o metro Quadrado:");
		metroQuadrado = sc.nextDouble();
		area = largura * comprimento;
		preco = area * metroQuadrado;
		sc.close();
		
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
	}
}