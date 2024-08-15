import java.util.Locale;
import java.util.Scanner;

public class exercicio_IF07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Double X = 0.0;
		Double Y = 0.0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite os valores de X e Y:");
		X = sc.nextDouble();
		Y = sc.nextDouble();
		sc.close();
		
		
		if(X == 0 && Y == 0) {
			System.out.println("Origem");
		} else if (X == 0) {
			System.out.println("Eixo X");
		} else if (Y == 0) {
			System.out.println("Eixo Y");
		} else if (X > 0) {
			if ( Y > 0) {
				System.out.println("Q1");
			} else {
				System.out.println("Q4");
			}
		} else {
			if ( Y > 0) {
				System.out.println("Q2");
			} else {
				System.out.println("Q3");
			}
		}
	}
}
