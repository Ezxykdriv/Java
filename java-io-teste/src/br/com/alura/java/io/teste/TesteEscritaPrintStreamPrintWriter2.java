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

public class TesteEscritaPrintStreamPrintWriter2 {

    public static void main(String[] args) throws IOException {
    	
    	PrintWriter ps = new PrintWriter("teste.txt");

    	ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
    	ps.print("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

    	ps.close();
    }
}