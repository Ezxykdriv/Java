package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TestaCursos {

	public static void main(String[] args) {

		List<Cursos> cursos = new ArrayList();
		
		cursos.add(new Cursos("Python", 45));
		cursos.add(new Cursos("Java 8", 113));
		cursos.add(new Cursos("JavaScript", 150));
		cursos.add(new Cursos("C", 55));
		
		cursos.sort(Comparator.comparing(Cursos::getAlunos));
		cursos.forEach(c -> System.out.println(c.getNome() + "," + c.getAlunos()));
		System.out.println();
		
		cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));
		System.out.println();
		
		Stream<String> nomes = cursos.stream().map(Cursos::getNome);
		System.out.println();
		
		cursos.stream().filter(c -> c.getAlunos() > 50).map(c -> c.getAlunos()).forEach(x -> System.out.println(x));
		System.out.println();
		
		cursos.stream().filter(c -> c.getAlunos() > 50).map(Cursos::getAlunos).forEach(System.out::println);
	}

}
