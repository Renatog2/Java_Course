package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\Projects\\Java_Course\\course17\\Arq.txt";
		
		// Essa é uma implementação do Program2 porém com um código limpo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
				
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
