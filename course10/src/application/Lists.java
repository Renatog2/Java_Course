package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//Adiciona na posição 2 da lista (Começa com zero igual Vetor)
		list.add(2, "Marco");
		
		//Tamanho da lista
		System.out.println(list.size());
		
		//Percorrer
		for (String x:list) {
			System.out.println(x);
		}
		System.out.println("---------------");
		
		//Remover da lista pela primeira letra ser igual a M
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x:list) {
			System.out.println(x);
		}
		System.out.println("---------------");
		
		//Retorna a posição do primeiro elemento igual na lista
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		//Nesse caso não vai encontrar e vai imprimir -1
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------");
		
		//Aqui vai filtrar todos que começam com a Letra A na lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x:result) {
			System.out.println(x);
		}
		System.out.println("---------------");
		
		//Vai procurar o primeiro elemento que começa com J, se não encontrar retorna NULL
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}
