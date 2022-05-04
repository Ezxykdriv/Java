package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		//Set<String> alunos = new HashSet<>();
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Matheus Falcão");
		alunos.add("Matheus Falcão");
		alunos.add("Matheus Souza Santos");
		alunos.add("Lucca Tampico");
		alunos.add("Sergio do Berrante");
		alunos.add("Klebinho");
		alunos.add("Tiringa");
		alunos.add("Maria");
		alunos.add("Mayara");
		
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno->{System.out.println(aluno);});
		
		System.out.println(alunos.size());
		
		boolean alunoMatriculado = alunos.contains("Matheus Falcão");
		System.out.println(alunoMatriculado);
		
		List<String>alunosListados = new ArrayList<>(alunos);
		alunosListados.forEach(aluno->{System.out.println(aluno);});
		
		for (String aluno : alunosListados) {
			System.out.println(aluno);
		}
		
		boolean adicionou = alunos.add("Matheus Falcão");
		System.out.println("Matheus Falcão foi adicionado ao Set? " + adicionou);
	}

}
