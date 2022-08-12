package br.com.alura;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario>{

	@Override
	public int compare(Funcionario funcionario, Funcionario outro) {
		
		return funcionario.getIdade() - outro.getIdade();
	}
}