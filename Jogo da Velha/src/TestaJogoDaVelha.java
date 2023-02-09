import java.util.Scanner;

public class TestaJogoDaVelha {
  static Scanner sc = new Scanner(System.in);
  static char[][] board = new char[3][3];
  static boolean xTurn = true;

  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = ' ';
      }
    }

    while (true) {
      printBoard();
      if (checkWin('X')) {
        System.out.println("X wins!");
        break;
      } else if (checkWin('O')) {
        System.out.println("O wins!");
        break;
      } else if (checkDraw()) {
        System.out.println("Draw.");
        break;
      }
      getMove();
    }
  }

  static void printBoard() {
    System.out.println("  0 1 2");
    for (int i = 0; i < 3; i++) {
      System.out.print(i + " ");
      for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  static void getMove() {
    int x, y;
    char player = xTurn ? 'X' : 'O';
    System.out.print(player + "'s turn. Enter row and column (e.g. 1 2): ");
    x = sc.nextInt();
    y = sc.nextInt();
    if (board[x][y] == ' ') {
      board[x][y] = player;
      xTurn = !xTurn;
    } else {
      System.out.println("Space already occupied.");
    }
  }

  static boolean checkWin(char player) {
    for (int i = 0; i < 3; i++) {
      if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
        return true;
      }
    }
    for (int i = 0; i < 3; i++) {
      if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
        return true;
      }
    }
    if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
      return true;
    }
    if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
      return true;
    }
    return false;
  }

  static boolean checkDraw() {
	    for (int i = 0; i < 3; i++) {
	      for (int j = 0; j < 3; j++) {
	        if (board[i][j] == ' ') {
	          return false;
	        }
	      }
	    }
	    return true;
	  }
}