import java.util.Locale;
import java.util.Scanner;

public class exercicioYoutube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double larg;
		Double compr;
		Double valMetr;
		Double area;
		Double valFim;
		
		
		/* Colocar essa linha do Locale garante que não vai dar bugg o . ou , pois pega do SO*/
		Locale.setDefault(Locale.getDefault());
		System.out.println("Digite a Largura:");
		larg = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o Comprimento:");
		compr = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o Valor do M²:");
		valMetr = sc.nextDouble();
		sc.close();
		
		
		area = larg * compr;
		valFim = area * valMetr;
		System.out.printf("Area: %.2f%n", area);
		System.out.printf("Preço: %.2f%n", valFim);
	}
}
