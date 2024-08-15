import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int cod1 = 0;
		int cod2 = 0;
		int num1 = 0;
		int num2 = 0;
		double vlr1 = 0.00;
		double vlr2 = 0.00;
		double vlrPgto = 0.00;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entrada 1:");
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		vlr1 = sc.nextDouble();
		System.out.println("");
		System.out.println("Entrada 2:");
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		vlr2 = sc.nextDouble();
		sc.close();
		
		
		vlrPgto = (num1 * vlr1) + (num2 * vlr2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", vlrPgto);
	}
}
