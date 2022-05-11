package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class Exercicio {

	public static void main(String[] args) {

		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(1, "Cleiton");
		pessoas.put(8, "Robson");
		pessoas.put(3, "Adilson");
		pessoas.put(4, "Edimilson");
		
		pessoas.keySet().forEach(idade ->{
			System.out.println(pessoas.get(idade));
		});
		
	}
}