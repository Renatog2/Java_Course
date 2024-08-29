package application;

import java.io.File;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		// Todas as patas do caminho digitado serão gravados no vetor abaixo
		File [] folders = path.listFiles(File::isDirectory);
		// Todas os arquivos do caminho digitado serão gravados no vetor abaixo
		File [] files = path.listFiles(File::isFile);

		System.out.println();
		System.out.println("= = = FOLDERS = = =");
		for (File folder : folders) {
			System.out.println(folder);
		}

		System.out.println();
		System.out.println("= = = FILES = = =");
		for (File file : files) {
			System.out.println(file);
		}

		System.out.println();
		System.out.println("= = = FILES = = =");
		// Esse comando vai criar uma pasta no caminho passado anteriormente, vai retornar false caso a pasta já exista
		boolean success = new File(strPath + "\\subPaste").mkdir();
		System.out.println("Directory created: " + success);
		
		
		sc.close();
	}

}
