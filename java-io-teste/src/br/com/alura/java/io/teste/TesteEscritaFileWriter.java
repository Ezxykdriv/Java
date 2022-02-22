package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	    public static void main(String[] args) throws IOException {
	    	
	    	BufferedWriter bw = new BufferedWriter(new FileWriter("teste.txt"));

	        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
	        bw.write(System.lineSeparator());
	        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

	        bw.close();
	    }
	}
