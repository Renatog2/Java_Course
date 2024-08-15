import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1 = 0;
		int valor2 = 0;
		int result = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o 1º número:");
		valor1 = sc.nextInt();
		System.out.println("Digite o 2º número:");
		valor2 = sc.nextInt();
		sc.close();
		
		result = valor1 + valor2;
		System.out.printf("SOMA = %d", result);
	}
}
