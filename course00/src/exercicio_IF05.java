import java.util.Locale;
import java.util.Scanner;

public class exercicio_IF05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int cod = 0;
		int qtd = 0;
		Double vlr = 0.00;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Codigo e a Quantidade:");
		cod = sc.nextInt();
		qtd = sc.nextInt();
		sc.close();
		
		
		if(cod == 1) {
			vlr =  qtd * 4.00;
		} else if (cod == 2) {
			vlr =  qtd * 4.50;
		} else if (cod == 3) {
			vlr =  qtd * 5.00;
		} else if (cod == 4) {
			vlr =  qtd * 2.00;
		} else {
			vlr =  qtd * 1.50;
		}
		System.out.printf("Total : R$ %.2f", vlr);
	}
}
