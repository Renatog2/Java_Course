import java.util.Scanner;

public class exercicioFOR02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int i = 0;
		int in = 0;
		int out = 0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o valor de N");
		n = sc.nextInt();
		for(int x = 0; x < n; x++) {
			System.out.println("Digite o " + (x + 1) + " valor");
			i = sc.nextInt();
			i = (i >= 10 && i <= 20)? in++ : out ++;
			i = 0;
		}
		sc.close();
		
		
		System.out.println("in: " + in);
		System.out.println("out: " + out);
	}
}
