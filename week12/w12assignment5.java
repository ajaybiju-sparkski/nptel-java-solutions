import java.util.Scanner;

public class W12_P5 {

  private static final int ROWS = 3;
  private static final int COLS = 3;

  private static char[][] board = new char[ROWS][COLS];

  private static void initializeBoard() {
    for (int i = 0; i < ROWS; i++) {
      for (int j = 0; j < COLS; j++) {
        board[i][j] = '-';
      }
    }
  }

  private static void printBoard() {
    System.out.println("-------------");
    for (int i = 0; i < ROWS; i++) {
      System.out.print("| ");
      for (int j = 0; j < COLS; j++) {
        System.out.print(board[i][j] + " | ");
      }
      System.out.println();
      System.out.println("-------------");
    }
  }

  private static void inputBoard(Scanner scanner) {
    for (int i = 0; i < ROWS; i++) {
      String line = scanner.nextLine();
      String[] cells = line.split(" ");
      for (int j = 0; j < COLS; j++) {
        board[i][j] = cells[j].charAt(0);
      }
    }
  }

  private static void printWinner(boolean gameWon, char winner) {
    // Print result
    if (gameWon) {
      System.out.print("Player " + winner + " wins!");
    } else {
      System.out.print("It's a draw!");
    }
  }

  public static void main(String[] args) {
    boolean gameWon = false;
    char winner = '-';

    Scanner scanner = new Scanner(System.in);

    initializeBoard();
    inputBoard(scanner);
    printBoard();

  for (int i = 0; i < ROWS; i++) {
  char temp = board[i][0];
  boolean win = true;
      for (int j = 0; j < COLS; j++) {
        if ( board[i][j] != temp )
          win = false;
      }
  if ( win == true ){
    gameWon = true;
    winner = board[i][0];
    break;
  }
}
for (int i = 0; i < COLS; i++) {
  char temp = board[0][i];
  boolean win = true;
      for (int j = 0; j < ROWS; j++) {
        if ( board[j][i] != temp )
          win = false;
      }
  if ( win == true ){
    gameWon = true;
    winner = board[0][i];
    break;
  }
}
 
if ( board[0][0] == board[1][1] && board[1][1] == board[2][2] ){
  gameWon = true;
  winner = board[0][0];
}
if ( board[0][2] == board[1][1] && board[1][1] == board[2][0] ){
  gameWon = true;
  winner = board[1][1];
}

  printWinner(gameWon, winner);
    scanner.close();
  }
}
