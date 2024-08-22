package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		method();
	}
	
	
	public static void method() {
		System.out.println("METHOD START");
		
		method2();
		
		System.out.println("METHOD END");
	}
	
	
	public static void method2() {
		System.out.println("METHOD2 START");
		Scanner sc = new Scanner(System.in);
		
		/* No catch deve ser declarado o tipo de erro esperado na saída do programa, abaixo é previsto digitar uma posição errada no vetor e Caracteres
		 * quando se esperava um INT.
		 * O Finally vai ser executado tendo uma excessão tratada ou não, por exemplo ao escrever um arquivo se ocorrer um erro ou não ele vai precisar
		 * parar em algum momento para não gerar um bug de execução infinita.
		 */
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println("Position: " + vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
			
			//Esse comando vai fazer mostrar as chamadas em ordem que causaram o erro
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input!");
		} finally {
			System.out.println("End of Program");
		}

		System.out.println("METHOD2 END");
		
		
		sc.close();
	}
}
