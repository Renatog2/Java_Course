import java.util.Locale;
import java.util.Scanner;

public class exercicio_IF08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		double salario = 0.00;
		double taxa = 0.00;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o Salário: ");
		salario = sc.nextDouble();
		sc.close();
		
		
		if(salario <= 2000) {
			System.out.printf("Isento");
		}else if(salario <= 3000) {
			taxa = (salario - 2000) * 0.08;
			System.out.printf("%.2f", taxa);
		}else if(salario <= 4500) {
			taxa = (3000 - 2000) * 0.08;
			taxa = taxa + ((salario - 3000) * 0.18);
			System.out.printf("%.2f", taxa);
		}else{
			taxa = (3000 - 2000) * 0.08;
			taxa = taxa + ((4500 - 3000) * 0.18);
			taxa = taxa + ((salario - 4500) * 0.28);
			System.out.printf("%.2f", taxa);
		}
	}
}
