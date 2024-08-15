import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double raio = 0.00;
		Double pi = 3.14159;
		Double area = 0.00;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do Raio: ");
		raio = sc.nextDouble();
		sc.close();
		
		area = pi * (raio * raio);
		
		System.out.printf("A = %.4f", area);
	}
}
