package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com arquivo
		
//		OutputStream fos = new FileOutputStream("teste2.txt");
//		
//		Writer osw = new OutputStreamWriter(fos);
//		
//		BufferedWriter bw = new BufferedWriter(osw);
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("teste2.txt"));
		
		bw.write("A soma dos quadrados dos catetos é igual ao quadrado da hipotenusa");		
		bw.newLine();
		bw.newLine();
		bw.write("with the light out, is less dangerous, here we are now, entertain us");	
		
		bw.close();
	}


}
