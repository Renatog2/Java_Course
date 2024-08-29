package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] lines = new String[] {"Hello", "!!!", "End"};
		
		String path = "D:\\Projects\\Java_Course\\course17\\ArqWriter.txt";
		
		/* True no FileWriter indica que eu não quero recriar o arquivo, assim ele irá pegar o arquivo já existe e simplesmente adicionar mais 
		 * linhas mantendo o conteúdo anterior*/
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
