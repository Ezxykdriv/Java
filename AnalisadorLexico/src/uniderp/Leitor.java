package uniderp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Leitor {

	private ArrayList<String> texto;
	private ArrayList<Character> alfabeto;

	Leitor() {
		this.texto = new ArrayList<String>();
		this.alfabeto = new ArrayList<Character>();
	}

	public ArrayList<String> lerArquivo() {

		try {

			FileReader leitor = new FileReader("exemplo.txt");

			BufferedReader buffer = new BufferedReader(leitor);

			String linha;

			while ((linha = buffer.readLine()) != null) {
				texto.add(linha);
			}
			buffer.close();
			leitor.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return texto;
	}

	public ArrayList<Character> lerAlfabeto() {

		try {
			FileReader leitor = new FileReader("alfabeto.txt");

			BufferedReader buffer = new BufferedReader(leitor);

			String linha;

			while ((linha = buffer.readLine()) != null) {
				for (Character c : linha.toCharArray()) {
					if (c != null)
						alfabeto.add(c);
				}
			}
			buffer.close();
			leitor.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return alfabeto;
	}
}