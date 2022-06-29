package uniderp;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;

public class App {
	public static void main(String[] args) throws Exception {

		Leitor leitor = new Leitor();

		int contErr = 0;
		int linha = 0;
		ArrayList<Integer> errLinhaInt = new ArrayList<Integer>();

		Map<Integer, String> mapaErrLinhaTxt = new TreeMap<Integer, String>();
		Map<Integer, Boolean> multiplos = new TreeMap<Integer, Boolean>();
		Map<Integer, ArrayList<Character>> mapaErros = new TreeMap<Integer, ArrayList<Character>>();

		ArrayList<Character> alfabeto = leitor.lerAlfabeto();
		ArrayList<String> texto = leitor.lerArquivo();

		for (Character c : alfabeto) {
			System.out.println(c);
		}

		for (String s : texto) {
			if (s != null) {
				linha++;
				for (Character c : s.toCharArray()) {
					if (c != null && c != 'Â') {
						if (alfabeto.contains(c)) {
						} else {
							contErr++;
							if (!errLinhaInt.contains(linha)) {
								errLinhaInt.add(linha);
							}

							if (mapaErrLinhaTxt.get(linha) == null) {
								mapaErrLinhaTxt.put(linha, s.replace("Â", ""));
								mapaErros.put(linha, new ArrayList<Character>());
								mapaErros.get(linha).add(c);
								multiplos.put(linha, false);
							} else {
								multiplos.put(linha, true);
								mapaErros.get(linha).add(c);
							}
						}
					}
				}
			}
		}

		if (contErr != 0) {
			System.out.println("Número de erros encontrados = " + contErr + "!");
			for (int i = 0; i < errLinhaInt.size(); i++) {
				String msg = "Erro na linha de nº: " + errLinhaInt.get(i) + ", " + '"'
						+ mapaErrLinhaTxt.get(errLinhaInt.get(i)) + '"';
				if (multiplos.get(errLinhaInt.get(i)) == true) {
					msg += " nos caracteres: ";
				} else {
					msg += " no caractere: ";
				}
				msg += mapaErros.get(errLinhaInt.get(i)).toString();
				System.out.println(msg);
			}
		} else {
			System.out.println("Nenhum erro encontrado!");
		}

	}
}