package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Exercicios.Curso;

public class TestaCursos {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<>();
		
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getQtdAlunos));
		//cursos.forEach(System.out::println);
		cursos.forEach(c -> System.out.println(c.getNome()));
		System.out.println();
		
		//Filtrar e Imprimir os cursos com mais de 100 alunos.
		cursos.stream().filter(c -> c.getQtdAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
		System.out.println();
		
		//imprime a quantidade de alunos maiores que 100
		cursos.stream().filter(c -> c.getQtdAlunos() >= 100).map(Curso::getQtdAlunos).forEach(System.out::println);
		System.out.println();
		
		//filtrar os cursos que tem mais de 100 alunos e somando a quantidade de alunos dos mesmos
		int sum = cursos.stream().filter(c -> c.getQtdAlunos() >= 100).mapToInt(Curso::getQtdAlunos).sum();
		System.out.println(sum);
		System.out.println();
		
		//Optional<Curso> optionalCurso = cursos.stream().filter(c -> c.getQtdAlunos() >= 100).findAny();
		
		//Curso curso = optionalCurso.get();
		//System.out.println(curso.getNome());
		
		//optionalCurso.orElse(null);
		
		//optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		cursos.stream().filter(c -> c.getQtdAlunos() >= 100).findAny().ifPresent(c -> System.out.println(c.getNome()));
		System.out.println();
		
		OptionalDouble media = cursos.stream().filter(c -> c.getQtdAlunos() >= 100).mapToInt(Curso::getQtdAlunos).average();
		System.out.println(media);
		System.out.println();
		
		cursos = cursos.stream().filter(c -> c.getQtdAlunos() >= 100).collect(Collectors.toList());
		cursos.forEach(c -> System.out.println(c.getNome()));
		System.out.println();
		
		Map<String, Integer> mapa = cursos.stream().filter(c -> c.getQtdAlunos() >= 100).collect(Collectors.toMap(c -> c.getNome(), c -> c.getQtdAlunos()));
		System.out.println(mapa);
		System.out.println();
		
		cursos.stream().filter(c -> c.getQtdAlunos() >= 100).collect(Collectors.toMap(c -> c.getNome(), c -> c.getQtdAlunos())).forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
		System.out.println();
		
		cursos.parallelStream().filter(c -> c.getQtdAlunos() >= 100).collect(Collectors.toMap(c -> c.getNome(), c -> c.getQtdAlunos())).forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
	}

}