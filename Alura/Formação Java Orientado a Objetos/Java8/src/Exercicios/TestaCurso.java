package Exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaCurso {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparingInt(Curso::getQtdAlunos));
		cursos.forEach(curso -> System.out.println(curso.getNome()));
		System.out.println();
		
		cursos.stream().filter(curso -> curso.getQtdAlunos() > 50).forEach(curso -> System.out.println(curso.getNome()));
		System.out.println();
		
		Stream<String> map = cursos.stream().map(Curso::getNome);
		
		cursos.stream().filter(curso -> curso.getQtdAlunos() > 50).map(Curso::getQtdAlunos).forEach(System.out::println);
		System.out.println();
		
		//Retornando o primeiro elemento do Stream
		cursos.stream().filter(curso -> curso.getQtdAlunos() > 50).findFirst();
		
		//Trabalhando com Optional
		Optional<Curso> findFirst = cursos.stream().filter(curso -> curso.getQtdAlunos() > 50).findFirst();
		
		//Calculando média de quantidade de alunos
		OptionalDouble media = cursos.stream().mapToInt(Curso::getQtdAlunos).average();
		System.out.println(media);
		System.out.println();
		
		//Coletando o resultado do stream em uma List
		List<Curso> lista = cursos.stream().filter(curso -> curso.getQtdAlunos() > 50).collect(Collectors.toList());
		lista.forEach(c -> System.out.println(c.getNome()));
		System.out.println();
		
		//Coletando o resultado do stream em uma List
		cursos = cursos.stream().filter(curso -> curso.getQtdAlunos() > 50).collect(Collectors.toList());
		cursos.forEach(c -> System.out.println(c.getNome()));
		
	}

}