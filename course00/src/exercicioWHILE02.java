import java.util.Scanner;

public class exercicioWHILE02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 99;
		int y = 99;
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Digite o valor das Coordenadas X, Y");
		x = sc.nextInt();
		y = sc.nextInt();*/
		while(x != 0 && y != 0){
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}else if (x < 0 && y > 0){
				System.out.println("segundo");
			}else if (x < 0 && y < 0){
				System.out.println("terceiro");
			}else if (x > 0 && y < 0){
				System.out.println("quarto");
			}
			System.out.println("Digite o valor das Coordenadas X, Y");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}
}
