import java.util.Scanner;

public class exercicioFOR06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o valor de N");
		n = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
	}
}
