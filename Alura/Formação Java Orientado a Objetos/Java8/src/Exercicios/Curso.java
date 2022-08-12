package Exercicios;

public class Curso {

	private String nome;
	private int qtdAlunos;
	
	public Curso(String nome, int qtdAlunos) {
		this.nome = nome;
		this.qtdAlunos = qtdAlunos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getQtdAlunos() {
		return qtdAlunos;
	}
}
