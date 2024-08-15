import java.util.Scanner;

public class exercicio_IF04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horaIni = 0;
		int horaFim = 0;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a duração:");
		horaIni = sc.nextInt();
		horaFim = sc.nextInt();
		sc.close();
		
		
		if(horaIni > 12 || horaIni == 0) {
			horaFim = horaFim + 24;
			total = horaFim - horaIni;
			System.out.println("O JOGO DUROU " + total + " HORA(S)");
		}else {
			total = horaFim - horaIni;
			System.out.println("O JOGO DUROU " + total + " HORA(S)");
		}
	}
}
