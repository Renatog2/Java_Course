package application;

import java.io.File;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		// Obtem apenas o nome do arquivo ou da ultima pasta no caminho que foi passado acima
		System.out.println("getName: " + path.getName());
		// Obtem o caminho do arquivo ou antes da ultima pasta que foi passado acima
		System.out.println("getParent: " + path.getParent());
		// Repassa o caminho completo igual como foi digitado
		System.out.println("getPath: " + path.getPath());
		
		
		sc.close();
	}
}
