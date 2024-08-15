import java.util.Scanner;

public class exercicioWHILE01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int senha = 0;
		Scanner sc = new Scanner(System.in);
		
		
		senha = sc.nextInt();
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		sc.close();
		
		
		System.out.println("Acesso Permitido");
	}
}
