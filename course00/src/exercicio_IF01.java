import java.util.Scanner;

public class exercicio_IF01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o número:");
		num = sc.nextInt();
		sc.close();
		
		if(num < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}
	}
}
