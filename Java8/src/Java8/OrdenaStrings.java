		//--------------------------01. Default Methods------------------------
package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("Matheus Falcão");
		palavras.add("Alura Online");
		palavras.add("Casa do Código");
		palavras.add("Caelum");
		
		//Maneiras de ordenar uma lista
		
		//Collections.sort
		System.out.println("Usando o Collections.sort");
		Collections.sort(palavras);
		System.out.println(palavras);
		System.out.println();
		
		//usando Comparator e ordenando pelo tamanho da String
		System.out.println("Usando Comparator e ordenando pelo tamanho da String");
		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		Collections.sort(palavras, comparador);
		System.out.println(palavras);
		System.out.println();
		
		//usando o metodo Sort da própria classe List
		System.out.println("Usando o metodo Sort da própria classe List");
		Comparator<String> compara = new ComparadorDeStringPorTamanho();
		palavras.sort(compara);
		System.out.println(palavras);
		System.out.println();
		
		//usando um forEach que recebe um Consumer
		System.out.println("Usando um forEach que recebe um Consumer");
		Consumer<String> consumidor = new ConsumidorDeString();
		palavras.forEach(consumidor);
		System.out.println();
		
		//--------------------------02. Que Venham os Lambdas!------------------------
		//usando Classes Anônimas e Lâmbdas no Java 8
		System.out.println("usando Classes Anônimas e Lâmbdas no Java 8");
		palavras.forEach(s -> System.out.println(s));
		System.out.println();
		
		//usando Intrfaces Funcionais e Lâmbdas no Java 8
		System.out.println("usando Intrfaces Funcionais e Lâmbdas no Java 8");
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(palavras);
		System.out.println();
		
		//exercício
		//new Thread(() -> System.out.println("Executando um Runnable")).start();
		
		//--------------------------03. Código mais sucinto com Method References------------------------
		System.out.println("comparator");
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(palavras);
		System.out.println();
	}

}

class ComparadorDeStringPorTamanho implements Comparator<String>{
	public int compare(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return 1;
		}else if (s1.length() < s2.length()) {
			return -1;
		}else {
			return 0;
		}
	}
}

class ConsumidorDeString implements Consumer<String>{
	public void accept(String s) {
		System.out.println(s);
	}
}