package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
		File file = new File("D:\\Projects\\Java_Course\\course17\\Arq.txt");
		
		try {
			sc = new Scanner(file);
			
			// Enquanto houver uma proxima linha no arquivo irá continuar nesse bloco while
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		
		// Fechar o Scanner tendo sucesso ou não
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
