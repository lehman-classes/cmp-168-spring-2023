import java.util.Scanner;

public class Driver_TicTacToe {

  public static void main(String[] args) {

    TicTacToe game = new TicTacToe();
    Scanner input = new Scanner(System.in);
    game.displayBoard();

    while (!game.isWinner() && !game.isDraw()) {
      game.changeTurn();
      System.out.print("Enter row index: ");
      int rowIndex = input.nextInt();
      System.out.print("Enter column index: ");
      int colIndex = input.nextInt();
      game.placeMarker(rowIndex, colIndex);

      game.displayBoard();
    }
    input.close();
  }

}
