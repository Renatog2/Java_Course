package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> product = new ArrayList<>();
		
		// D:\Projects\Java_Course\course17_exerc1\Input.txt
		System.out.println("Enter a file path: ");
		String path = sc.nextLine();
		File file = new File(path);
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			
			// Leitura dos dados
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				product.add(new Product(name, price, quantity));
				line = br.readLine();
			}
			
			// Criar o arquivo e pasta de saída
			new File(file.getParent() + "\\Out").mkdir();
			String target = file.getParent() + "\\Out\\summary.csv";
			
			// Escrever o arquivo de saída
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(target))) {
				for(Product products : product) {
					bw.write(products.getName() +","+ String.format("%.2f", products.total()));
					bw.newLine();
				}
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(sc != null) {
				System.out.println("Program End");
				sc.close();
			}
		}
	}
}
