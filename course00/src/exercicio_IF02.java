import java.util.Scanner;

public class exercicio_IF02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Digite o número:");
		num = sc.nextInt();
		sc.close();
		
		
		if (num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
	}
}
