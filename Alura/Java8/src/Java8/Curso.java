package Java8;

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
	
	@Override
	public String toString() {
		
		return this.getNome() + this.getQtdAlunos();
	}
}