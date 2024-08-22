package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archive {

	public static void main(String[] args) {
		File correctfile = new File("D:\\text.txt");
		//File incorretFile = new File("D:\\text2.txt");
		Scanner sc = null;
		
		//Exemplo onde o arquivo existe e é lido e onde não existe e não é lido, devidamente tratado no Try Catch
		try {
			sc = new Scanner(correctfile);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("End of program");
		}
	}
}
