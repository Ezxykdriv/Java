package br.com.bytebank.banco.test.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] referencias= new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(01, 01);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(01, 02);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias [2] = cliente;
		
		//System.out.println(contas[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca)referencias[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}
}