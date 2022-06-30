package Exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoLinguagensProgramacao {

    public static void main(String[] args) {
        List<String> linguagens = new ArrayList<String>();
        linguagens.add("C");
        linguagens.add("C++");
        linguagens.add("C#");
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("JavaScript");
        linguagens.add("PHP");
        linguagens.add("TypeScript");
        linguagens.add("Swift");
        linguagens.add("Go");

        System.out.println("Lista com as linguagens de programação:");
        linguagens.forEach(System.out::println);

        System.out.println();

        linguagens.sort(Comparator.comparing(String::length));

        System.out.println("Lista organizada por ordem crescente:");

        linguagens.forEach(System.out::println);
    }
}