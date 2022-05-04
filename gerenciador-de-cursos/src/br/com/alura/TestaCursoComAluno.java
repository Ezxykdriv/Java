package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Matheus Falcão");
		
		javaColecoes.adiciona(new Aula("Trabalhado com ArrayLista", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		Aluno a1 = new Aluno("Cleiton", 1);
		Aluno a2 = new Aluno("José", 2);
		Aluno a3 = new Aluno("Joaquim", 3);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		javaColecoes.getAlunos().forEach(aluno ->{
			System.out.println(aluno);
		});
		
		System.out.println();
		
		javaColecoes.getAulas().forEach(aula ->{
			System.out.println(aula);
		});		
		
		System.out.println();
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);// utilizado para programação paralela, com threads
		System.out.println(alunosSincronizados);
		
	}

}
