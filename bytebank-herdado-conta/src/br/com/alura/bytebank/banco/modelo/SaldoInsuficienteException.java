package br.com.alura.bytebank.banco.modelo;

public class SaldoInsuficienteException extends Exception{ //checked
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
