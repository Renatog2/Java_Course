import java.util.Scanner;

public class exercicio_IF03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 0;
		int B = 0;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Digite os números:");
		A = sc.nextInt();
		B = sc.nextInt();
		sc.close();
		
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
	}
}
