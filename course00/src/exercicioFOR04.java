import java.util.Scanner;

public class exercicioFOR04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int a = 0;
		int b = 0;
		double resultado = 0.0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o valor de N");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Digite os pares");
			a = sc.nextInt();
			b = sc.nextInt();
			if(b == 0) {
				System.out.println("Divisão Impossível");
			}else {
				resultado = a / b ;
				System.out.println("Resultado: " + resultado);
			}
		}
		sc.close();
	}
}
