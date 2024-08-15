import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x;
		char y;
		String z;
		
		
		/* Caso seja para obter algo diferente de String se usa sc.next(tipo de variável), exemplo:
		 * sc.nextInt
		 * sc.nextDouble
		 * */
		x = sc.next();
		/* Esse aqui vai pegar apenas a primeira letra digitada*/
		y = sc.next().charAt(0);
		/* Colocar nextLine faz pegar a linha inteira não só a primeira palavra
		 * No caso aqui tem um sc.nextLine() sozinho para que quando dou o enter para os anteriores eu consiga ler a proxima linha
		 * */
		sc.nextLine();
		z = sc.nextLine();
		
		
		System.out.println("Digitou String: " + x);
		System.out.println("Digitou char: " + y);
		System.out.println("Digitou String na outra linha: " + z);
		sc.close();
	}
}