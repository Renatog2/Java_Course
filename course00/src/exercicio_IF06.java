import java.util.Locale;
import java.util.Scanner;

public class exercicio_IF06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Double vlr = 0.00;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o Valor:");
		vlr = sc.nextDouble();
		sc.close();
		
		if(vlr > 0 && vlr <= 25) {
			System.out.println("Intervalor [0,25]");
		} else if (vlr > 25 && vlr <= 50) {
			System.out.println("Intervalor [25,50]");
		} else if (vlr > 50 && vlr <= 75) {
			System.out.println("Intervalor [50,75]");
		} else if (vlr > 75 && vlr <= 100) {
			System.out.println("Intervalor [75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
	}
}
