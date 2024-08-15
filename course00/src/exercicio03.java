import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int produto = 0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		B = sc.nextInt();
		System.out.println("Digite o valor de C: ");
		C = sc.nextInt();
		System.out.println("Digite o valor de D: ");
		D = sc.nextInt();
		sc.close();
		
		produto = (A * B) - (C * D);
		
		System.out.printf("DIFERENCA = %d", produto);
	}
}
