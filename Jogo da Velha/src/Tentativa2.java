import java.util.Scanner;

public class Tentativa2 {
	static Scanner scanner = new Scanner(System.in);

	static class Tabuleiro {
		char[][] tabuleiro = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

		void mostrarTabuleiro() {
			System.out.println(" " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2]);
			System.out.println("---+---+---");
			System.out.println(" " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2]);
			System.out.println("---+---+---");
			System.out.println(" " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2]);
		}

		boolean jogar(int linha, int coluna, char jogador) {
			if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
				System.out.println("Posição inválida, escolha novamente.");
				return false;
			}
			if (tabuleiro[linha][coluna] != ' ') {
				System.out.println("Posição ocupada, escolha novamente.");
				return false;
			}
			tabuleiro[linha][coluna] = jogador;
			return true;
		}

		boolean verificarGanhador() {
	      for (int i = 0; i < 3; i++) {
	        if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][0] != ' ') {
	          return true;
	        }
	        if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i] && tabuleiro[0][i] != ' ') {
	          return true;
	        }
	      }
	      if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != ' ') {
	        return true;
	      }
	      if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != ' ') {
	        return true;
	      }
	      return false;
	    }

boolean verificarEmpate() {
	      for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j
