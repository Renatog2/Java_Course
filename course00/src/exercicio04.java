import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int num = 0;
		int horas = 0;
		Double valor = 0.00;
		Double salario = 0.00;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o Nº do Funcionário:");
		num = sc.nextInt();
		System.out.println("Digite as Horas Trabalhadas:");
		horas = sc.nextInt();
		System.out.println("Digite o valor da Hora:");
		valor = sc.nextDouble();
		sc.close();

		salario = horas * valor;
		System.out.printf("NUMBER = %d%n", num);
		System.out.printf("SALARY = U$ %.2f", salario);
	}
}
